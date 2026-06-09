class Solution {
    fun minWindow(s: String, t: String): String {
        if (s.length < t.length) return ""
        if (s.contains(t)){
            return t
        }

        var minString = ""
        for ((i, element) in s.withIndex()) {
            val tMap = mutableMapOf<Char, Int>()
            t.forEachIndexed { _, c ->
                tMap[c] = tMap[c]?.plus(1) ?: 1
            }
            if (!tMap.containsKey(element)) continue
            val tempStr = StringBuilder()
            tempStr.append(element)
            tMap[element] = tMap[element]?.minus(1) ?: 0
            for (j in i+1 until s.length) {
                if (!tMap.containsKey(s[j])) {
                    tempStr.append(s[j])
                }else {
                    tMap[s[j]] = tMap[s[j]]?.minus(1) ?: 0
                    tempStr.append(s[j])
                }
                if (tMap.values.all { it <= 0 }) {
                    if (minString == "") minString = tempStr.toString()
                    if (tempStr.length < minString.length) minString = tempStr.toString()
                    break
                }
            }
        }
        return minString
    }
}
