import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class IterativePostorder {
    ArrayList<Integer> postOrder(Node node) {
        // code here
        Stack<Node> st = new Stack<>();
        ArrayList<Integer> arr =new ArrayList<>();
        st.push(node);
        while(st.size()>0)
        {
            Node root = st.pop();
            arr.add(root.data);
            if(root.left!=null) st.add(root.left);
            if(root.right!=null) st.add(root.right);
        }
        Collections.reverse(arr);
        return arr;
    }
}
