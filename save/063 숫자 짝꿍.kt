// 7ms, 60~70ms
class Solution { fun solution(X: String, Y: String): String {
    val cnt1 = IntArray(10)
    val cnt2 = IntArray(10)
    for (c in X) ++cnt1[c - '0']
    for (c in Y) ++cnt2[c - '0']
    val sb = StringBuilder()
    for (i in 9 downTo 0) {
        val n = if (cnt1[i] < cnt2[i]) cnt1[i] else cnt2[i]
        sb.append(CharArray(n) { '0' + i })
    }
    return if (sb.isEmpty()) "-1" else if (sb.first() == '0') "0" else sb.toString() }
}  // 15min

fun main() {
    val arr = arrayOf(
        Pair("100", "2345"),
        Pair("100", "203045"),
        Pair("100", "123450"),
        Pair("12321", "42531"),
        Pair("5525", "1255"),
    )
    // -1, 0, 10, 321, 552
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i.first, i.second)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/131128
