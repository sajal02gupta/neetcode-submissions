class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = ArrayDeque<Int>()

        for (token in tokens) {
            if (token.toIntOrNull() != null) {
                stack.addLast(token.toInt())
                continue
            }

            val right = stack.removeLast()
            val left = stack.removeLast()

            val result = when (token) {
                "+" -> left + right
                "-" -> left - right
                "*" -> left * right
                "/" -> left / right
                else -> error("Invalid operator")
            }

            stack.addLast(result)
        }

        return stack.last()
    }
}
