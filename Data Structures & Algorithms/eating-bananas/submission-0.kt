class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var left = 1
        var right = piles.max()
        var answer = right

        while (left <= right) {
            val mid = left + (right - left) / 2
            var hours = 0
            for (p in piles) {
                hours += (p + mid - 1) / mid
            }
            if (hours <= h) {
                answer = mid
                right = mid -1
            }else {
                left = mid + 1
            }
        }
        return answer
    }
}
