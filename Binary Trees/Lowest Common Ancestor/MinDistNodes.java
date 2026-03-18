//gfg


public class MinDistNodes {
    int findDist(Node root, int a, int b) {
        // Your code here
        Node lca = lowestCommonAncestor(root,a,b);
        int[] dist={0,0};
        dfs(lca,a,b,0,dist);
        return dist[0]+dist[1];
    }
    
    public void dfs(Node root,int a,int b,int level,int[] dist)
    {
        if(root==null) return;
        if(root.data==a) dist[0]=level;
        if(root.data==b) dist[1]=level;
        dfs(root.left,a,b,level+1,dist);
        dfs(root.right,a,b,level+1,dist);
    }
    
    public Node lowestCommonAncestor(Node root,int p, int q) {
        if(root==null) return null;
        if(root.data==p || root.data==q) return root;
        Node l = lowestCommonAncestor(root.left,p,q);
        Node r = lowestCommonAncestor(root.right,p,q);
        if(l!=null && r!=null) return root;
        return (l==null)?r:l;
    }
}
