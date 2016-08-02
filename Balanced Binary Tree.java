/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode node) {
        if (node == null) {
            return true;
        }
        
        int leftSubTreeHeight = height(node.left);
        int rightSubTreeHeight = height(node.right);
        
        return (
            Math.abs(leftSubTreeHeight - rightSubTreeHeight) <= 1
            && isBalanced(node.left)
            && isBalanced(node.right)
        );
    }
    
    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        
        return 1 + Math.max(
            height(node.left)
            , height(node.right)
        );
    }
}
