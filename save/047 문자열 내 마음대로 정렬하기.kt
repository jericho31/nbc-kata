// sort, sortBy, sortWith
class Solution { fun solution(strings: Array<String>, n: Int): Array<String> =
    strings.apply { sortWith(compareBy({ it[n] }, { it })) }
}

//class Solution { fun solution(strings: Array<String>, n: Int): Array<String> =
//    strings.apply { sort(); sortBy { it[n] } }
//}

//class Solution { fun solution(strings: Array<String>, n: Int): Array<String> =
//    strings.apply { sort() }.apply { sortBy { it[n] } }
//}

//class Solution { fun solution(strings: Array<String>, n: Int): Array<String> {
//    strings.sort()
//    strings.sortBy { it[n] }
//    return strings }
//}

fun main() {
    val arr = arrayOf(
        Pair(arrayOf("sun", "bed", "car"), 1),
        Pair(arrayOf("abce", "abcd", "cdx"), 2),
    )
    // ["car", "bed", "sun"], ["abcd", "abce", "cdx"]
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i.first, i.second)
        println(ans.contentToString())
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12915
