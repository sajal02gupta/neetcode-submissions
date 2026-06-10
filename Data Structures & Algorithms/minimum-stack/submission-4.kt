class MinStack() {
    private val stack = ArrayDeque<Int>()
    private val minStack = ArrayDeque<Int>()

    fun push(value: Int) {
        stack.addLast(value)

        if (minStack.isEmpty() || value <= minStack.last()) {
            minStack.addLast(value)
        }
    }

    fun pop() {
        val removed = stack.removeLast()

        if (removed == minStack.last()) {
            minStack.removeLast()
        }
    }

    fun top(): Int {
        return stack.last()
    }

    fun getMin(): Int {
        return minStack.last()
    }
}