import java.util.PriorityQueue

class KthLargest(private val k: Int, nums: IntArray) {

    private val minHeap = PriorityQueue<Int>()
    
    init {
        for( num in nums) {
            minHeap.add(num)
            
            if (minHeap.size > k) minHeap.poll()
        }
    }

    fun add(`val`: Int): Int {
        minHeap.add(`val`)
        if (minHeap.size > k) minHeap.poll()
        return minHeap.peek()
    }
}