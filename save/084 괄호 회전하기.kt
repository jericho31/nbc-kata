// 참고) 15ms(7~11)(2.31~23.91)
class Solution {
    private val endCh = setOf(')', ']', '}')
    private fun isRight(s: String): Boolean {
        val arr = CharArray(s.length)
        var e = 0
        for (c in s) {
            if (c !in endCh) {
                arr[e++] = c
                continue
            }
            if (e == 0) return false
            when (c) {
                ')' -> if (arr[--e] != '(') return false
                ']' -> if (arr[--e] != '[') return false
                '}' -> if (arr[--e] != '{') return false
            }
        }
        return e == 0
    }

    fun solution(s: String): Int {
        var ans = 0
        for (i in s.indices) if (isRight(s.substring(i, s.length) + s.substring(0, i))) ++ans
        return ans
    }
}

//// 140ms(2~6)(2.41~1270)
//class Solution {
//    private val regex = Regex("""\(\)|\[]|\{\}""")
//    fun solution(s: String): Int {
//        var ans = 0
//        for (i in s.indices) {
//            var t = (s.substring(i, s.length) + s.substring(0, i)).replace(regex, "")
//            var prev = s.length
//            while (t.length != prev) {
//                prev = t.length
//                t = t.replace(regex, "")
//            }
//            if (prev == 0) ++ans
//        }
//        return ans
//    }
//}  // 60min

fun main() {
    val arr = arrayOf(
        "[](){}",
        "}]()[{",
        "[)(]",
        "}}}",

        "(())",
    )
    /*
    3
    2
    0
    0
     */
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/76502
