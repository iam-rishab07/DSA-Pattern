package Array.Kadanes;

// leetcode 53: Maximum SubArray
public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for(int num:nums)
        {
            sum+=num;
            maxSum = Math.max(maxSum,sum);
            if(sum<0) sum = 0;
        }
        return maxSum;
    }
}
