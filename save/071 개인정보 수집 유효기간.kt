// 9ms(5.8 ~ 11.7)
class Solution { fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
    val duration = IntArray(26)
    terms.forEach { duration[it[0] - 'A'] = it.substring(2, it.length).toInt() }

    val yy = today.substring(0, 4).toInt()
    val mm = today.substring(5, 7).toInt()
    val dd = today.substring(8, 10).toInt()

    val exp = ArrayList<Int>()
    privacies.forEachIndexed { i, s ->
        var y = s.substring(0, 4).toInt()
        var m = s.substring(5, 7).toInt() + duration[s[11] - 'A']
        val d = s.substring(8, 10).toInt()
        if (m > 12) {
            val q = (m - 1) / 12
            y += q
            m -= q * 12
        }
        when {
            yy < y -> Unit
            yy > y -> exp.add(i + 1)
            mm < m -> Unit
            mm > m -> exp.add(i + 1)
            dd >= d -> exp.add(i + 1)
        }
    }
    return exp.toIntArray()
} }  // 36min

fun main() {
    val arr = arrayOf(
        Triple(
            "2022.05.19",
            arrayOf("A 6", "B 12", "C 3"),
            arrayOf("2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C")
        ),
        Triple(
            "2020.01.01",
            arrayOf("Z 3", "D 5"),
            arrayOf("2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z")
        ),
    )
    /*
    [1, 3]
    [1, 4, 5]
     */
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i.first, i.second, i.third)
        println(ans.contentToString())
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/150370
