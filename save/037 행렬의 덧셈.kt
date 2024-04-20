class Solution { fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> =
    arr1.apply {
        for (y in arr2.indices)
            for ((x, v) in arr2[y].withIndex())
                this[y][x] += v }
}

////val ans = arr1.copyOf()  // 이거 해봤자 얕은 복사...
//class Solution {
//    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
//        for (y in arr2.indices)
//            for ((x, v) in arr2[y].withIndex())
//                arr1[y][x] += v
//        return arr1
//    }
//}

fun main() {
    val s = Solution()
    for (i in arrayOf(
        arrayOf(
            arrayOf(intArrayOf(1, 2), intArrayOf(2, 3)),
            arrayOf(intArrayOf(3, 4), intArrayOf(5, 6))
        ),
        arrayOf(arrayOf(intArrayOf(1), intArrayOf(2)), arrayOf(intArrayOf(3), intArrayOf(4)))
    )) {
        val ans = s.solution(i[0], i[1])
        ans.forEach { println(it.contentToString()) }
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12950
