// ~0.26ms
class Solution { fun solution(wallpaper: Array<String>): IntArray {
    val ans = intArrayOf(50, 50, 1, 1)
    wallpaper.forEachIndexed { x, s ->
        s.forEachIndexed { y, c ->
            if (c == '#') {
                if (ans[0] > x) ans[0] = x
                if (ans[1] > y) ans[1] = y
                if (ans[2] <= x) ans[2] = x + 1
                if (ans[3] <= y) ans[3] = y + 1
            }
        }
    }
    return ans
} }  // 13min

fun main() {
    val arr = arrayOf(
        arrayOf(".#...", "..#..", "...#."),
        arrayOf("..........", ".....#....", "......##..", "...##.....", "....#....."),
        arrayOf(
            ".##...##.",
            "#..#.#..#",
            "#...#...#",
            ".#.....#.",
            "..#...#..",
            "...#.#...",
            "....#...."
        ),
        arrayOf("..", "#."),
    )
    /*
    [0, 1, 3, 4]
    [1, 3, 5, 8]
    [0, 0, 7, 9]
    [1, 0, 2, 1]
     */
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i)
        println(ans.contentToString())
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/161990
