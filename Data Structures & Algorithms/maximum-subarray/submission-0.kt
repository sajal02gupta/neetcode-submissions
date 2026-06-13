class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var maxSumFinal = Integer.MIN_VALUE
        var maxSumTemp = 0
        for (num in nums) {
            maxSumTemp += num
            maxSumFinal = max(maxSumFinal, maxSumTemp)
            if (maxSumTemp < 0){
                maxSumTemp = 0
            }
        }
        return maxSumFinal
    }
}
