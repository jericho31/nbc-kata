class Solution { fun solution(s: String): Int {
    var ans = 0
    var i = 0
    while (true) {
        ++ans
        var n = 1
        val c = s[i]
        while (++i < s.length) {
            if (s[i] == c) ++n else --n
            if (n == 0) break
        }
        if (++i >= s.length) break
    }
    return ans
} }

//// 대충 0.3~0.7ms
//class Solution { fun solution(s: String): Int {
//    var ans = 0
//    var i = 0
//    while (true) {
//        ++ans
//        var n1 = 1
//        var n2 = 0
//        val c = s[i]
//        while (++i < s.length) {
//            if (s[i] == c) ++n1 else ++n2
//            if (n1 == n2) break
//        }
//        if (++i >= s.length) break
//    }
//    return ans
//} }  // 15min

fun main() {
    val arr = arrayOf(
        "banana",
        "abracadabra",
        "aaabbaccccabba",
    )
    // 3, 6, 3
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/140108
