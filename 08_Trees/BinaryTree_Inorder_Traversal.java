/*
Problem: Binary Tree Inorder Traversal

Approach:
- Use recursion to perform inorder traversal.
- In inorder traversal, visit nodes in the order:
  left subtree → root → right subtree.
- If the current node is null, return.
- Add the node’s value to the result list after traversing the left subtree.

Time Complexity: O(n)
Space Complexity: O(h)
where n is the number of nodes in the tree and
h is the height of the tree (due to recursion stack).
*/

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }
    private void inorder(TreeNode node, List<Integer> res){
        if(node==null){
            return;
        }
        inorder(node.left, res);
        res.add(node.val);
        inorder(node.right, res);
    }
}
