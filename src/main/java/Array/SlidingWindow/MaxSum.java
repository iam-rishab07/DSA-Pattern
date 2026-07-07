package Array.SlidingWindow;

// Max sum subarray of size k (GFG)
public class MaxSum {
    public int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;
        if(n<k)
            return 0;       // base check
        int windowSum = 0;

        //sum of first window
        for(int i=0;i<k;i++)
        {
            windowSum+=arr[i];
        }
        int maxSum = windowSum;

        // sliding window
        for(int i=k;i<n;i++)
        {
            windowSum += arr[i]-arr[i-k]; // add new element and remove the oldest element in window
            maxSum = Math.max(maxSum,windowSum);    // update max sum
        }
        return maxSum;
    }
}
