// 급수 공식으로 하면 더 빠르긴 하다
class Solution { fun solution(a: Int, b: Int): Long =
    if (a > b) (b.toLong()..a).sum() else (a.toLong()..b).sum()
}

//class Solution {
//    fun solution(a: Int, b: Int): Long {
//        var answer: Long = b.toLong()
//        if (a > b) for (i in b + 1..a) answer += i
//        else for (i in a until b) answer += i
//        return answer
//    }
//}

fun main() {
    val s = Solution()
    val ans = s.solution(3, 5)
    println(ans)
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12912
