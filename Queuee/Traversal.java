import java.util.*;

public class Traversal {
    public static void display(Queue<Integer> q)
    {
        for(int i=0;i<q.size();i++)
        {
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
    }

    public static void addAtIndex(int element,int index,Queue<Integer> q)
    {
        int n= q.size();
        for(int i=1;i<=index;i++)
        {
            q.add(q.remove());
        }
        q.add(element);
        for(int i=1;i<=n-index;i++)
        {
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(60);
        // int n = q.size();
        System.out.println("Traversal : ");
        display(q);
        addAtIndex(50, 3, q);
        System.out.println("\nTraversal after adding 50 at 3rd index : ");
        display(q);
        Queue<Integer> rq = ReverseFirstK.reverseFirstK(q,2);
        System.out.println("\nAfter Reversing first 2 elements : ");
        display(rq);
    }
}
