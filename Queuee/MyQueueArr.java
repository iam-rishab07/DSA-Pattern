class CircularQueue{
    int[] arr;
    int f,r,size;
    CircularQueue(int len)
    {
        arr = new int[len];
    }
    public void add(int val)
    {
        if(size==arr.length){
            System.out.println("Queue is Full !");
            return;
        }
        arr[r++]=val;
        if(r==arr.length) r=0;
        size++;
    }
    public int remove()
    {
        if(size==0){
            System.out.println("Queue is Empty !");
            return -1;
        }
        int front=arr[f];
        f++;
        if(f==arr.length) f=0;
        size--;
        return front;
    }

    public int peek()
    {
        if(size==0){
            System.out.println("Empty queue!");
            return -1;
        }
        return arr[f];
    }

    public void display()
    {
        if(size==0) return;
        if(f>=r)
        {
            for(int i=f;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
            for(int i=0;i<r;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        else
        {
            for(int i=f;i<r;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}

public class MyQueueArr {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(6);
        q.add(10);
        q.add(20);
        q.add(30);
        q.display();
        System.out.println("removed : "+q.remove());
        q.add(60);
        q.display();
    }
}
