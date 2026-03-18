/*  flipkart    Paytm   Zomato
    144. Preorder Traversal
*/

import java.util.*;

public class Preorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root,res);
        return res;
    }

    public void helper(TreeNode root,List<Integer> arr)
    {
        if(root==null) return;
        arr.add(root.val);
        helper(root.left,arr);
        helper(root.right,arr);
    }
}
