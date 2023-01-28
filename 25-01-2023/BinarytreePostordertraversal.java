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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        if(root==null){
            return lst;
        }
        return postorder(root,lst);
    }
    public List postorder(TreeNode root,List lst){
        if(root==null){
            return lst;
        }
        postorder(root.left,lst);
        postorder(root.right,lst);
        lst.add(root.val);
        return lst;
    }
}
