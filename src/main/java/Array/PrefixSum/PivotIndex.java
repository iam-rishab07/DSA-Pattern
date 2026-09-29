package Array.PrefixSum;

// leetcode 724
public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int left = 0, sum = 0, right = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            right = sum-left-nums[i];
            if(right==left)
            {
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
}
