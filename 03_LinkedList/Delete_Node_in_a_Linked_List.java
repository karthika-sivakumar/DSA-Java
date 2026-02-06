/*
Problem: Delete Node in a Linked List

Approach:
- Copy the value of the next node into the given node.
- Update the given node to point to the next of the next node.
- This effectively removes the next node from the list.

Why it works:
- We are not given access to the head of the list.
- Overwriting the current node with the next node deletes it logically.

Time Complexity: O(1)
Space Complexity: O(1)
*/

class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
