/*
Problem: Binary Tree Preorder Traversal

Approach:
- Use recursion to perform preorder traversal.
- In preorder traversal, nodes are visited in the order:
  root → left subtree → right subtree.
- If the current node is null, return.
- Add the node’s value to the result list before
  traversing the left and right subtrees.

Time Complexity: O(n)
Space Complexity: O(h)
where n is the number of nodes in the tree and
h is the height of the tree due to recursion stack.
*/

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root,res);
        return res;
    }
    private void preorder(TreeNode node, List<Integer> res){
        if(node==null)
          return;
        res.add(node.val);
        preorder(node.left, res);
        preorder(node.right, res);
    }
}
