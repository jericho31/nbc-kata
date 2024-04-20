class Solution { fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
    var i1 = 0; var i2 = 0
    for (s in goal) {
        if (i1 < cards1.size && cards1[i1] == s) ++i1
        else if (i2 < cards2.size && cards2[i2] == s) ++i2
        else return "No" }
    return "Yes" }
}

fun main() {
    val arr = arrayOf(
        Triple(
            arrayOf("i", "drink", "water"),
            arrayOf("want", "to"),
            arrayOf("i", "want", "to", "drink", "water")
        ),
        Triple(
            arrayOf("i", "water", "drink"),
            arrayOf("want", "to"),
            arrayOf("i", "want", "to", "drink", "water")
        ),
    )
    // "Yes", "No
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i.first, i.second, i.third)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/159994
