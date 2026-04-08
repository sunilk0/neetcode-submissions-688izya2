/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reorderList(head: ListNode?): Unit {
        if(head == null || head.next == null) return 
      //step1: find middle
        var slow = head
        var fast = head
        while(fast?.next !=null && fast.next?.next!=null){
            slow = slow?.next!! //by one
            fast = fast.next!!.next //fast by two
        }
        //slow is at middle
      //reverse second list
        var prev:ListNode? = null
        var curr = slow.next
     
        while(curr!=null){
            var temp = curr.next
            curr.next = prev
            prev = curr 
            curr = temp
        }
        slow.next = null

        //step3: merge two halves
        var first = head
        var second = prev
       while(first !=null && second!=null){
        val tmp1 = first.next
        val tmp2 = second.next
        first.next= second
        second.next = tmp1
        first = tmp1
        second = tmp2
       }
    }
}
