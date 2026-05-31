class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(complement)) {
                val j = map[complement]!!  //0
                return intArrayOf(j, i)
            }
            map[nums[i]] = i
        }
        return nums
    }
}
