class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val numSet = nums.toHashSet()
        var longest = 0

        for (num in numSet) {
            if (!numSet.contains(num -1)){
                var streak = 1
                var current = num

                while (numSet.contains(current+ 1)) {
                    streak++
                    current++
                }
                longest = max(longest, streak)
            }
        }
        return longest
    }
}
