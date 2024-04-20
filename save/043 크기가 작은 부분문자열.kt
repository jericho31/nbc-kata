class Solution { fun solution(t: String, p: String): Int =
    (0..t.length - p.length).sumOf { if (t.substring(it, it + p.length).toLong() <= p.toLong()) 1 as Int else 0 }
}

//class Solution {
//    fun solution(t: String, p: String): Int {
//        var count = 0
//        for (i in 0..t.length - p.length)
//            if (t.substring(i, i + p.length).toLong() <= p.toLong()) ++count
//        return count
//    }
//}

fun main() {
    val arr = arrayOf(
        arrayOf("3141592", "271"),
        arrayOf("500220839878", "7"),
        arrayOf("10203", "15"),
        arrayOf("84756", "99999"),
    )
    // 2, 8, 3
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i[0], i[1])
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/147355
