//// 이게 어떻게 성능이 좋지..? arr로 처리하는 방식. 최대 천만이라 당연히 맵으로 해야 할 줄.
//// 근데 생각해보면 최악의 경우 맵으로도 천만개 생기는 건 같으니...?가 아니라 같지 않음. 최대 10만개니까.
//// 메모리 제한 신경써서 해놨으면 통과 안됐을 수 있음. 그래도 성능 의외로 좋다는 건 충격이네...
//// 19.3ms(~10)(13.9~239)(29,30,34: 76,100,55)
//class Solution { fun solution(k: Int, tangerine: IntArray): Int {
//    val arr = IntArray(tangerine.maxOrNull()!! + 1)
//    for (i in tangerine) ++arr[i]
//    arr.sortDescending()
//    var ans = 0
//    var sum = 0
//    for (i in arr) {
//        sum += i
//        ++ans
//        if (sum >= k) break
//    }
//    return ans
//} }

// 참고) 그룹바이로 묶음. 그룹바이 성능 왤케 좋음...? (기능 더 많으면서 성능 동등)
class Solution { fun solution(k: Int, tangerine: IntArray): Int {
    var ans = 0
    var sum = 0
    for (i in tangerine.groupBy { it }.map { it.value.size }.sortedDescending()) {
        sum += i
        ++ans
        if (sum >= k) break
    }
    return ans
} }

//// ...? return 구조만 바꿨는데 성능차이가 이렇게 난다고...? 의외로 10 평균은 안나네...?
//// 36.7ms(~10)(7.13~66.7)(29,30,34: 56,66,58)
//class Solution { fun solution(k: Int, tangerine: IntArray): Int {
//    val map = HashMap<Int, Int>()
//    for (i in tangerine) map[i] = (map[i] ?: 0) + 1
//    var ans = 0
//    var sum = 0
//    for (i in map.values.sortedDescending()) {
//        sum += i
//        ++ans
//        if (sum >= k) break
//    }
//    return ans
//} }

//// HashMap으로 바꿨을 뿐인데 성능 향상 크네... 좋은 서버 고른 것도 있긴 한데.
//// 37ms(~10)(7.28~100)(29,30,34: 100,96,60)
//class Solution { fun solution(k: Int, tangerine: IntArray): Int {
//    val map = HashMap<Int, Int>()
//    for (i in tangerine) map[i] = (map[i] ?: 0) + 1
//    var ans = 0
//    var sum = 0
//    for (i in map.values.sortedDescending()) {
//        sum += i
//        ++ans
//        if (sum >= k) return ans
//    }
//    return 0  // error
//} }

//// 50ms(~10)(9.63~151)(29,30,34: 103,114,151)
//class Solution { fun solution(k: Int, tangerine: IntArray): Int {
//    val map = mutableMapOf<Int, Int>()
//    for (i in tangerine) map[i] = (map[i] ?: 0) + 1
//    var ans = 0
//    var sum = 0
//    for (i in map.values.sortedDescending()) {
//        sum += i
//        ++ans
//        if (sum >= k) return ans
//    }
//    return 0  // error
//} }  // 19min

fun main() {
    val arr = arrayOf(
        Pair(6, intArrayOf(1, 3, 2, 5, 4, 5, 2, 3)),
        Pair(4, intArrayOf(1, 3, 2, 5, 4, 5, 2, 3)),
        Pair(2, intArrayOf(1, 1, 1, 1, 2, 2, 2, 3)),
    )
    /*
    3
    2
    1
     */
    val s = Solution()
    for (i in arr) {
        val ans = s.solution(i.first, i.second)
        println(ans)
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/138476
