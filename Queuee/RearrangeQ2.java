import java.util.Queue;
import java.util.Stack;

public class RearrangeQ2 {
    public void rearrangeQueue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        int n=q.size();
        for(int i=0;i<n/2;i++)
        {
            st.push(q.poll());
        }
        while(st.size()>0)
        {
            q.offer(st.pop());
        }
        for(int i=0;i<n/2;i++)
        {
            st.push(q.poll());
        }
        while(st.size()>0)
        {
            q.offer(st.pop());
            q.offer(q.poll());
        }
        for(int i=0;i<n;i++)
        {
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.offer(st.pop());
        }
    }
}
