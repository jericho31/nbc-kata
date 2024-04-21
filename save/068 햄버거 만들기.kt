import java.util.Stack

// 256(1비트) 미만으로 가능한 배열이면 StringBuilder 쓰는 게 최고네.
// 참고, 40ms(6~9)(8.5 ~ 84.1)
class Solution { fun solution(ingredient: IntArray): Int {
    var ans = 0
    val sb = StringBuilder()
    for (n in ingredient) {
        sb.append('0' + n)
        if (n == 1 && sb.takeLast(4) == "1231") {
            sb.setLength(sb.length - 4)
            ++ans
        }
    }
    return ans
} }

//// 개선하겠다고 해봤는데 더 느리네
//// 65ms(6~9)(9.1 ~ 115)
//class Solution {
//    private val combination = arrayListOf(2, 3)
//
//    fun solution(ingredient: IntArray): Int {
//        if (ingredient.size < 4) return 0
//
//        var ans = 0
//        val sia = Stack<ArrayList<Int>>()
//        var i = ingredient.indexOfFirst { it == 1 }
//        if (i == -1) return 0
//        sia.push(arrayListOf(4))  // EmptyStackException 방지용
//        sia.push(arrayListOf())
//        var prev = i
//        while (++i < ingredient.size) {
//            if (ingredient[i] != 1) continue
//            val top = sia.peek()
//            top.addAll(ingredient.copyOfRange(prev + 1, i).toTypedArray())
//            if (top == combination) {
//                sia.pop()
//                ++ans
//            } else {
//                sia.push(arrayListOf())
//            }
//            prev = i
//        }
//        return ans
//    }
//}

////// 50ms(6~9)(0.1 ~ 99)
//class Solution {
//    private val combination = arrayListOf(2, 3)
//
//    fun solution(ingredient: IntArray): Int {
//        if (ingredient.size < 4) return 0
//
//        var ans = 0
//        val sia = Stack<ArrayList<Int>>()
//        sia.push(arrayListOf(4))
//        for (i in ingredient.indices) {
//            val n = ingredient[i]
//            if (n == 1) {
//                if (sia.peek() == combination) {
//                    sia.pop()
//                    ++ans
//                } else sia.push(arrayListOf())
//            } else sia.peek().add(n)
//        }
//        return ans
//    }
//}

//// 210ms(6~9)(4.3 ~ 1155)
//class Solution {
//    private val combination = listOf(1, 2, 3, 1)
//
//    fun solution(ingredient: IntArray): Int {
//        if (ingredient.size < 4) return 0
//
//        var ans = 0
//        val arr = ingredient.toMutableList()
//        var i = 2
//        while (++i < arr.size) {
//            if (arr[i] == 1) {
//                if (arr.subList(i - 3, i + 1) == combination) {
//                    ++ans
//                    arr.subList(i - 3, i + 1).clear()  // 이렇게 하면 removeRange 느낌으로 가능하네
//                    if (i >= 6) i -= 3 else i = 2
//                }
//            }
//        }
//        return ans
//    }
//}  // 40min

//// timeout
//class Solution {
//    private val combination = intArrayOf(1, 2, 3, 1)
//
//    fun solution(ingredient: IntArray): Int {
//        if (ingredient.size < 4) return 0
//
//        var ans = 0
//        var arr = ingredient.copyOf()
//        var i = 2
//        while (++i < arr.size) {
//            if (arr[i] == 1) {
//                if (arr.copyOfRange(i - 3, i + 1).contentEquals(combination)) {
//                    ++ans
//                    arr = arr.copyOfRange(0, i - 3) + arr.copyOfRange(i + 1, arr.size)
//                    if (i >= 6) i -= 3 else i = 2
//                }
//            }
//        }
//        return ans
//    }
//}  // timeout, 29min

fun main() {
    val arr = arrayOf(
        intArrayOf(2, 1, 1, 2, 3, 1, 2, 3, 1),
        intArrayOf(1, 3, 2, 1, 2, 1, 3, 1, 2),
        intArrayOf(1, 2, 3, 1, 1, 2, 3, 1),
    )
    // 2, 0, 2
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/133502
