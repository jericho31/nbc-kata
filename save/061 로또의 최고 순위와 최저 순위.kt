// 18ms(13.88~34.82)  그냥 테스트 환경에 편차가 심한 듯
class Solution { fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
    var zeros = 0; var base = 7
    for (v in lottos) {
        if (v == 0) ++zeros
        else if (win_nums.contains(v)) --base }
    return intArrayOf((base - zeros).let { if (it == 7) 6 else it }, if (base == 7) 6 else base) }
}

//// 14ms(13.08~20.85)
//class Solution { fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
//    var zeros = 0; var hits = 0
//    for (v in lottos) {
//        if (v == 0) ++zeros
//        else if (win_nums.contains(v)) ++hits }
//    return intArrayOf(
//        (7 - hits - zeros).let { if (it == 7) 6 else it },
//        (7 - hits).let { if (it == 7) 6 else it }) }
//}  // 12min

fun main() {
    val arr = arrayOf(
        Pair(intArrayOf(44, 1, 0, 0, 31, 25), intArrayOf(31, 10, 45, 1, 6, 19)),
        Pair(intArrayOf(0, 0, 0, 0, 0, 0), intArrayOf(38, 19, 20, 40, 15, 25)),
        Pair(intArrayOf(45, 4, 35, 20, 3, 9), intArrayOf(20, 9, 3, 45, 4, 35)),
        Pair(intArrayOf(111), intArrayOf(111)),
    )
    // [3, 5], [1, 6], [1, 1]
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i.first, i.second)
        println(ans.contentToString())
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/77484
