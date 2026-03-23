public class MyQueue {
    private class Node
    {
        int val;
        Node next;
        private Node(int val)
        {
            this.val=val;
        }
    }
    private Node head=null,tail=null;
    private int size = 0;

    public void add(int val)
    {
        Node temp = new Node(val);
        if(tail==null) head=tail=temp;
        else{
            tail.next = temp;
            tail=temp;
        }
        size++;
    }

    public int remove()
    {
        if(head==null) return -1;
        int front = head.val;
        head=head.next;
        size--;
        return front;
    }

    public int peek()
    {
        if(head==null) return -1;
        return head.val;
    }

    public void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.display();
        q.remove();
        q.display();
        System.out.println("peek() : "+q.peek());
    }
}
