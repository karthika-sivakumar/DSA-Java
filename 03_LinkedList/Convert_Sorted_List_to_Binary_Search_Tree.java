/*
Problem: Convert Sorted List to Binary Search Tree

Approach:
- If the list is empty, return null.
- If the list has only one node, create and return a tree node.
- Use slow and fast pointers to find the middle of the list.
- The middle node becomes the root of the BST.
- Break the list into two halves using prev.
- Recursively build the left subtree from the left half.
- Recursively build the right subtree from the right half.

Why it works:
- The list is sorted, so choosing the middle ensures a balanced BST.
- Recursion builds left and right subtrees correctly.

Time Complexity: O(n log n)
Space Complexity: O(log n)
*/

class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return new TreeNode(head.val);
        }
        ListNode slow = head, fast = head, prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        TreeNode root = new TreeNode(slow.val);
        prev.next = null;
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);
        return root;
    }
}
