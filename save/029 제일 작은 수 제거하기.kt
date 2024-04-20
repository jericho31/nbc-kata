class Solution { fun solution(arr: IntArray): IntArray =
    if (arr.size == 1) intArrayOf(-1) else run {
        var mn = 0x7fffffff; var mnid = 0
        arr.forEachIndexed { i, v -> if (v < mn) { mn = v; mnid = i } }
        arr.copyOfRange(0, mnid) + arr.copyOfRange(mnid + 1, arr.size) }
}

//class Solution { fun solution(arr: IntArray): IntArray {
//    if (arr.size == 1) return intArrayOf(-1)
//    var mn = 0x7fffffff
//    var mnid = 0
//    arr.forEachIndexed { i, v ->
//        if (v < mn) {
//            mn = v; mnid = i
//        }
//    }
//    return arr.copyOfRange(0, mnid) + arr.copyOfRange(mnid + 1, arr.size) }
//}

//class Solution { fun solution(arr: IntArray): IntArray {
//    var mn = 0x7fffffff
//    var mnid = 0
//    var id = 0
//    for (i in arr) {
//        if (i < mn) {
//            mn = i
//            mnid = id
//        }
//        ++id
//    }
//    val answer = arr.copyOfRange(0, mnid) + arr.copyOfRange(mnid + 1, arr.size)
//    if (answer.size == 0) return IntArray(1) { -1 }
//    return answer }
//}

//class Solution {
//    fun solution(arr: IntArray): IntArray {
//        var mn = 0x7fffffff
//        var id = 0
//        for (i in 0 until arr.size) {
//            if (arr[i] < mn) {
//                mn = arr[i]
//                id = i
//            }
//        }
//        val answer = arr.copyOfRange(0, id) + arr.copyOfRange(id + 1, arr.size)
//        if (answer.size == 0) return IntArray(1) { -1 }
//        return answer
//    }
//}

//class Solution {
//    fun solution(arr: IntArray): IntArray {
//        var mn = 0x7fffffff
//        var id = 0
//        for (i in 0 until arr.size) {
//            if (arr[i] < mn) {
//                mn = arr[i]
//                id = i
//            }
//        }
//        return arr.sliceArray(0 until id) + arr.sliceArray(id + 1 until arr.size)
//    }
//}

fun main() {
    val s = Solution()
    val ans = s.solution(intArrayOf(4, 3, 2))
    println(ans.contentToString())
//    println(ans.joinToString(", "))
//    ans.forEach { print("$it, ") }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12935
