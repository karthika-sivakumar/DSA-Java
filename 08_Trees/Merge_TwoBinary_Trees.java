/*
Problem: Merge Two Binary Trees

Approach:
- If one of the nodes is null, return the other node.
- If both nodes are present, create a new node with the sum of
  values from both trees.
- Recursively merge the left children and right children.
- The merged tree is built by combining corresponding nodes
  from both input trees.

Time Complexity: O(n)
Space Complexity: O(h)
where n is the number of nodes visited and h is the height of the tree
(due to recursion stack).
*/


class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null){
            return root2;
        }
        if(root2==null){
            return root1;
        }
        TreeNode merged = new TreeNode(root1.val + root2.val);
        merged.left = mergeTrees(root1.left, root2.left);
        merged.right = mergeTrees(root1.right, root2.right);
        return merged;
    }
}
