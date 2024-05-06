//// 참고) 차례대로 최소공배수를 구해나가는 방식.
//class Solution {
//    fun solution(arr: IntArray): Int {
//        var answer = 1
//        for (n in arr) answer = getLcm(answer, n)
//        return answer
//    }
//
//    private fun getLcm(a: Int, b: Int): Int = a / getGcd(a, b) * b
//
//    private fun getGcd(a: Int, b: Int): Int {
//        var x: Int
//        var y: Int
//        if (a < b) {
//            x = b
//            y = a
//        } else {
//            x = a
//            y = b
//        }
//        var z = x % y
//        while (true) {
//            if (z == 0) return y
//            x = y % z
//            if (x == 0) return z
//            y = z % x
//            if (y == 0) return x
//            z = x % y
//        }
//    }
//}

// 0.02ms(only 3: 0.03ms)
class Solution { fun solution(arr: IntArray): Int {
    val lcm = IntArray(98)
    for (n in arr) {
        var m = n
        for (i in 2..97) {
            var cnt = 0
            while (m % i == 0) {
                m /= i
                ++cnt
            }
            if (cnt > 0 && cnt > lcm[i]) lcm[i] = cnt
            if (m == 1) break
        }
    }
    var ans = 1
    for (i in lcm.indices) while (lcm[i] > 0) {
        ans *= i
        --lcm[i]
    }
    return ans
} }

//// 0.05ms(1,3,9)(others 0.03ms)
//import kotlin.math.pow
//class Solution { fun solution(arr: IntArray): Int {
//    val lcm = IntArray(98)
//    for (n in arr) {
//        var m = n
//        for (i in 2..97) {
//            var cnt = 0
//            while (m % i == 0) {
//                m /= i
//                ++cnt
//            }
//            if (cnt > 0 && cnt > lcm[i]) lcm[i] = cnt
//            if (m == 1) break
//        }
//    }
//    var ans = 1
//    for (i in lcm.indices) if (lcm[i] > 0) ans *= i.toDouble().pow(lcm[i]).toInt()
//    return ans
//} }  // 50min

//private val primes = intArrayOf(
//    2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
//    43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
//)

fun main() {
    val arr = arrayOf(
        intArrayOf(2, 6, 8, 14),
        intArrayOf(1, 2, 3),
    )
    /*
    168
    6
     */
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12953
