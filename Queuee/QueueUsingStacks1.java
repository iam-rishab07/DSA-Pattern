import java.util.Stack;

//add efficient
public class QueueUsingStacks1 {
    Stack<Integer> st = new Stack<>();
        Stack<Integer> helper = new Stack<>();
    public QueueUsingStacks1() {
        
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        while(st.size()>1)
        {
            helper.push(st.pop());
        }
        int front = st.pop();
        while(!helper.isEmpty())
        {
            st.push(helper.pop());
        }
        return front;
    }
    
    public int peek() {
        while(st.size()>1)
        {
            helper.push(st.pop());
        }
        int front = st.peek();
        while(!helper.isEmpty())
        {
            st.push(helper.pop());
        }
        return front;
    }
    
    public boolean empty() {
        return (st.size()==0);
    }
}
