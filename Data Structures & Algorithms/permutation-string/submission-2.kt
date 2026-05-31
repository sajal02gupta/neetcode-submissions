class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        val s1Map = getMapOfS1(s1)
        if (s1.length > s2.length) return false
        for (i in 0..<s2.length - s1.length + 1) {
            val strPart = s2.substring(i, i + s1.length)
            if (checkIfBothMapsAreEqual(s1Map, strPart)){
                return true
            }
        }
        return false
    }

    private fun checkIfBothMapsAreEqual(s1Map: Map<Char, Int>, strPart: String): Boolean {
        val s2Map = getMapOfS1(strPart)
        val ke = s2Map.entries.iterator()
        while (ke.hasNext()) {
            val key = ke.next().key
            if(!s1Map.containsKey(key)) {
                return false
            }
            if (s2Map[key] != s1Map[key]){
                return false
            }
        }
        return true
    }

    private fun getMapOfS1(str: String) : Map<Char, Int> {
        val map = mutableMapOf<Char, Int>()
        str.forEachIndexed { _, c ->
            if (map.containsKey(c)) {
                map[c] = map[c]?.plus(1) ?: 0
            }else {
                map[c] = 1
            }
        }
        return map
    }
}
