package Array.SlidingWindow;

// 713. SubArray product less than K
// return the no. of contiguous subArrays having product less than k
public class ProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int left = 0, product = 1, count = 0;
        for(int right=0;right<nums.length;right++)
        {
            product*=nums[right];
            while(product>=k)
            {
                product/=nums[left++];
            }
            count+=1+right-left;
        }
        return count;
    }
}
