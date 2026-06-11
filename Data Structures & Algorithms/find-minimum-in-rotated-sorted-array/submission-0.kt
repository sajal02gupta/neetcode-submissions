class Solution {
    fun findMin(nums: IntArray): Int {
        var left = 0
        var right = nums.lastIndex

        while (left < right) {
            if (nums[left] < nums[right]) return nums[left]
            
            val mid = left + (right - left) / 2
            
            if (nums[mid] > nums[right]) {
                left = mid + 1
            } else {
                right = mid
            }
        }
        return nums[left]
    }
}
