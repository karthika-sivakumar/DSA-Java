/*
Problem: Search in a Binary Search Tree

Approach:
- If the current node is null, the value is not found.
- If the current node’s value matches the target, return the node.
- If the target value is smaller than the current node’s value,
  search in the left subtree.
- If the target value is greater than the current node’s value,
  search in the right subtree.
- This works because, in a BST, left subtree values are smaller
  and right subtree values are larger than the root.

Time Complexity: O(h)
Space Complexity: O(h)
where h is the height of the tree.
(In the worst case, h = n for a skewed tree; in the best case, h = log n.)
*/

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return null;
        }
        if(root.val == val){
            return root;
        }
        else if(val < root.val){
            return searchBST(root.left, val);
        }
        else{
            return searchBST(root.right, val);
        }
    }
}
