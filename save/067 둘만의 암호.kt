class Solution { fun solution(s: String, skip: String, index: Int): String {
    val skipArr = BooleanArray(26)
    skip.forEach { skipArr[it - 'a'] = true }
    val sb = StringBuilder()
    s.forEach { c ->
        var n = c - 'a'
        for (i in 1..index) {
            if (++n >= 26) n -= 26
            while (skipArr[n]) {
                if (++n >= 26) n -= 26
            }
        }
        sb.append('a' + n)
    }
    return sb.toString()
} }

// https://school.programmers.co.kr/learn/courses/30/lessons/155652
