class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val colSize = matrix[0].size
        for (row in matrix) {
            var left = 0
            var right = colSize-1
            while (left <= right) {
                val mid = left + (right - left) / colSize
                if (row[mid] == target) return true
                if (row[mid] < target) {
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            }
        }
        return false
    }
}
