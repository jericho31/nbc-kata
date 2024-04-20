class Solution { fun solution(n: Int): Int =
    (1..n / 2).filter { n % it == 0 }.sum() + n
}

//class Solution {
//    fun solution(n: Int): Int {
//        var answer = n
//        for (i in 1..n / 2) if (n % i == 0) answer += i
//        return answer
//    }
//}

fun main() {
    val s = Solution()
    val ans = s.solution(12)
    println(ans)
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12928
