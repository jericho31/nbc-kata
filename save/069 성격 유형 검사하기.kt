// 0.3ms(1~12)(0.3 ~ 4.8)
class Solution {
    private fun type(s: String) = when (s) {
        "RT" -> Pair(0, 1)
        "TR" -> Pair(0, -1)
        "CF" -> Pair(1, 1)
        "FC" -> Pair(1, -1)
        "JM" -> Pair(2, 1)
        "MJ" -> Pair(2, -1)
        "AN" -> Pair(3, 1)
        "NA" -> Pair(3, -1)
        else -> throw Throwable("type error")
    }

    private fun convertScoreToAnswer(score: IntArray): String {
        val sb = StringBuilder()
        sb.append(if (score[0] <= 0) 'R' else 'T')
        sb.append(if (score[1] <= 0) 'C' else 'F')
        sb.append(if (score[2] <= 0) 'J' else 'M')
        sb.append(if (score[3] <= 0) 'A' else 'N')
        return sb.toString()
    }

    fun solution(survey: Array<String>, choices: IntArray): String {
        val score = IntArray(4)
        survey.forEachIndexed { i, s ->
            val t = type(s)
            score[t.first] += (choices[i] - 4) * t.second
        }
        return convertScoreToAnswer(score)
    }
}  // 23min

fun main() {
    val arr = arrayOf(
        Pair(arrayOf("AN", "CF", "MJ", "RT", "NA"), intArrayOf(5, 3, 2, 7, 5)),
        Pair(arrayOf("TR", "RT", "TR"), intArrayOf(7, 1, 3)),
    )
    // TCMA, RCJA
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i.first, i.second)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/118666
