// 타인 참고. 2로 곱해가면서 작은거 큰거 확인해나가려고 하다보니 xor 했던거랑 원리가 같아서 bit shifting으로 구현.
class Solution { fun solution(n: Int, a: Int, b: Int): Int {
    var x = (a - 1) xor (b - 1) ushr 1
    var ans = 1
    while (x != 0) {
        x = x ushr 1
        ++ans
    }
    return ans
} }

//class Solution { fun solution(n: Int, a: Int, b: Int): Int {
//    var x = (a - 1) / 2
//    var y = (b - 1) / 2
//    var ans = 1
//    while (x != y) {
//        x /= 2
//        y /= 2
//        ++ans
//    }
//    return ans
//} }

//// 타인풀이, 0.7~1ms. 성능은 별론데 로직이... 뭐지 이거?
//// 반씩 나눠서 만날 때까지의 수니까 제일 높은 다른 비트까지의 길이가 답이 되는 듯.
//// toString(2) 에서 연산이 많아서 느린 듯?
//class Solution { fun solution(n: Int, a: Int, b: Int) =
//    ((a - 1) xor (b - 1)).toString(2).length
//}

//// 0.01ms
//class Solution { fun solution(n: Int, a: Int, b: Int): Int {
//    var mn: Int
//    var mx: Int
//    if (a > b) {
//        mn = (b - 1) / 2
//        mx = (a - 1) / 2
//    } else {
//        mn = (a - 1) / 2
//        mx = (b - 1) / 2
//    }
//    var ans = 1
//    while (mn != mx) {
//        mn /= 2
//        mx /= 2
//        ++ans
//    }
//    return ans
//} }  // 16min

fun main() {
    val arr = arrayOf(
        Triple(8, 4, 7)
    )
    /*
    3
     */
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i.first, i.second, i.third)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12985
