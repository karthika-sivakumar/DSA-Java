/*
Problem: Rotate List

Approach:
- If the list is empty, has one node, or k is 0, return the head.
- Traverse the list to find its length and last node.
- Connect the last node to the head to form a circular list.
- Reduce k using modulo to avoid extra rotations.
- Move the pointer to the new tail position.
- Break the circle and update the new head.

Why it works:
- Rotating the list is equivalent to shifting the breaking point.
- Making the list circular simplifies the rotation logic.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        ListNode temp = head;
        int length = 1;
        while(temp.next!=null){
            temp = temp.next;
            length++;
        }
        temp.next = head;
        k = k % length;
        k = length - k;
        while(k-- > 0){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}
