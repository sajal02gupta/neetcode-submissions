class Solution {
        fun lastStoneWeight(stones: IntArray): Int {
        val heap = PriorityQueue<Int>(compareByDescending { it })
        for (stone in stones) {
            heap.add(stone)
        }
        while (heap.isNotEmpty()) {
            if (heap.size == 1) return heap.poll()
            val x = heap.poll()
            val y = heap.poll()
            if (x==y && heap.isEmpty()) return x-y
            if (x==y) continue
            heap.add(x-y)
        }
        return heap.poll()
    }
}
