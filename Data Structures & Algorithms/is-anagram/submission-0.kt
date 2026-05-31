class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val alphaArray = IntArray(26)
        for (i in s.toCharArray()) {
            alphaArray[i - 'a'] = alphaArray[i - 'a'] + 1
        }
        for (i in t.toCharArray()) {
            alphaArray[i - 'a'] = alphaArray[i - 'a'] - 1
        }
        for (i in 0..alphaArray.lastIndex) {
            if (alphaArray[i] != 0) {
                return false
            }
        }
        return true
    }
}
