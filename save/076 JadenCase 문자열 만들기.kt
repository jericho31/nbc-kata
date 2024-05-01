// 0.06ms(0.03~0.13)
class Solution { fun solution(s: String): String {
    val sb = StringBuilder(s.length)
    var flag = true
    for (c in s) {
        if (flag) sb.append(c.titlecaseChar())
        else sb.append(c.lowercaseChar())
        flag = c == ' '
    }
    return sb.toString()
} }  // 31min

fun main() {
    val arr = arrayOf(
        "3people unFollowed me",
        "for the last week",
    )
    /*
    "3people Unfollowed Me"
    "For The Last Week"
     */
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12951
