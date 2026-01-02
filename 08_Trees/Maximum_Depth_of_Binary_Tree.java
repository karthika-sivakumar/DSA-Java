/*
Problem: Maximum Depth of Binary Tree

Approach:
- Use recursion to find the depth of the left and right subtrees.
- The depth of the current node is:
  1 + max(depth of left subtree, depth of right subtree).
- If the node is null, return 0.

Time Complexity:
- O(n), since every node is visited once.

Space Complexity:
- O(h), where h is the height of the tree.
  - Worst case: O(n) for a skewed tree
  - Best case: O(log n) for a balanced tree
*/


class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left) , maxDepth(root.right));
    }
}
