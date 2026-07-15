/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reorderList(head: ListNode?) {
        if (head?.next == null) return

        // Step 1: Find middle
        var slow = head
        var fast = head

        while (fast?.next != null && fast.next?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }

        // Step 2: Reverse second half
        var second = slow?.next
        slow?.next = null

        var prev: ListNode? = null
        while (second != null) {
            val next = second.next
            second.next = prev
            prev = second
            second = next
        }

        // Step 3: Merge two halves
        var first: ListNode? = head
        second = prev

        while (second != null) {
            val temp1 = first?.next
            val temp2 = second.next

            first?.next = second
            second.next = temp1

            first = temp1
            second = temp2
        }
    }
}
