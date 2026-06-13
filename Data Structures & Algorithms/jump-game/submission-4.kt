class Solution {
    fun canJump(nums: IntArray): Boolean {
        var maxReach = 0

        for (i in nums.indices) {

            // Can't even reach this position
            if (i > maxReach) {
                return false
            }

            // Update farthest reachable index
            maxReach = maxOf(maxReach, i + nums[i])

            // Already able to reach the end
            if (maxReach >= nums.lastIndex) {
                return true
            }
        }

        return true
    }
}
