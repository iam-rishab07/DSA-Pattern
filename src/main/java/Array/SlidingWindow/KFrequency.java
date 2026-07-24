package Array.SlidingWindow;

import java.util.HashMap;

// 2958.  Length of longest sub-array with at-most k frequency
public class KFrequency {
    public int maxSubArrayLength(int[] arr, int k) {
        int left = 0;
        int max_length = 0;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int right = 0; right< arr.length; right++){
            freq.put(arr[right], freq.getOrDefault(arr[right],0) + 1);
            while(freq.get(arr[right]) > k){
                freq.put(arr[left], freq.get(arr[left]) - 1);
                left++;
            }
            max_length = Math.max(max_length, right - left  + 1);
        }
        return max_length;
    }
}
