/*
Problem: Remove Duplicates from Sorted List

Approach:
- Traverse the linked list starting from the head using temp.
- Compare temp with the next node.
- If both values are equal, skip the next node.
- Otherwise, move temp to the next node.
- Continue until the end of the list.

Why it works:
- The list is already sorted, so duplicates appear next to each other.
- Skipping duplicate nodes keeps only unique values.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp!=null && temp.next!=null){
            if(temp.val != temp.next.val){
                temp = temp.next;
            }
            else{
                temp.next = temp.next.next;
            }
        }
        return head;
    }
}
