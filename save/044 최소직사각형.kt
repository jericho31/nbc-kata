class Solution { fun solution(sizes: Array<IntArray>): Int {
    var a = 0
    var b = 0
    sizes.forEach {
        if (it[0] > it[1]) {
            if (a < it[0]) a = it[0]
            if (b < it[1]) b = it[1]
        } else {
            if (a < it[1]) a = it[1]
            if (b < it[0]) b = it[0]
        } }
    return a * b }
}

//// 프로그래머스 왜 max, min이 unresolved지?
//class Solution { fun solution(sizes: Array<IntArray>): Int {
//    var a = 0
//    var b = 0
//    sizes.forEach {
//        if (a < it.max()) a = it.max()  // 성능을 버리고 간결함을 취한다
//        if (b < it.min()) b = it.min()
//    }
//    return a * b }
//}

fun main() {
    val arr = arrayOf(
        arrayOf(intArrayOf(60, 50), intArrayOf(30, 70), intArrayOf(60, 30), intArrayOf(80, 40)),
    )
    // 4000, 120, 133
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/86491?language=kotlin
