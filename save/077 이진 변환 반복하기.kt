// 7.2ms(2,9~11)(0.76~8.0)
class Solution { fun solution(s: String): IntArray {
    var ss = s
    val ans = IntArray(2)
    while (ss.length > 1) {
        val zeros = ss.count { it == '0' }
        ans[1] += zeros
        ++ans[0]
        ss = (ss.length - zeros).toString(2)
    }
    return ans
} }  //22min

fun main() {
    val arr = arrayOf(
        "110010101001",
        "01110",
        "1111111",
    )
    /*
    [3,8]
    [3,3]
    [4,1]
     */
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i)
        println(ans.contentToString())
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/70129
