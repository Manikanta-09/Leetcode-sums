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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        if(root==null){
            return lst;
        }
        return inorder(root,lst);
    }
    public List inorder(TreeNode root,List lst){
        if(root==null){
            return lst;
        }
        inorder(root.left,lst);
        lst.add(root.val);
        inorder(root.right,lst);
        return lst;
    }
}
