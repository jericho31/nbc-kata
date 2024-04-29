//// id_list 순회하는거 배열 초기화에 합쳐줬는데 오히려 느려지네...
//class Solution { fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
//    val idNumbering = HashMap<String, Int>(id_list.size)
//    val arrReporters = Array<MutableSet<String>>(id_list.size) { i ->
//        idNumbering[id_list[i]] = i
//        mutableSetOf()
//    }
//    report.forEach { s ->
//        val r = s.split(' ')
//        arrReporters[idNumbering[r[1]]!!] += r[0]
//    }
//    val ans = IntArray(id_list.size)
//    arrReporters.forEach { set ->
//        if (set.count() >= k) set.forEach { ++ans[idNumbering[it]!!] }
//    }
//    return ans
//} }

// 119ms(11,15)(6.8~160)
class Solution { fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
    val idNumbering = HashMap<String, Int>(id_list.size)
    id_list.forEachIndexed { i, s -> idNumbering[s] = i }
    val arrReporters = Array<MutableSet<String>>(id_list.size) { mutableSetOf() }
    report.forEach { s ->
        val r = s.split(' ')
        arrReporters[idNumbering[r[1]]!!] += r[0]
    }
    val ans = IntArray(id_list.size)
    arrReporters.forEach { set ->
        if (set.count() >= k) set.forEach { ++ans[idNumbering[it]!!] }
    }
    return ans
} }  // 35min

fun main() {
    val arr = arrayOf(
        Triple(
            arrayOf("muzi", "frodo", "apeach", "neo"),
            arrayOf("muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"),
            2
        ),
        Triple(arrayOf("con", "ryan"), arrayOf("ryan con", "ryan con", "ryan con", "ryan con"), 3),
    )
    /*
    [2,1,1,0]
    [0,0]
     */
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i.first, i.second, i.third)
        println(ans.contentToString())
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/92334
