class Solution { fun solution(x: Int): Boolean =
    x % x.toString().sumOf { it - '0' } == 0
}

//class Solution { fun solution(x: Int): Boolean {
//    val s = x.toString()
//    var ds = 0
//    for (c in s) ds += c - '0'
//    if (x % ds == 0) return true
//    return false }
//}

fun main() {
    val s = Solution()
    for (i in intArrayOf(10, 12, 11, 13)) {  // TTFF
        val ans = s.solution(i)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12947
