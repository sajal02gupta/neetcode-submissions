class Solution {

    fun encode(strs: List<String>): String {
    val sb = StringBuilder()

    for (str in strs) {
        sb.append(str.length)
        sb.append("#")
        sb.append(str)
    }

    return sb.toString()
}

fun decode(str: String): List<String> {
    val result = mutableListOf<String>()
    var i = 0

    while (i < str.length) {

        // find #
        var j = i
        while (str[j] != '#') {
            j++
        }

        // length of string
        val length = str.substring(i, j).toInt()

        // actual string
        val word = str.substring(j + 1, j + 1 + length)
        result.add(word)

        // move pointer
        i = j + 1 + length
    }

    return result
}
}
