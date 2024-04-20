class Solution { fun solution(array: IntArray, commands: Array<IntArray>): IntArray =
    IntArray(commands.size) { i ->
        array.copyOfRange(commands[i][0] - 1, commands[i][1]).sorted()[commands[i][2] - 1] }
}

fun main() {
    val arr = arrayOf(
        Pair(
            intArrayOf(1, 5, 2, 6, 3, 7, 4),
            arrayOf(intArrayOf(2, 5, 3), intArrayOf(4, 4, 1), intArrayOf(1, 7, 3))
        ),
    )
    // [5, 6, 3]
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i.first, i.second)
        println(ans.contentToString())
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/42748
