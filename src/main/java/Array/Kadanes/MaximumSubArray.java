package Array.Kadanes;

// leetcode 53: Maximum SubArray
public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
        int sum  = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<nums.length; i++)
        {
            //step 1 : add num[i] to sum
            sum+=nums[i];

            // step 2 : check if maxi<sum
            maxi=maxi<sum? sum:maxi;

            // step 3 : reset sum if sum<=0
            sum=sum<=0?0:sum;
        }
        return maxi;
    }
}
