package Array.Kadanes;

public class MaxAbsoluteSum {
    public int maxAbsoluteSum(int[] nums) {
        int maxEnd = 0, minEnd = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for(int num:nums)
        {
            maxEnd = Math.max(maxEnd+num,num);
            minEnd = Math.min(num,minEnd+num);

            maxSum = Math.max(maxSum,maxEnd);
            minSum = Math.min(minSum,minEnd);
        }
        return Math.max(maxSum,-(minSum));
    }
}
