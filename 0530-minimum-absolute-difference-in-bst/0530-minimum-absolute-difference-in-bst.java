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
    ArrayList<Integer> li = new ArrayList<>();
    public void Inorder(TreeNode root){
        if(root == null) return;

        Inorder(root.left);
        li.add(root.val);
        Inorder(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        Inorder(root);
        int minimum = Integer.MAX_VALUE;
        for(int i = 1; i < li.size(); i++){
            minimum = Math.min(minimum, li.get(i) - li.get(i - 1));
        }
        return minimum;
    }
}