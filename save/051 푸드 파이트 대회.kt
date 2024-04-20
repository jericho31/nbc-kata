// bitwise로 ㅈㄹ할게 아니라 그냥 /2 하면 됐잖아...
// repeat(food[i] / 2) { sb.append(i) } 로 한 사람도 있다.
// 빌더는 숫자도 다 먹네 ㄷㄷ;; 하긴 print 생각해보면 ㅇㅇ.
class Solution { fun solution(food: IntArray): String {
    val sb = StringBuilder()
    food.forEachIndexed { i, v ->
        sb.append(CharArray(v / 2) { '0' + i }) }
    return sb.toString() + '0' + sb.reversed().toString() }
}

//class Solution { fun solution(food: IntArray): String {
//    val sb = StringBuilder()
//    food.forEachIndexed { i, v ->
//        sb.append(CharArray(v and 1.inv() shr 1) { '0' + i }) }
//    return sb.toString() + '0' + sb.reversed().toString() }
//}

//// StringBuilder가 짱이다. padend 그딴거 필요없음.
//class Solution { fun solution(food: IntArray): String {
//    val sb = StringBuilder()
//    for (i in 1 until food.size)
//        sb.append(CharArray(food[i] and 1.inv() shr 1) { '0' + i })
//    return sb.toString() + '0' + sb.reversed().toString() }
//}

fun main() {
    val arr = arrayOf(
        intArrayOf(1, 3, 4, 6),
        intArrayOf(1, 7, 1, 2),
    )
    // 1223330333221, 111303111
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/134240
