// 문제가 쓰레기... 공백 개수로 함정, 심지어 들어오는 문자열이 어떻게 구성되어있는지 안알려준다.
// 예제는 소문자 입력만 줘놓고 문제 설명에 아무것도 없는데 대문자가 들어오면
// 이걸 어떻게 알고 lower를 해주냐
class Solution { fun solution(s: String): String =
    s.split(' ').joinToString(" ") { String(CharArray(it.length) { i -> if (i and 1 == 0) it[i].uppercaseChar() else it[i].lowercaseChar() }) }
}

//class Solution {
//    fun solution(s: String): String =
//        (s.split(" ")
//            .map { String(CharArray(it.length) { i -> if (i and 1 == 0) it[i].uppercaseChar() else it[i] }) }).joinToString(
//            " "
//        )
//}

fun main() {
    val arr = arrayOf(
        "try hello world", "  TRy HElLo  WORLD "
    )
    // "TrY HeLlO WoRlD"
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12930
