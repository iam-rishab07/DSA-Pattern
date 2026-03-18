/* Microsoft, Flipkart, Adobe
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.
*/

public class SortColors {
    public void sortColors(int nums[])
    {
        // Dutch National Flag algorithm
        int low=0, mid=0, high=nums.length-1;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                int temp = nums[mid];
                nums[mid++] = nums[low];
                nums[low++] = temp;
            }else if(nums[mid]==1)
            {
                mid++;
            }else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high--] = temp;
            }
        }
    }
}
