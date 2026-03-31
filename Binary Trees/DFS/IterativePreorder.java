import java.util.ArrayList;
import java.util.Stack;

public class IterativePreorder {
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        Stack<Node> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        st.push(root);
        while(st.size()>0)
        {
            Node prev = st.pop();
            ans.add(prev.data);
            if(prev.right!=null) st.push(prev.right);
            if(prev.left!=null) st.push(prev.left);
        }
        return ans;
    }
}
