import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
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
                TreeNode curr = q.poll();
                if(curr.left!=null)
                {
                    q.offer(curr.left);
                }
                if(curr.right!=null)
                {
                    q.offer(curr.right);
                }
                sublevels.add(curr.val);
            }
            ans.add(sublevels);
        }
        return ans;
    }
}
