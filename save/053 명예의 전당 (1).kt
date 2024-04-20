import java.util.PriorityQueue

// SortedSet 쓸까 했는데 k번째 접근을 계속 하는 게 비효율. 아니 중복점수 사라지면 안되잖아?
// MutableList로 이진탐색해서 집어넣다가 이럴거면 힙으로 최솟값만 보면 되겠네..
class Solution { fun solution(k: Int, score: IntArray): IntArray {
    val kk = if (k <= score.size) k else score.size
    val ans = IntArray(score.size)
    val pq = PriorityQueue<Int>()
    for (i in 0 until kk) {
        pq.offer(score[i])
        ans[i] = pq.peek() }
    for (i in kk until score.size) {
        if (score[i] > pq.peek()) {
            pq.poll()
            pq.offer(score[i]) }
        ans[i] = pq.peek() }
    return ans }
}

fun main() {
    val arr = arrayOf(
        Pair(3, intArrayOf(10, 100, 20, 150, 1, 100, 200)),
        Pair(4, intArrayOf(0, 300, 40, 300, 20, 70, 150, 50, 500, 1000)),
    )
    // [10, 10, 10, 20, 20, 100, 100], [0, 0, 0, 0, 20, 40, 70, 70, 150, 300]
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i.first, i.second)
        println(ans.contentToString())
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/138477
