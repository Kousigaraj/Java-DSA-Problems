
// Definition for a binary tree node.
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
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;
        while(true){
            int count = queue.size();
            if(count == 0){
                return depth;
            }
            while(count > 0){
                TreeNode current = queue.poll();

                if(current.left != null)
                    queue.add(current.left);
                if(current.right != null)
                    queue.add(current.right);
                count--;
            }
            depth++;
        }
    }
}