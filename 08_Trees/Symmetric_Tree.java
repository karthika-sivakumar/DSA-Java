/*
Problem: Symmetric Tree

A binary tree is symmetric if the left and right subtrees
are mirror images of each other.

Approach:
- If the root is null, the tree is symmetric.
- Use a helper function to compare two subtrees.
- Two trees are mirrors if:
  1. Both are null → true
  2. One is null → false
  3. Their values are equal
  4. Left of one matches right of the other, and vice versa

This is solved using recursion.

Time Complexity: O(n)
- Each node is visited once.

Space Complexity: O(h)
- Due to recursion stack, where h is the height of the tree.
*/

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isMirror(root.left , root.right);
    }
    private boolean isMirror(TreeNode t1, TreeNode t2){
        if(t1==null && t2==null){
            return true;
        }
        if(t1==null || t2==null){
            return false;
        }
        return (t1.val == t2.val) && isMirror(t1.left , t2.right) && isMirror(t1.right, t2.left);
    }
}
