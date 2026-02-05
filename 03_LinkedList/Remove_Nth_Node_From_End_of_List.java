/*
Problem: Remove Nth Node From End of List

Approach:
- Create a dummy node start and point it to the head of the list.
- Initialize two pointers slow and fast at the dummy node.
- Move the fast pointer forward by n + 1 steps.
- Move both slow and fast pointers together until fast becomes null.
- At this point, slow is just before the node to be removed.
- Update slow.next to skip the target node.

Why it works:
- The dummy node simplifies edge cases like removing the head.
- Maintaining a fixed gap between `fast` and `slow` helps locate
  the nth node from the end in one traversal.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode slow = start, fast = start;
        for(int i=0; i<=n; i++){
            fast = fast.next;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }
}
