// 12ms(10.2~15.0)
import java.util.StringTokenizer
class Solution { fun solution(s: String): String {
    val st = StringTokenizer(s, " ")
    val a = st.nextToken().toInt()
    var mn = a
    var mx = a
    while (st.hasMoreTokens()) {
        val n = st.nextToken().toInt()
        if (n < mn) mn = n
        else if (n > mx) mx = n
    }
    return "$mn $mx"
} }  // 참고, 38min

//// 17ms(16.2~20.5)
//class Solution { fun solution(s: String): String {
//    val lst = s.split(' ')
//    val a = lst[0].toInt()
//    var mn = a
//    var mx = a
//    lst.forEach {
//        val n = it.toInt()
//        if (n < mn) mn = n
//        else if (n > mx) mx = n
//    }
//    return "$mn $mx"
//} }  // 25min

//// 23ms(20.5~29.8)
//class Solution { fun solution(s: String): String {
//    val aa = s.split(' ').map { it.toInt() }
//    var min = aa[0]
//    var max = aa[0]
//    aa.forEach {
//        if (it < min) min = it
//        else if (it > max) max = it
//    }
//    return "$min $max"
//} }  // 21min

//// 27ms(23.2~32.2)
//class Solution { fun solution(s: String) = s.split(' ').map { it.toInt() }.run { "${minOrNull()} ${maxOrNull()}" } }  // 12min

fun main() {
    val arr = arrayOf(
        "1 2 3 4",
        "-1 -2 -3 -4",
        "-1 -1",
    )
    /*
    "1 4"
    "-4 -1"
    "-1 -1"
     */
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12939
