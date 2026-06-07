class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        val freq = IntArray(26)
        var answer = 0
        var maxFrequency = 0

        var left = 0
        for (i in s.indices) {
            freq[s[i] - 'A']++
            maxFrequency = maxOf(freq[s[i] - 'A'], maxFrequency)
            while ((i - left +1) - maxFrequency > k){
                freq[s[left] - 'A']--
                left++
            }
            answer = maxOf(i-left+1, answer)
        }
        return answer
    }
}
