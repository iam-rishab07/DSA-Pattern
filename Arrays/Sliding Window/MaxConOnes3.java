/* Amazon Google Microsoft
1004. Max Consecutive Ones III

Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

Example 1:
Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
*/

public class MaxConOnes3 {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int zeros = 0;
        while(end<nums.length)
        {
            if(nums[end] == 0)
            {
                zeros++;
            }
            end++;
            if(zeros>k)
            {
                if(nums[start]==0){
                    zeros--;
                }
                start++;
            }
        }
        return end-start;
    }
}
