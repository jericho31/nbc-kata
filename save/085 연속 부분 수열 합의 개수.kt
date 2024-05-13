// 110ms(6~10)(16.8~194)
class Solution { fun solution(elements: IntArray): Int {
    val set = mutableSetOf(elements.sum())
    val arr = elements + elements
    for (i in elements.indices) {
        var partial = arr[i]
        set += partial
        for (j in i + 1 until elements.size + i - 1) {
            partial += arr[j]
            set += partial
        }
    }
    return set.size
} }  // 13min

fun main() {
    val arr = arrayOf(
        intArrayOf(7, 9, 1, 1, 4),
    )
    /*
    18
     */
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/131701
