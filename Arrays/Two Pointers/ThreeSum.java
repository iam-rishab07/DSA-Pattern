/* Facebook , Microsoft, Morgan Stanley
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets
 */
import java.util.*;
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums)
    {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0;i<nums.length;i++)
        {
            int left = i+1;
            int right = nums.length-1;
            if(nums[i]>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            while(left<right)
            {
                int total = nums[i]+nums[left]+nums[right];
                if(total==0)
                {
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    while(nums[left]==nums[left-1] && left<right)
                    {
                        left++;
                    }
                }else if(total>0)
                {
                    right--;
                }else{
                    left++;
                }
            }
        }
        return result;
    }
}
