/*
152. Maximum Product Subarray

Given an integer array nums, find a subarray that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.
Note that the product of an array with a single element is the value of that element.

Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
*/

public class MaxProdSubarray {
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
}
