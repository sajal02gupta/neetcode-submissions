class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val intArr = IntArray(k)
        val map = HashMap<Int, Int>()
        for (i in nums.indices) {
            if (map.containsKey(nums[i])) {
                map[nums[i]] = map[nums[i]]!!.plus(1)
            }else {
                map.getOrPut(nums[i], { 1 })
            }
        }
        val sorted = map.toList().sortedByDescending { it.second }
        for (j in 0..k-1) {
            intArr[j] = sorted[j].first
        }
        return intArr
    }
}
