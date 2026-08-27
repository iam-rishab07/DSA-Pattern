package Array.Kadanes;

public class MinimumSubArraySum {
    public int minSubarraySum(int[] arr) {
        int minSum = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            int val = sum+arr[i];
            minSum = minSum<val?minSum:val;
            sum = val>0?0:val;

        }
        return minSum;
    }
}
