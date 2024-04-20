class Solution { fun solution(a: IntArray, b: IntArray): Int =
    a.foldIndexed(0) { index, acc, i -> acc + b[index] * i }
}

//// 성능은 아래꺼가 더 좋을 수도. map하고 sum 하는게 O(2n)이면.
//class Solution { fun solution(a: IntArray, b: IntArray): Int =
//    a.mapIndexed { i, it -> b[i] * it }.sum()
//}

//class Solution { fun solution(a: IntArray, b: IntArray): Int {
//    var answer = 0
//    a.forEachIndexed { i, it -> answer += b[i] * it }
//    return answer }
//}

fun main() {
    val s = Solution()
    val ans = s.solution(intArrayOf(1, 2, 3, 4), intArrayOf(-3, -1, 0, 2))
    println(ans)
}
// https://school.programmers.co.kr/learn/courses/30/lessons/70128
