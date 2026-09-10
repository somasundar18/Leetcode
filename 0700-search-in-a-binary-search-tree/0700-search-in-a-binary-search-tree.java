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
    public TreeNode Find(TreeNode root, int key){
        if(root == null) return null;
        
        if(key < root.val){
            return Find(root.left, key);
        }
        else if(key > root.val){
            return Find(root.right, key);
        }
        return root;
    }
    public TreeNode searchBST(TreeNode root, int val) {
        return Find(root, val);
    }
}