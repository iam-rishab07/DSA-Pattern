package Array.Kadanes;

public class MaxProductSubArray {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        for(int n:nums)
        {
            res = Math.max(res,n);
        }
        int currMax = 1,currMin = 1;
        for(int n:nums)
        {
            int temp = currMax*n;
            currMax = Math.max(temp,Math.max(currMin*n,n));
            currMin = Math.min(temp,Math.min(currMin*n,n));

            res = Math.max(res,currMax);
        }
        return res;
    }

    /*
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int max = nums[0];
        int min = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int v1 = max*nums[i];
            int v2 = min*nums[i];
            max = Math.max(nums[i],Math.max(v2,v1));
            min = Math.min(nums[i],Math.min(v2,v1));
            ans = Math.max(ans,max);
        }
        return ans;
    }
     */
}
