// 440ms(11~13)(0.05 ~ 568)
class Solution { fun solution(players: Array<String>, callings: Array<String>): Array<String> {
    val map = HashMap<String, Int>(players.size)
    players.forEachIndexed { i, s -> map[s] = i }

    callings.forEach { s ->
        val i = map[s]!!
        val ss = players[i - 1]
        map[s] = i - 1
        map[ss] = i
        players[i] = ss
        players[i - 1] = s
    }
    return players
} }  // 20min

//class Solution { fun solution(players: Array<String>, callings: Array<String>): Array<String> {
//    callings.forEach { s ->
//        val i = players.indexOf(s)
//        players[i] = players[i - 1]
//        players[i - 1] = s
//    }
//    return players
//} }  // timeout, 5min

fun main() {
    val arr = arrayOf(
        Pair(arrayOf("mumu", "soe", "poe", "kai", "mine"), arrayOf("kai", "kai", "mine", "mine")),
    )
    // "mumu", "kai", "mine", "soe", "poe"
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i.first, i.second)
        println(ans.contentToString())
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/178871
