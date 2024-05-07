// 0.08ms(14~16)(0.01~0.10)  함수 반환형을 Long에서 Int로 바꿔도 통과되네..?
class Solution {
    private val arr = IntArray(2001)
    private var end = 2

    init {
        arr[0] = 1
        arr[1] = 1
    }

    fun solution(n: Int): Int {
        if (n < end) return arr[n]
        for (i in end..n) arr[i] = (arr[i - 2] + arr[i - 1]) % 1234567
        end = n + 1
        return arr[n]
    }
}

//// 0.13ms(14~16)(0.04~0.15)  구현해놓고 보니 피보나치
//class Solution {
//    private val arr = IntArray(2001)
//    private var end = 2
//
//    init {
//        arr[0] = 1
//        arr[1] = 1
//    }
//
//    fun solution(n: Int): Long {
//        if (n < end) return arr[n].toLong()
//        for (i in end..n) arr[i] = (arr[i - 2] + arr[i - 1]) % 1234567
//        end = n + 1
//        return arr[n].toLong()
//    }
//}  // 13min

fun main() {
    val arr = arrayOf(
        3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
    )
    /*
    3, 5, ...
     */
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12914
