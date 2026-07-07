package Array.SlidingWindow;


// longest substring with k unique characters (GFG)
import java.util.*;
public class LongestKUnique {
    public int longestKSubstr(String s, int k) {
        HashMap<Character,Integer> freq = new HashMap<>();
        int low = 0, res = -1;

        for(int high = 0; high < s.length();high++)
        {
            char ch = s.charAt(high);
            freq.put(ch,freq.getOrDefault(ch,0)+1);

            // shrink window size if more than k unique
            while(freq.size()>k)
            {
                char leftChar = s.charAt(low);
                freq.put(leftChar,freq.get(leftChar)-1);
                if(freq.get(leftChar)==0)
                {
                    freq.remove(leftChar);
                }
                low++;
            }


            // if exactly k unique, update answer
            if(freq.size()==k)
            {
                res = Math.max(res,high-low+1);
            }
        }
        return res;
    }
}
