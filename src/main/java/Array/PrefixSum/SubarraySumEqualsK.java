package Array.PrefixSum;

// leet code 560
import java.util.*;
public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, cnt = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);   // prefix sum before array starts (sum is 0 one time initially)
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];   // calculate prefix sum till now (includes nums[i])
            int rem = sum - k;      // if sum-k is there in hashmap, it means there exists a subarray of sum k
            cnt+=map.getOrDefault(rem,0);       // cnt + no. of times sum - k has occured
            map.put(sum,map.getOrDefault(sum,0)+1);     // put sum in hashmap and update its frequency
        }
        return cnt;     // return the count of subarray sum equals k
    }
}
