// 0.01ms
class Solution { fun solution(brown: Int, yellow: Int): IntArray {
    val sum = brown / 2 - 2
    var h = sum / 2
    var w = sum % 2 + h
    while (w * h != yellow) {
        ++w
        --h
    }
    return intArrayOf(w + 2, h + 2)
} }  // 12min

fun main() {
    val arr = arrayOf(
        Pair(10, 2),
        Pair(8, 1),
        Pair(24, 24),
    )
    /*
    [4, 3]
    [3, 3]
    [8, 6]
     */
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i.first, i.second)
        println(ans.contentToString())
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/42842
