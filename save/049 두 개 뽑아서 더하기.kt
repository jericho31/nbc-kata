class Solution { fun solution(numbers: IntArray): IntArray {
//    val s = mutableSetOf<Int>()
    val s = sortedSetOf<Int>()
    numbers.forEachIndexed { i, v ->
        for (j in i + 1 until numbers.size)
            s.add(v + numbers[j])
    }
//    return s.sorted().toIntArray()
    return s.toIntArray() }
}

fun main() {
    val arr = arrayOf(
        intArrayOf(2, 1, 3, 4, 1),
        intArrayOf(5, 0, 2, 7),
    )
    // [2,3,4,5,6,7], [2,5,7,9,12]
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i)
        println(ans.contentToString())
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/68644
