import java.util.Locale.getDefault

class Solution {
        fun isPalindrome(s: String): Boolean {
        val result = s.replace(Regex("[^A-Za-z0-9]"), "")
        val concatStr = result.toCharArray().joinToString("").lowercase(getDefault())
        val reverseStr = concatStr.reversed()
        return reverseStr == concatStr
    }
}
