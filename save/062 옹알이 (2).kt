//// 타인 풀이 2. 0.2ms
//class Solution {
//    private val ableRegex = "aya|ye|woo|ma".toRegex()
//    private val unableRegex = "ayaaya|yeye|woowoo|mama".toRegex()
//    fun solution(babbling: Array<String>): Int =
//        babbling.count {
//            !it.contains(unableRegex) && it.replace(ableRegex, "").isEmpty()
//        }
//}

//// 타인 풀이. 정규식. 2ms...이었는데 정규식을 클래스 변수로 빼니까 0.2ms
//class Solution {
//    private val regex = "^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$".toRegex()
//    fun solution(babbling: Array<String>) = babbling.count { it.matches(regex) }
//}

// (16~20ms)(14~23)
class Solution { fun solution(babbling: Array<String>): Int {
    val words = arrayOf("aya", "ye", "woo", "ma")
    var ans = 0
    for (v in babbling) {
        var s = 0
        var e = 2
        var before = ""
        while (e <= v.length) {
            var sub = v.substring(s, e)
            if (sub == before) break
            if (sub in words) {
                if (e == v.length) { ++ans; break }
                before = sub
                s = e
                e += 2
                continue
            }

            if (++e > v.length) break
            sub = v.substring(s, e)
            if (sub == before || sub !in words) break
            if (e == v.length) { ++ans; break }
            before = sub
            s = e
            e += 2
        }
    }
    return ans }
}  // 60min

fun main() {
    val arr = arrayOf(
        arrayOf("aya", "yee", "u", "maa"),
        arrayOf("ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"),
    )
    // 1, 2
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i)
        println(ans)
//        println("============")  //ddd
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/133499
