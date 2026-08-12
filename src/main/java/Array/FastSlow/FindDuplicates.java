package Array.FastSlow;

/*
Given an array of integers arr containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in arr, return this repeated number.
You must solve the problem without modifying the array arr and using only constant extra space.
 */

public class FindDuplicates {
    // 287. Find duplicate number
    public int findDup(int[] arr)
    {
        int slow = 0, fast = 0;
        while(true)
        {
            slow = arr[slow];
            fast = arr[fast];
            fast = arr[fast];
            if(slow==fast)
            {
                slow = 0;
                while(slow!=fast)
                {
                    slow = arr[slow];
                    fast = arr[fast];
                }
                return slow; // or return fast
            }
        }
    }
}
