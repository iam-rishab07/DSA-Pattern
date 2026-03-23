import java.util.LinkedList;
import java.util.Queue;

public class RearrangeQ {
    public void rearrangeQueue(Queue<Integer> q) {
        Queue<Integer> helper = new LinkedList<>();
        int n = q.size();
        for(int i=1;i<=n/2;i++)
        {
            helper.offer(q.poll());
        }
        while(helper.size()>0)
        {
            q.offer(helper.poll());
            q.offer(q.poll());
        }
    }
}
