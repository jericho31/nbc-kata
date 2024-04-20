class Solution { fun solution(s: String): String =
    String(s.toCharArray().sortedArrayDescending())
}

//// 왜 실패? 아... Set...
//class Solution {
//    fun solution(s: String): String =
//        String(s.toSortedSet().toCharArray().reversedArray())
//}

fun main() {
    val s = Solution()
    val ans = s.solution("Zbcdefg")
    println(ans)
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12917
