package String.SlidingWindow;


// leetcode 3: longest substring without repeating characters
import java.util.*;
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        if(s.length()==1) return 1;

        int low = 0, maxLen = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int high = 0; high < s.length() ; high++)
        {
            char ch = s.charAt(high);
            if(map.containsKey(ch))
            {
                low = Math.max(low,map.get(ch)+1);
            }
            map.put(ch,high);
            if(high-low+1>maxLen) maxLen = high-low+1;
        }
        return maxLen;
    }
}
