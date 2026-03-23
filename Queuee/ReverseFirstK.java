import java.util.Queue;
import java.util.Stack;

public class ReverseFirstK {
    
    public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        if(q==null || k<=0 || k>q.size()) return q;
        int n = q.size();
        Stack<Integer> s = new Stack<>();
        for(int i=1;i<=k;i++)
        {
            s.push(q.poll());
        }
        while(!s.isEmpty())
        {
            q.offer(s.pop());
        }
        for(int i=1;i<=n-k;i++)
        {
            q.offer(q.poll());
        }
        return q;
    }
}
