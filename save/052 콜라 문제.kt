//// 타인 풀이: 일반항 어케 구했냐;;
//class Solution { fun solution(a: Int, b: Int, n: Int): Int =
//    (if (n > b) n - b else 0) / (a - b) * b
//}

class Solution { fun solution(a: Int, b: Int, n: Int): Int {
    var ans = 0
    var bottle = n
    while (a <= bottle) {
        val q = bottle / a
        val new = q * b
        bottle -= q * (a - b)
        ans += new }
    return ans }
}

fun main() {
    val arr = arrayOf(
        intArrayOf(2, 1, 20),
        intArrayOf(3, 1, 20),
    )
    // 19, 9
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i[0], i[1], i[2])
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/132267
