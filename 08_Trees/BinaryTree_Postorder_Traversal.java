/*
Problem: Binary Tree Postorder Traversal

Approach:
- Use recursion to perform postorder traversal.
- In postorder traversal, nodes are visited in the order:
  left subtree → right subtree → root.
- If the current node is null, return.
- Add the node’s value to the result list after traversing
  both left and right subtrees.

Time Complexity: O(n)
Space Complexity: O(h)
where n is the number of nodes in the tree and
h is the height of the tree due to recursion stack.
*/

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorder(root,res);
        return res;
    }
    private void postorder(TreeNode node, List<Integer> res){
        if(node==null)
          return;
        postorder(node.left, res);
        postorder(node.right, res);
        res.add(node.val);
    } 
}
