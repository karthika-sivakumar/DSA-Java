/*
Problem: Remove Duplicates from Sorted List II

Approach:
- Create a dummy node start and point it to the head.
- Use two pointers:
  - prev tracks the last node before duplicates.
  - curr is used to scan the list.
- If curr and curr.next have the same value:
  - Move curr forward until all duplicates are skipped.
  - Link prev.next to the node after duplicates.
- If no duplicate is found:
  - Move prev forward.
- Continue until the end of the list.

Why it works:
- The list is sorted, so duplicate values appear next to each other.
- Using a dummy node helps handle cases where the head itself is duplicated.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode start = new ListNode(-1);
        start.next = head;
        ListNode prev = start, curr = head;
        while(curr!=null && curr.next!=null){
            if(curr.val == curr.next.val){
                while(curr.next!=null && curr.val==curr.next.val){
                    curr = curr.next;
                }
                prev.next = curr.next;
            }
            else{
                prev = prev.next;
            }
            curr = curr.next;
        }
        return start.next;
    }
}
