package LinkedList.FastSlow;

public class HappyNumber {
    public boolean isHappy(int n) {
        if(n==1 || n==7) return true;
        if(n<10) return false;
        int slow = n, fast = n;
        while(fast!=1)
        {
            slow = fun(slow);
            fast = fun(fast);
            fast = fun(fast);
            if(slow==fast && fast!=1)  // there is cycle and not present
            {
                return false;
            }
        }
        return true;
    }
    public int fun(int n)
    {
        int sum = 0;
        while(n>0)
        {
            int d = n%10;
            sum+=(d*d);
            n/=10;
        }
        return sum;
    }
}
