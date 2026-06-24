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
    int count=0;
    public void pre(TreeNode root,int max)
    {
        if(root==null)
        return;
        if(root.val>=max)
        {
            count++;
            max=root.val;
        }

        pre(root.left,max);
        pre(root.right,max);
    }
    public int goodNodes(TreeNode root) {
        pre(root,root.val);
        return count;
    }
}
