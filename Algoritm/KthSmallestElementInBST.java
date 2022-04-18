/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count, res;
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        kthSmallestHelper(root);
        return res;
    }
    public void kthSmallestHelper(TreeNode root) {
        if(root == null) {
            return;
        }
        kthSmallestHelper(root.left);
        // inorder traversal which means the left part first
        count--;
        // decrement the count value after each iteration
        /* now comes the iteration for the root */
        if(count == 0) {
            // incase, the count is zero, we update the res to root.val
            res = root.val;
            return;
        }
        kthSmallestHelper(root.right);
        // otherwise, we go back and iterate over our right part/ child
        return;
        
    }
}
