/*
Problem: Minimum Depth of Binary Tree

Approach:
- If the root is null, the depth is 0.
- If one child is null, we must take the depth from the other child
  (because minimum depth must reach a leaf node).
- If both children exist, take the minimum depth between left and right.
- Add 1 for the current node.

Time Complexity:
- O(n), since each node is visited once.

Space Complexity:
- O(h), where h is the height of the tree.
  - Worst case: O(n) for a skewed tree
  - Best case: O(log n) for a balanced tree
*/

class Solution {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null){
            return 1 + minDepth(root.right);
        }
        if(root.right==null){
            return 1 + minDepth(root.left);
        }
        return 1 + Math.min(minDepth(root.left) , minDepth(root.right));
    }
}
