// 와... Boolean 반환하는 경우는 그냥 조건 && || 로 해결 가능하네...
// all 함수 좀 더 알아봐야 할 듯. 하나라도 false면 false가 나오는건지.
// s.toIntOrNull() != null 로도 가능
/*
any, all, none
조건을 만족하는 원소가 하나라도 있으면
모두 조건을 만족하면
조건을 만족하는 요소가 없으면

contains, containsAll
배열이나 리스트가 특정 원소를 포함하는지
containsAll은 인자를 리스트?로 넣음.
 */
class Solution { fun solution(s: String): Boolean =
    (s.length == 4 || s.length == 6) && s.all { it.isDigit() }
}

//class Solution { fun solution(s: String): Boolean {
//    if (s.length != 4 && s.length != 6) return false
//    s.forEach { if (it > '9') return false }
//    return true }
//}

//class Solution { fun solution(s: String): Boolean {
//    if (s.length != 4 && s.length != 6) return false
//    try {
//        s.first { it > '9' }
//    } catch (e: Throwable) {  // 이거 왜 NumberFormatException 로 하면 안됨?
//        return true
//        // first는 Char sequence contains no character matching the predicate. 라는
//        // String을 예외값으로 던지기 때문인가?
//        // NumberFormatException이 아니라 그냥 Exception이나 Throwable으로 하면 잘 되네.
//        // 그럼 예외 타입이 안맞으면 catch를 안해???
//    }
//    return false }
//}

fun main() {
    val s = Solution()
    for (i in arrayOf("a234", "1234")) {
        val ans = s.solution(i)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12918
