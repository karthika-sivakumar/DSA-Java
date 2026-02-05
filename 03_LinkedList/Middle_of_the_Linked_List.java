/*
Problem: Middle of the Linked List

Approach:
- Use two pointers:
  - Slow pointer moves one step at a time.
  - Fast pointer moves two steps at a time.
- When the fast pointer reaches the end, the slow pointer
  will be at the middle of the list.
- If there are two middle nodes, the second middle is returned.

Why it works:
- The fast pointer moves twice as fast as the slow pointer,
  so the slow pointer reaches the middle when fast reaches the end.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public ListNode middleNode(ListNode head) {
       if(head==null || head.next==null){
        return head;
       }
       ListNode slow = head, fast = head;
       while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
       }
       return slow;
    }
}
