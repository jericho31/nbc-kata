// 맵 생성을 클래스로 빼는 게 프로그래머스에서 확실히 빠른 듯?
class Solution {
    companion object { val m = mapOf(
        Pair("ze", Pair('0', 1)), Pair("on", Pair('1', 0)),
        Pair("tw", Pair('2', 0)), Pair("th", Pair('3', 2)),
        Pair("fo", Pair('4', 1)), Pair("fi", Pair('5', 1)),
        Pair("si", Pair('6', 0)), Pair("se", Pair('7', 2)),
        Pair("ei", Pair('8', 2)), Pair("ni", Pair('9', 1)) )
    }
    fun solution(s: String): Int {
        val sb = StringBuilder()
        var i = 0
        while (i < s.length) {
            if (s[i].isDigit()) { sb.append(s[i++]); continue }
            val p = m[s.substring(i, i + 2)]!!
            sb.append(p.first)
            i += 3 + p.second }
        return sb.toString().toIntOrNull() ?: -1
    }
}

//// 정직하게 다 볼 게 아니라 앞에 두글자만 봐도 된다.
//class Solution { fun solution(s: String): Int {
//    val m = mapOf(
//        Pair("ze", Pair('0', 1)), Pair("on", Pair('1', 0)),
//        Pair("tw", Pair('2', 0)), Pair("th", Pair('3', 2)),
//        Pair("fo", Pair('4', 1)), Pair("fi", Pair('5', 1)),
//        Pair("si", Pair('6', 0)), Pair("se", Pair('7', 2)),
//        Pair("ei", Pair('8', 2)), Pair("ni", Pair('9', 1)) )
//    val sb = StringBuilder()
//    var i = 0
//    while (i < s.length) {
//        if (s[i].isDigit()) { sb.append(s[i++]); continue }
//        val p = m[s.substring(i, i + 2)]!!
//        sb.append(p.first)
//        i += 3 + p.second }
//    return sb.toString().toIntOrNull() ?: -1 }
//}

//// replace 라는 좋은 기능이 있긴 한데, 반복 개오바네;;
//class Solution {
//    fun solution(s: String): Int = s
//        .replace("one", "1")
//        .replace("two", "2")
//        .replace("three", "3")
//        .replace("four", "4")
//        .replace("five", "5")
//        .replace("six", "6")
//        .replace("seven", "7")
//        .replace("eight", "8")
//        .replace("nine", "9")
//        .replace("zero", "0")
//        .toInt()
//}

//class Solution { fun solution(s: String): Int {
//    val m = mapOf( Pair("zero", '0'), Pair("one", '1'), Pair("two", '2'), Pair("three", '3'), Pair("four", '4'), Pair("five", '5'), Pair("six", '6'), Pair("seven", '7'), Pair("eight", '8'), Pair("nine", '9') )
//    val sb = StringBuilder()
//    var i = 0
//    while (i < s.length) {
//        if (s[i].isDigit()) { sb.append(s[i++]); continue }
//        var e = i + 3
//        for (j in 3..5) {
//            val ss = s.substring(i, e)
//            if (ss !in m) { ++e; continue }
//            sb.append(m[ss]); break
//        }
//        i = e
//    }
//    return sb.toString().toIntOrNull() ?: -1 }
//}

fun main() {
    val arr = arrayOf(
        "one4seveneight",
        "23four5six7",
        "2three45sixseven",
        "123",
    )
    // 1478, 234567, 234567, 123
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/81301
