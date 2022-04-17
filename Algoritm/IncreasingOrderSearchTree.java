/**
 * Definition for a binary tree node.*/
  public class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
 TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    TreeNode result = null;
    TreeNode head = null;
    public TreeNode increasingBST(TreeNode root) {
        //Base Case
       if(root==null)
       {return null;}
        increasingBST(root.left);
       if(result==null){
           result=new TreeNode(root.val);
           head=result;
       }
     else{
         result.right=new TreeNode(root.val);
         result=result.right;
     }
        increasingBST(root.right);
        return head;
    }
}
 
