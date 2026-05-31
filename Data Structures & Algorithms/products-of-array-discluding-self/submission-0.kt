class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val prefix = IntArray(nums.size)
        val suffix = IntArray(nums.size)
        prefix[0] = 1
        suffix[nums.size - 1] = 1
        for (i in 1..<nums.size) {
            prefix[i] = nums[i-1] * prefix[i-1]
        }
        for (i in nums.size - 2 downTo 0) {
            suffix[i] = nums[i+1] * suffix[i+1]
        }
        val result = IntArray(prefix.size)
        prefix.forEachIndexed { index, i ->
            result[index] = prefix[index] * suffix[index]
        }
        return result
    }
}
