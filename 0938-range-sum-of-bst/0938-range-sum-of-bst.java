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
    public int rangeSumBST(TreeNode root, int low, int high) {
        Inorder(root);
        int res = 0;
        for(int n : li){
            if(n >= low && n <= high){
                res += n;
            }
        }
        return res;
    }
}