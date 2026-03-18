//Amazon    Adobe    Sumo Logic
/*
266. Invert a binary tree

Given the root of a binary tree, invert the tree, and return its root.
*/


public class Invert{
    public TreeNode invertTree(TreeNode root)
    {
        if(root==null) return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }
}