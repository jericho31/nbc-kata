class Solution { fun solution(n: Int, m: Int, section: IntArray): Int {
    var ans = 0
    var end = 0
    for (v in section) {
        if (v < end) continue
        end = v + m
        ++ans }
    return ans }
}

//class Solution { fun solution(n: Int, m: Int, section: IntArray): Int {
//    var ans = 0
//    var left = -m
//    for (v in section) {
//        if (v < left + m) continue
//        left = v
//        ++ans }
//    return ans }
//}  // 10min

fun main() {
    val arr = arrayOf(
        Triple(8, 4, intArrayOf(2, 3, 6)),
        Triple(5, 4, intArrayOf(1, 3)),
        Triple(4, 1, intArrayOf(1, 2, 3, 4)),
    )
    // 2, 1, 4
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i.first, i.second, i.third)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/161989
