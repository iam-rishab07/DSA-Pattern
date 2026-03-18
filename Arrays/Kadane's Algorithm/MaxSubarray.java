/* Flipkart, Paytm, Phonepe
53. Maximum Subarray

Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
*/

public class MaxSubarray{
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int total = 0;

        for(int n : nums)
        {
            if(total<0)
            {
                total = 0;
            }
            total+=n;
            ans = Math.max(total,ans);
        }
        return ans;
    }
}