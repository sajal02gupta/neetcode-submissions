import java.util.ArrayDeque
class Solution {

    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        val deque = ArrayDeque<Int>() // stores indices
        val result = IntArray(nums.size - k + 1)

        var resultIndex = 0

        for (i in nums.indices) {

            // Remove indices outside the window
            while (deque.isNotEmpty() && deque.first() <= i - k) {
                deque.removeFirst()
            }

            // Remove smaller values from the back
            while (deque.isNotEmpty() &&
                nums[deque.last()] <= nums[i]) {
                deque.removeLast()
            }

            deque.addLast(i)

            // Window formed
            if (i >= k - 1) {
                result[resultIndex++] = nums[deque.first()]
            }
        }

        return result
    }
}
