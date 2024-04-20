/*
문제에 함정이 있다. 대수적으로 생각하면 로직이 간단해진다.
문제를 처음 보면 약수의 개수를 구해 홀짝을 비교해야 할 것 같지만
약수 개수가 홀수이려면 제곱수의 경우밖엔 없다. 약수는 쌍으로 나오니까.
 */
class Solution { fun solution(left: Int, right: Int): Int =
    (left..right).sumOf {
        val rt = kotlin.math.sqrt(it.toDouble()).toInt()
        if (rt * rt == it) -it else it }
}

//class Solution {
//    fun fn(a: Int): Int {
//        val rt = kotlin.math.sqrt(a.toDouble()).toInt()
//        if (rt * rt == a) return -a
//        return a
//    }
//
//    fun solution(left: Int, right: Int): Int =
//        (left..right).sumOf { fn(it) }
//
////    fun solution(left: Int, right: Int): Int {
////        var ans = 0
////        (left..right).forEach { ans += fn(it) }
////        return ans
////    }
//}

fun main() {
    val s = Solution()
    val ans = s.solution(13, 17)
    println(ans)
}
// https://school.programmers.co.kr/learn/courses/30/lessons/77884
