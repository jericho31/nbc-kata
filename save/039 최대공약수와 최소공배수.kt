import kotlin.math.sqrt

class Solution { fun solution(n: Int, m: Int): IntArray {
    var gcd = 0
    val lst = MutableList(0) { 0 }
    var notfound = true
    for (i in 1..sqrt(n.toFloat()).toInt()) {
        if (n % i == 0) {
            gcd = n / i
            if (m % gcd == 0) { notfound = false; break }
            lst.add(i)
        }
    }
    if (notfound) gcd = lst.last { m % it == 0 }
    return intArrayOf(gcd, n / gcd * m) }
}

//class Solution {
//    fun solution(n: Int, m: Int): IntArray {
//        //todo 나누어떨어지면 서로.
//
//        var a = n
//        var b = m
//        if (n > m) {
//            a = m; b = n
//        }
//
//        var gcd = 1
//        val rta = sqrt(n.toFloat()).toInt()
//        val arr = ArrayList<Int>()
//        var notfound = true
//        for (i in 1..rta) {
//            if (a % i == 0) {
//                gcd = a / i
//                if (b % gcd == 0) {
//                    notfound = false
//                    break
//                }
//                arr.add(i)
//            }
//        }
//        if (notfound) {
//            gcd = arr.last { b % it == 0 }
//
////            for (i in arr.reversed()) {
////                if (b % i == 0) {
////                    gcd = i
////                    break
////                }
////            }
//        }
////        val lcm = a * b / (gcd * gcd) * gcd
//        // gcd는 큰것부터 역으로 해서 큰수 나눠지는지 보면 됨.
//        // lcm은? 4, 6 = 2, 12 / 4,7 = 1,28 / 6,9 = 3,18 / 12,18 = 6,36 / 12,20 = 4,60
//        // gcd가 두 수를 나눈 각각 몫 * gcd
//        return intArrayOf(gcd, a * b / (gcd * gcd) * gcd)
//    }
//}

fun main() {
    val arr = arrayOf(
        intArrayOf(3, 12), intArrayOf(2, 5)
    )
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i[0], i[1])
        println(ans.contentToString())
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12940
