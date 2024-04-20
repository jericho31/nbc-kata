/*
4ms (3~8) 정도 걸리는데, 아래꺼는 0.2ms (0.02~0.8) 정도 걸린다. sumOf가 많이 느린가?
아니면 ++ans는 비동기적으로 처리가 가능한데 compareTo의 반환값을 더하는 과정은 비동기가 불가해서?
일단 for문에 ++ans가 훨씬 빠르다는 거...
 */
//class Solution {
//    private val isPrime = BooleanArray(3001) { it and 1 != 0 }
//
//    init {
//        isPrime[1] = false
//        isPrime[2] = true
//        for (i in 3..55 step 2) {
//            if (!isPrime[i]) continue
//            for (j in i * 3..3000 step i * 2) {
//                isPrime[j] = false
//            }
//        }
//    }
//
//    fun solution(nums: IntArray): Int =
//        (0 until nums.size - 2).sumOf { i ->
//            (i + 1 until nums.size - 1).sumOf { j ->
//                (j + 1 until nums.size).sumOf { k ->
//                    isPrime[nums[i] + nums[j] + nums[k]].compareTo(false)
//                }
//            }
//        }
//}

class Solution {
    private val isPrime = BooleanArray(3001) { it and 1 != 0 }

    init {
        isPrime[1] = false
        isPrime[2] = true
        for (i in 3..55 step 2) {
            if (!isPrime[i]) continue
            for (j in i * 3..3000 step i * 2) {
                isPrime[j] = false
            }
        }
    }

    fun solution(nums: IntArray): Int {
        var ans = 0
        for (i in 0 until nums.size - 2) {
            for (j in i + 1 until nums.size - 1) {
                for (k in j + 1 until nums.size) {
                    if (isPrime[nums[i] + nums[j] + nums[k]]) ++ans
                }
            }
        }
        return ans
    }
}  // 32min - runtime error - fixed: 1001 -> 3001

fun main() {
    val arr = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(1, 2, 7, 6, 4),
    )
    // 1, 4
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12977
