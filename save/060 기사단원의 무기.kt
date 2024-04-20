//// 11~16:8~15ms(0.02~15.22)  왜 블록으로 감싸는 것만으로 빨라지지...????
//class Solution { fun solution(number: Int, limit: Int, power: Int): Int {
//    val arr = IntArray(number + 1) { 2 }
//    arr[0] = 0; arr[1] = 1
//    for (i in 2..number / 2) {
//        for (j in i + i..number step i) ++arr[j]
//    }
//    return arr.sumOf { if (it > limit) power else it } }
//}

// 11~16:11~17ms(0.02~23.21)  // 재측정 11~16:11~21ms(0.02~32.31)
class Solution { fun solution(number: Int, limit: Int, power: Int): Int {
    val arr = IntArray(number + 1) { 2 }
    arr[0] = 0; arr[1] = 1
    for (i in 2..number / 2)
        for (j in i + i..number step i) ++arr[j]
    return arr.sumOf { if (it > limit) power else it } }
}


//// 11~16:7~11ms(0.01~11.48)  어째서 얘가 더 빠르지...?
//class Solution {
//    fun solution(number: Int, limit: Int, power: Int): Int {
//        val arr = IntArray(number + 1) { 2 }
//        arr[0] = 0; arr[1] = 1
//        for (i in 2..number) {
//            for (j in i + i..number step i) ++arr[j]
//        }
//        return arr.sumOf { if (it > limit) power else it }
//    }
//}  // 11min

fun main() {
    val arr = arrayOf(
        Triple(5, 3, 2),
        Triple(10, 3, 2),
    )
    // 10, 21
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i.first, i.second, i.third)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/136798
