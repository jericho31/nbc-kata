// 참고?) 카운팅소트는 역시 성능 쥑임. 배열 최대가 천개라 별로 차이 없을 것 같은데 왜이렇게까지 차이가...?
// 0.25ms(0.19~0.37)
class Solution { fun solution(citations: IntArray): Int {
    val cnt = IntArray(10001)
    for (v in citations) ++cnt[v]
    var sum = 0
    for (i in 1001..10000) sum += cnt[i]
    for (i in 1000 downTo 1) {
        sum += cnt[i]
        if (sum >= i) return i
    }
    return 0
} }

//// 참고) sortedDescending -> sortedArrayDescending 만 바꿨는데 성능 차이 무엇...?
//// 16ms(14.1~22.7)
//class Solution { fun solution(citations: IntArray): Int {
//    val arr = citations.sortedArrayDescending()
//    for (i in arr.indices) if (arr[i] < i + 1) return i
//    return arr.size
//} }

//// 23ms(19.4~29.6)
//class Solution { fun solution(citations: IntArray): Int {
//    val arr = citations.sortedDescending()
//    for (i in arr.indices) if (arr[i] < i + 1) return i
//    return arr.size
//} }  // 28min

//class Solution { fun solution(citations: IntArray): Int {
//    val arr = citations.sortedDescending()
//    for (i in arr.indices) if (arr[i] < i + 1) return i
//    return 0
//} }  // fail(9), 19min  // 모든 인용수가 개수보다 클 때가 문제.

//class Solution { fun solution(citations: IntArray): Int {
//    val desc = citations.sorted()
//    for (i in desc.lastIndex downTo 1) if (i + 1 >= desc[i]) return i + 1
//    return 0
//} }  // fail, 13min

fun main() {
    val arr = arrayOf(
        intArrayOf(3, 0, 6, 1, 5),  // 0 1 3 5 6
        intArrayOf(0, 0, 2, 2, 2),
        intArrayOf(0, 0, 0, 0, 100),
        intArrayOf(0, 0, 0, 0, 0),
        intArrayOf(1, 1, 1, 1, 1),
        intArrayOf(5, 5, 5, 5, 5),
        intArrayOf(9, 9, 9, 9, 9),
    )
    /*
    3
    2
    1
    0
    1
    5
    5
     */
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/42747
