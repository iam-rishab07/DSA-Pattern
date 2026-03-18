/*  Flipkart   Paytm   PhonePe
    145. Postorder Traversal
*/

import java.util.*;

public class Postorder{

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root,res);
        return res;
    }

    public void helper(TreeNode root,List<Integer> arr)
    {
        if(root==null) return;
        helper(root.left,arr);
        helper(root.right,arr);
        arr.add(root.val);
    }
}