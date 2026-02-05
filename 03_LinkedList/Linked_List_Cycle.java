/*
Problem: Linked List Cycle

Approach:
- Use two pointers:
  - Slow pointer moves one step at a time.
  - Fast pointer moves two steps at a time.
- If there is a cycle, the fast and slow pointers will meet.
- If the fast pointer reaches null, there is no cycle.

Why it works:
- In a cyclic list, the fast pointer eventually catches up to the slow pointer.
- This is known as Floyd’s Cycle Detection algorithm.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
