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
    int cnt=0;
    public int longestUnivaluePath(TreeNode root) {
        path(root);
        return cnt;
        
    }
    public int path(TreeNode root){
        if(root==null){
            return 0;
        }
        int lc=0;
        int rc=0;
        int lh=path(root.left);
        int rh= path(root.right);
        if(root.left!=null && root.left.val==root.val){
            lc=lh+1;
        }
        if(root.right!=null && root.right.val==root.val){
            rc=rh+1;
        }
        cnt=Math.max(cnt,lc+rc);
        return Math.max(lc,rc);
    }
}