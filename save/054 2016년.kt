// 0.02ms. sumOf가 느린가?
class Solution {
    private val arrWeekDay = arrayOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
    private val arrMonthAcc = intArrayOf(0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31).apply {
        (2 until size).forEach { i -> this[i] += this[i - 1] } }
    fun solution(a: Int, b: Int): String = arrWeekDay[(arrMonthAcc[a - 1] + b + 4) % 7]
}

//// Robertson 알고리즘 사용 안하고 문제 직접 풀이. 1월 1일이 금요일, 윤년.
//// Robertson은 0.02ms 이었는데 왜 이건 3~4ms이냐..? 이렇게까지 차이날 구석이 있나?
//class Solution {
//    private val arrWeekDay = arrayOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
//    private val arrMonthDay = intArrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
//    fun solution(a: Int, b: Int): String =
//        arrWeekDay[((0 until a - 1).sumOf { arrMonthDay[it] } + b + 4) % 7]
//}

//class Solution {
//    fun solution(a: Int, b: Int): String {
//        val w = robertson(2016, a, b)
//        return "SUNMONTUEWEDTHUFRISAT".substring(w * 3, w * 3 + 3)
//    }
//
//    private fun robertson(year: Int, month: Int, day: Int): Int {
//        val b = ((month - 14) / 12) + year
//        val c = month + 10 - (12 * ((month + 10) / 13))
//        val d = ((13 * c) - 1) / 5
//        val e = (5 * (b % 100)) / 4
//        return (d + day + 77 + e + (b / 400) - (2 * b / 100)) % 7
//    }
//}

fun main() {
    val arr = arrayOf(
        Pair(5, 24),
        Pair(1, 1),
    )
    // "TUE"
    val s = Solution()
    for (i in arr) {
//        while (true) {
//            val ans = s.solution(Random.nextInt(1, 13), Random.nextInt(1, 32))
//            println(ans)
//        }
        val ans = s.solution(i.first, i.second)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12901
