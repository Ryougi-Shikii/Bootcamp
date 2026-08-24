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
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.ArrayList;
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> q = new LinkedList();
        List<List<Integer>> arr = new ArrayList();

        if (root == null){
            return arr;
        }
        q.add(root);

        while(!q.isEmpty()){

            List<Integer> qa = new ArrayList();
            int len = q.size();

            for (int i=0; i<len; i++){
                TreeNode cur = q.remove();
                qa.add(cur.val);
                if (cur.left != null){
                    q.add(cur.left);
                }
                if (cur.right != null){
                    q.add(cur.right);
                }
            }
            arr.add(qa);
        }
        return arr;
    }
}