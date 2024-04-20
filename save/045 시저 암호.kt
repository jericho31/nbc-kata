class Solution { fun solution(s: String, n: Int): String =
    String(CharArray(s.length) {
        when (val c = s[it]) {
            ' ' -> ' '
            in 'a'..'z' -> with(c + n) { if (this > 'z') this - 26 else this }
            else -> with(c + n) { if (this > 'Z') this - 26 else this }
        }
    })
}

fun main() {
    val arr = arrayOf(
        Pair("AB", 1),
        Pair("z", 1),
        Pair("a B z", 4),
    )
    // "BC", "a", "e F d"
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i.first, i.second)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12926
