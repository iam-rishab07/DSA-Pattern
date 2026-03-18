import java.util.*;

public class RightSideView{
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        view(root,0,ans);
        return ans;
    }

    public void view(TreeNode root,int level,ArrayList<Integer> ans)
    {
        if(root==null) return;
        if(level>=ans.size()) ans.add(root.val);
        else ans.set(level,root.val);
        view(root.left,level+1,ans);
        view(root.right,level+1,ans);
    }
}