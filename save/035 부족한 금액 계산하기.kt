// 세상에... 급수를 그냥 공식으로 적용하면 되잖아...
// scope 함수 써서 한 줄로 만들 수 있고.
class Solution { fun solution(price: Int, money: Int, count: Int): Long =
    with(count * (count + 1L) / 2 * price - money) { if (this < 0) 0 else this }
}

//class Solution { fun solution(price: Int, money: Int, count: Int): Long {
//    val a = (1L..count).sum() * price - money
//    return if (a < 0) 0L else a }
//}

//class Solution {
//    fun summation(n: Int): Long {
//        var ans = n.toLong()
//        for (i in 1 until n) ans += i
//        return ans
//    }
//
//    fun solution(price: Int, money: Int, count: Int): Long {
//        return summation(count) * price - money
//    }
//}

//// 이건 tailrec이 아니야
//class Solution {
//    tailrec fun summation(n: Long): Long {
//        if (n == 1L) return 1L
//        return summation(n - 1) + n
//    }
//
//    fun solution(price: Int, money: Int, count: Int): Long {
//        return summation(count.toLong()) * price - money
//    }
//}

fun main() {
    val s = Solution()
    val ans = s.solution(3, 20, 4)
    println(ans)
}
// https://school.programmers.co.kr/learn/courses/30/lessons/82612
