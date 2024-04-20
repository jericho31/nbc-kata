class Solution { fun solution(arr: IntArray): Int {
    var count = 0
    for (i in arr.indices)
        for (j in i + 1 until arr.size)
            for (k in j + 1 until arr.size)
                if (arr[i] + arr[j] + arr[k] == 0) ++count
    return count }
}

fun main() {
    val arr = arrayOf(
        intArrayOf(-2, 3, 0, 2, -5),
        intArrayOf(-3, -2, -1, 0, 1, 2, 3),
        intArrayOf(-1, 1, -1, 1),
    )
    // 2, 5, 0
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/131705
