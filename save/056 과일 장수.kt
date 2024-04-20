class Solution { fun solution(k: Int, m: Int, score: IntArray): Int {
    val arr = IntArray(k + 1)
    score.forEach { ++arr[it] }
    return (k downTo 1).sumOf { i ->
        val r = arr[i] % m
        arr[i - 1] += r
        (arr[i] - r) * i } }
}  // 35min + a

//class Solution { fun solution(k: Int, m: Int, score: IntArray): Int {
//    score.sort()
//    return (score.size % m + 1 until score.size step m).sumOf { score[it] * m } }
//}  // 20min - fail

//class Solution { fun solution(k: Int, m: Int, score: IntArray): Int {
//    score.sort()
//    return (score.size % m + 1 until score.size).sumOf { score[it] } }
//}  // 9min - fail

//class Solution {
//    fun solution(k: Int, m: Int, score: IntArray): Int {
//        score.sort()
//        var ans = 0
//        for (i in score.size % m + 1 until score.size) {
//            ans += score[i]
//        }
//        return ans
//    }
//}  // 6min - fail

fun main() {
    val arr = arrayOf(
        Triple(3, 4, intArrayOf(1, 2, 3, 1, 2, 3, 1)),
        Triple(4, 3, intArrayOf(4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2)),
    )
    // 8, 33
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i.first, i.second, i.third)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/135808
