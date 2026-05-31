class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        nums.sort()
        for (i in 0..<nums.lastIndex) {
            if (nums[i] == nums[i + 1]) return true
        }
        return false
    }
}
