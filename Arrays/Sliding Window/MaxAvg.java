/* 643. Maximum Average Subarray I : Amazon Microsoft

You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

 

Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
*/
public class MaxAvg{
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i]; // calculate sum from index 0 to k
        }
        double max = sum/k; // calculate max avg
        for(int i=k;i<nums.length;i++)
        {
            // sliding window
            sum+=nums[i]-nums[i-k]; // update sum by adding next element and removing oldest element
            max = max>sum/k?max:sum/k; // updating max using ternary operators
        }
        return max;
    }
}