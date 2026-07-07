package Array.SlidingWindow;

// leetcode 485 : max consecutive ones
public class MaxConOne {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length==1) return nums[0];
        int low = 0,res = 0;
        for(int high=0;high<nums.length;high++)
        {
            if(nums[high]==0)
            {
                low = high+1;
            }else{
                res = Math.max(high-low+1,res);
            }
        }
        return res;
    }
}
