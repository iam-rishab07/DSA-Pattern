/* Amazon, Google
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.
*/

public class TwoSum2 {
    public int[] twoSum(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while(l<r)
        {
            int total = nums[l]+nums[r];
            if(total==target)
            {
                return new int[] {l+1,r+1};
            }else if(total<target)
            {
                l++;
            }else{
                r--;
            } 
        }
        return new int[] {-1,-1};
    }
}
