import java.util.*;

public class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) 
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode insert(TreeNode root, int val)
    {
        if(root==null) 
        {
            root = new TreeNode(val);
            return root;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode curr = q.poll();
            if(curr.left!=null)
            {
                q.add(curr.left);
            }else{
                curr.left = new TreeNode(val);
                return root;
            }

            if(curr.right!=null)
            {
                q.add(curr.right);
            }else{
                curr.right = new TreeNode(val);
                return root;
            }
        }
        return root;
    }

    public static void preorder(TreeNode root)
    {
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static int size(TreeNode root)
    {
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }

    public static int sumVal(TreeNode root)
    {
        if(root==null) return 0;
        return root.val+sumVal(root.left)+sumVal(root.right);
    }

    public static int levels(TreeNode root)
    {
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }

    public static int maxVal(TreeNode root)
    {
        
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(maxVal(root.left),maxVal(root.right)));
    }

    public static List<List<Integer>> levelOrder(TreeNode root)
    {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null)
        {
            return ans;
        }
        q.add(root);
        while(!q.isEmpty())
        {
            int levels = q.size();
            List<Integer> subLevels = new ArrayList<>();
            for(int i=0;i<levels;i++)
            {
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }
                subLevels.add(q.remove().val);
            }
            ans.add(subLevels);
        }

        return ans;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(45);
        insert(root, 12);
        insert(root, 21);
        insert(root, 47);
        insert(root, 69);
        System.out.println("Preorder : ");
        preorder(root);
        System.out.println("\nSize : "+size(root));
        System.out.println("Sum of values : "+sumVal(root));
        System.out.println("Max value : "+maxVal(root));
        List<List<Integer>> levelOrderList = levelOrder(root);
        System.out.println("Level Order Traversal : "+levelOrderList);
    }
}
