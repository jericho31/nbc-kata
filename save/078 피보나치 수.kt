// 1.24, 1.12ms(13, 14)(나머지 0.01 수준)
class Solution { fun solution(n: Int): Int {
    var a = 1
    var b = 1
    if (n % 2 == 1) b = 2
    for (i in 2..n / 2) {
        a = (a + b) % 1234567
        b = (a + b) % 1234567
    }
    return b
} }  // 25min

fun main() {
    val arr = arrayOf(
        2, 3, 4, 5, 6, 7, 8, 9
    )
    /*
    1, 2, 3, 5, 8, 13, ...
     */
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12945
