import java.util.Stack;

public class QueueUsingStacks2 {
    Stack<Integer> st = new Stack<>();
        Stack<Integer> helper = new Stack<>();
    public QueueUsingStacks2() {
        
    }
    
    public void push(int x) {
        while(st.size()>0) helper.push(st.pop());
        st.push(x);
        while(helper.size()>0) st.push(helper.pop());
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        return (st.size()==0);
    }
}
