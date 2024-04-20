class Solution {
    private val patterns = arrayOf(
        intArrayOf(1, 2, 3, 4, 5),
        intArrayOf(2, 1, 2, 3, 2, 4, 2, 5),
        intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5) )

    fun solution(answers: IntArray): IntArray {
        val counts = IntArray(3)
        for ((i, v) in answers.withIndex())
            patterns.forEachIndexed { j, p -> if (v == p[i % p.size]) ++counts[j] }
        var ans = IntArray(0)
        counts.forEachIndexed { i, v -> if (v == counts.maxOrNull()) ans += intArrayOf(i + 1) }
        return ans
    }
}

//class Solution {
//    private val patterns = arrayOf(
//        intArrayOf(1, 2, 3, 4, 5),
//        intArrayOf(2, 1, 2, 3, 2, 4, 2, 5),
//        intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
//    )
//
//    fun solution(answers: IntArray): IntArray {
//        val counts = IntArray(3)
//        answers.forEachIndexed { i, v ->
//            patterns.forEachIndexed { j, p -> if (v == p[i % p.size]) ++counts[j] }
//        }
//        var ans = intArrayOf()
//        counts.forEachIndexed { i, v -> if (v == counts.maxOrNull()) ans += intArrayOf(i + 1) }
//        return ans
//    }
//}  // 16min

fun main() {
    val arr = arrayOf(
        intArrayOf(1, 2, 3, 4, 5),
        intArrayOf(1, 3, 2, 4, 2),
    )
    // [1], [1,2,3]
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i)
        println(ans.contentToString())
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/42840
