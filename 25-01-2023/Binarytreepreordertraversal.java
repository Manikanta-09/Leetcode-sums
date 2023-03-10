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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> lst= new ArrayList<>();
        if(root==null){
            return lst;
        }
        return preorder(lst,root);
    }
    public List preorder(List lst,TreeNode root){
        if(root == null){
            return lst;
        }
        lst.add(root.val);
        preorder(lst,root.left);
        preorder(lst,root.right);
        return lst;
    }
}
