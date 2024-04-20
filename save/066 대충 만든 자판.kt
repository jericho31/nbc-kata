// 아... 몇번 키를 몇번 누르는 지가 아니라 전체 누르는 횟수구나... 맵을 쓸 필요가 없구나...
// 몇번 키 몇번이더라도 맵이 아니라 array로 하는 게 빠름. 불특정 키가 아니라 알파벳 26개로 정해져있어서.
// 0.5ms(0.02 ~ 0.70)
class Solution { fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
    val minCnt = IntArray(26) { 127 }
    keymap.forEach { str ->
        str.forEachIndexed { i, c ->
            if (i + 1 < minCnt[c - 'A']) {
                minCnt[c - 'A'] = i + 1
            }
        }
    }

    val ans = IntArray(targets.size)
    targets.forEachIndexed { i, str ->
        var cnt = 0
        for (c in str) {
            if (minCnt[c - 'A'] == 127) {
                cnt = -1
                break
            }
            cnt += minCnt[c - 'A']
        }
        ans[i] = cnt
    }
    return ans
} }  // 참고, 80min

//// 1.5ms(0.4 ~ 2.8)
//class Solution { fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
//    val km = hashMapOf<Char, Pair<Int, Int>>()
//    keymap.forEachIndexed { keyNum, str ->
//        str.forEachIndexed { i, c ->
//            val curMin = km[c]?.second ?: 0x8000
//            if (i + 1 < curMin) {
//                km[c] = Pair(keyNum, i + 1)
//            }
//        }
//    }
//
//    val ans = IntArray(targets.size) { -1 }
//    targets.forEachIndexed { i, str ->
//        var cnt = 0
//        for (c in str) {
//            val n = km[c]?.second
//            if (n == null) {
//                cnt = -1
//                break
//            }
//            cnt += n
//        }
//        ans[i] = cnt
//    }
//    return ans
//} }

//// 왜 map 후 toIntArray 하는 걸 처음부터 IntArray로 바꿔주는 것만으로 속도가 4배가 되지...?
//// 2ms(0.5 ~ 3.6)
//class Solution { fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
//    val km = hashMapOf<Char, Pair<Int, Int>>()
//    keymap.forEachIndexed { keyNum, str ->
//        str.forEachIndexed { i, c ->
//            val curMin = km[c]?.second ?: 0x8000
//            if (i + 1 < curMin) {
//                km[c] = Pair(keyNum, i + 1)
//            }
//        }
//    }
//
//    val ans = IntArray(targets.size)
//    targets.forEachIndexed { i, str ->
//        try {
//            ans[i] = str.sumOf { km[it]!!.second }
//        } catch (_: Throwable) {
//            ans[i] = -1
//        }
//    }
//    return ans
//} }  // 참고, 57min

//// 8ms(6.2 ~ 12.1)
//class Solution { fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
//    val km = mutableMapOf<Char, Pair<Int, Int>>()
//    keymap.forEachIndexed { keyNum, str ->
//        str.forEachIndexed { i, c ->
//            val curMin = km[c]?.second ?: 0x8000
//            if (i + 1 < curMin) {
//                km[c] = Pair(keyNum, i + 1)
//            }
//        }
//    }
//
//    return targets.map { str ->
//        try {
//            str.sumOf { km[it]!!.second }
//        } catch (_: Throwable) {
//            -1
//        }
//    }.toIntArray()
//} }  // 29min

fun main() {
    val arr = arrayOf(
        Pair(arrayOf("ABACD", "BCEFD"), arrayOf("ABCD", "AABB")),
        Pair(arrayOf("AA"), arrayOf("B")),
        Pair(arrayOf("AGZ", "BSSS"), arrayOf("ASA", "BGZ")),
    )
    /*
    9, 4
    -1
    4, 6
     */
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i.first, i.second)
        println(ans.contentToString())
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/160586
