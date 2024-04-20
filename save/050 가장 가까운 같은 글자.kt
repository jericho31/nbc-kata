// output의 길이가 input의 길이로 이미 정해져있으니 붙여나갈게 아니라 기본값 놓고 변경만 해주면 된다.
class Solution { fun solution(s: String): IntArray {
    val arr = IntArray(26) { -1 }
    val ans = IntArray(s.length) { -1 }
    s.forEachIndexed { i, c ->
        if (arr[c - 'a'] != -1) ans[i] = i - arr[c - 'a']
        arr[c - 'a'] = i }
    return ans }
}

//class Solution { fun solution(s: String): IntArray {
//    val arr = IntArray(26) { -1 }
//    val lst = mutableListOf<Int>()
//    s.forEachIndexed { i, c ->
//        if (arr[c - 'a'] == -1) lst.add(-1)
//        else lst.add(i - arr[c - 'a'])
//        arr[c - 'a'] = i }
//    return lst.toIntArray() }
//}

fun main() {
    val arr = arrayOf(
        "banana", "foobar"
    )
    // [-1,-1,-1,2,2,2], [-1, -1, 1, -1, -1, -1]
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i)
        println(ans.contentToString())
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/142086
