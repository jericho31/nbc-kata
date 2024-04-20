//// with 적용하면 . 접근을 줄일 수 있다? with 함수 수행이랑 람다식 만드는게 더 손해 아닐까?
//class Solution { fun solution(s: String): String =
//    with (s) { substring(length / 2 - 1 + length % 2, length / 2 + 1) }
//}

class Solution { fun solution(s: String): String =
    s.substring(s.length / 2 - 1 + s.length % 2, s.length / 2 + 1)
}

//class Solution { fun solution(s: String): String {
//    val sz = s.length
//    if (sz % 2 == 0) return s.slice(sz / 2 - 1..sz / 2)
//    return s[sz / 2].toString() }
//}

fun main() {
    val arr = arrayOf(
        "abcde", "qwer"
    )
    // "c", "we"
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12903
