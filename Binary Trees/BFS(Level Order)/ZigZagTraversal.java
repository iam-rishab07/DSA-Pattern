/* Microsoft Facebook Morgan Stanley

103. Binary Tree Zigzag Level Order Traversal

*/

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ZigZagTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Deque<TreeNode> q = new LinkedList<>();
        boolean reverse = false;
        if(root==null){
            return ans;
        }
        q.add(root);
        while(!q.isEmpty())
        {
            int levels = q.size();
            List<Integer> sublevels = new ArrayList<>();
            for(int i=0;i<levels;i++)
            {
                if(!reverse)
                {
                    TreeNode curr = q.pollFirst();
                    sublevels.add(curr.val);
                    if(curr.left!=null) q.addLast(curr.left);
                    if(curr.right!=null) q.addLast(curr.right);
                }else{
                    TreeNode curr = q.pollLast();
                    sublevels.add(curr.val);
                    if(curr.right!=null) q.addFirst(curr.right);
                    if(curr.left!=null) q.addFirst(curr.left);
                }
            }
            ans.add(sublevels);
            reverse=!reverse;
        }
        return ans;
    }
}
