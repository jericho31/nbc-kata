// 0.16ms(0.02 ~ 0.24)
class Solution { fun solution(park: Array<String>, routes: Array<String>): IntArray {
    var y = 0
    var x = 0
    val h = park.size
    val w = park[0].length
    val map = Array(park.size) { yy ->
        BooleanArray(park[0].length) { xx ->
            when (park[yy][xx]) {
                'O' -> true
                'S' -> {
                    y = yy
                    x = xx
                    true
                }

                else -> false
            }
        }
    }
    routes.forEach { s ->
        val n = s[2] - '0'
        when (s[0]) {
            'E' -> {
                if (x + n >= w) return@forEach  // forEach의 return은 continue처럼 작동함
                for (i in 1..n) if (map[y][x + i].not()) return@forEach
                x += n
            }

            'W' -> {
                if (x - n < 0) return@forEach  // forEach의 return은 continue처럼 작동함
                for (i in 1..n) if (map[y][x - i].not()) return@forEach
                x -= n
            }

            'S' -> {
                if (y + n >= h) return@forEach  // forEach의 return은 continue처럼 작동함
                for (i in 1..n) if (map[y + i][x].not()) return@forEach
                y += n
            }

            'N' -> {
                if (y - n < 0) return@forEach  // forEach의 return은 continue처럼 작동함
                for (i in 1..n) if (map[y - i][x].not()) return@forEach
                y -= n
            }
        }
    }
    return intArrayOf(y, x)
} }  // 39min

fun main() {
    val arr = arrayOf(
        Pair(arrayOf("SOO", "OOO", "OOO"), arrayOf("E 2", "S 2", "W 1")),
        Pair(arrayOf("SOO", "OXX", "OOO"), arrayOf("E 2", "S 2", "W 1")),
        Pair(arrayOf("OSO", "OOO", "OXO", "OOO"), arrayOf("E 2", "S 3", "W 1")),
    )
    /*
    [2,1]
    [0,1]
    [0,0]
     */
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i.first, i.second)
        println(ans.contentToString())
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/172928
