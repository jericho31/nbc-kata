class Solution { fun solution(n: Int): Int =
    n.toString(3).reversed().toInt(3)
}

fun main() {
    val arr = arrayOf(
        45, 125
    )
    // 7, 229
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/68935
