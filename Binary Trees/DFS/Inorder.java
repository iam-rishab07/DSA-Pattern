/*  amazon  Paytm   PhonePe
    94. Inorder traversal
*/

import java.util.*;

public class Inorder{
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        inOrder(root,arr);
        return arr;
    }

    public void inOrder(TreeNode root,List<Integer> arr)
    {
        if(root==null) return;
        inOrder(root.left,arr);
        arr.add(root.val);
        inOrder(root.right,arr);
    }
}
