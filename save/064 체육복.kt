class Solution { fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
    val arr = IntArray(n + 2)
    reserve.forEach { arr[it] += 1 }
    lost.forEach { arr[it] -= 1 }
    var ans = 0
    for (i in 1..n) {
        if (arr[i] >= 0) ++ans
        else {
            if (arr[i - 1] == 1) ++ans
            else if (arr[i + 1] == 1) {
                arr[i + 1] = 0
                ++ans
            }
        }
    }
    return ans
} }  // 참고, 45min

//// 앞 뒤 어느 쪽에 줘야할지 몰라서 두 번 순회했는데, 앞에부터 받아오도록 (한방향으로) 하면 그냥 괜찮은 듯?
//// 그래서 내 로직은 총 3번 순회하는데, 1번으로 끝낼 수 있는 듯.
//// 0.02ms
//class Solution {
//    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
//        val arr = IntArray(n + 2)
//        lost.forEach { arr[it] -= 1 }
//        reserve.forEach { arr[it] += 1 }
//        for (i in 1..n) {
//            if (arr[i] == 1) {
//                if (arr[i - 1] == -1 && arr[i + 1] >= 0) {
//                    arr[i] = 0
//                    arr[i - 1] = 0
//                } else if (arr[i + 1] == -1 && arr[i - 1] >= 0) {
//                    arr[i] = 0
//                    arr[i + 1] = 0
//                }
//            }
//        }
//        for (i in 1..n) {
//            if (arr[i] == 1) {
//                if (arr[i - 1] == -1) {
//                    arr[i] = 0
//                    arr[i - 1] = 0
//                } else if (arr[i + 1] == -1) {
//                    arr[i] = 0
//                    arr[i + 1] = 0
//                }
//            }
//        }
//        return arr.count { it >= 0 } - 2
//    }
//}  // 17min

fun main() {
    val arr = arrayOf(
        Triple(5, intArrayOf(2, 4), intArrayOf(1, 3, 5)),
        Triple(5, intArrayOf(2, 4), intArrayOf(3)),
        Triple(3, intArrayOf(3), intArrayOf(1)),
    )
    // 5, 4, 2
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i.first, i.second, i.third)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/42862
