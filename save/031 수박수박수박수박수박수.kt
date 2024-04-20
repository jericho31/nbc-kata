class Solution { fun solution(n: Int): String =
    String(CharArray(n) { i -> if (i and 1 == 0) '수' else '박' })
}

//class Solution {
//    fun solution(n: Int): String {
//        val w = "수박"
//        var answer = ""
//        for (i in 0 until n / 2) {
//            answer += w
//        }
//        if (n % 2 != 0) answer += "수"
//        return answer
//    }
//}

fun main() {
    val s = Solution()
    val ans = s.solution(9)
    println(ans)
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12922
