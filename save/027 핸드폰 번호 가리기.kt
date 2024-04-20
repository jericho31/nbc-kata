// 타인풀이: padStart, takeLast 를 사용하면 이렇게 된다고 한다.
class Solution { fun solution(phone_number: String): String =
    "${"".padStart(phone_number.length - 4, '*')}${phone_number.takeLast(4)}"
}

//class Solution { fun solution(phone_number: String): String {
//    val ca = phone_number.toCharArray()
//    for (i in 0 until ca.size - 4) ca[i] = '*'
//    return String(ca) }
//}

fun main() {
    val s = Solution()

    val a = s.solution("01033334444")
    println("${a.javaClass.name}, $a")
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12948
