class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) return 0
        var maxLength = 1
        var str = StringBuilder().append(s[0])
        for (i in 1 until s.length) {
            str.append(s[i])
            if (checkIfStringHasDuplicates(str.toString())){
                str.deleteCharAt(0)
            }else {
                maxLength++
            }
        }
        return maxLength
    }

    private fun checkIfStringHasDuplicates(string: String) : Boolean {
        val map = mutableMapOf<Char, Int>()
        string.forEachIndexed { index, c ->
            if (map.containsKey(c)) {
                return true
            }else {
                map[c] = 1
            }
        }
        return false
    }
}
