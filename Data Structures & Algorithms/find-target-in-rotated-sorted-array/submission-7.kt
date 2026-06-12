class Solution {
        private fun binarySearchIt(nums: IntArray, target: Int) : Int {
        var left = 0
        var right = nums.lastIndex
        while (left <= right) {
            val mid = left + (right - left) / 2
            if (nums[mid] == target) {
                return mid
            }
            if(nums[mid] > target){
                right = mid -1
            }else {
                left = mid + 1
            }
        }
        return -1
    }

    fun search(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.lastIndex

    while (left <= right) {

        // Middle of current search range
        val mid = left + (right - left) / 2

        // Target found
        if (nums[mid] == target) {
            return mid
        }

        // Determine which side is sorted
        if (nums[left] <= nums[mid]) {

            // Left side is sorted:
            // [left ... mid]

            if (target >= nums[left] &&
                target < nums[mid]
            ) {
                // Target must be in left half
                right = mid - 1
            } else {
                // Target must be in right half
                left = mid + 1
            }

        } else {

            // Right side is sorted:
            // [mid ... right]

            if (target > nums[mid] &&
                target <= nums[right]
            ) {
                // Target must be in right half
                left = mid + 1
            } else {
                // Target must be in left half
                right = mid - 1
            }
        }
    }

    return -1
}
}
