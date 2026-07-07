package String.SlidingWindow;

// leetcode 424 : longest repeating character replacement
public class CharacterReplacement {
    public int characterReplacement(String s, int k) {
        int low = 0, maxFreq = 0, res = 0;
        int[] freq = new int[26];
        for(int high = 0; high<s.length();high++)
        {
            freq[s.charAt(high)-'A']++;
            maxFreq = Math.max(maxFreq,freq[s.charAt(high)-'A']);
            while((high-low+1)-maxFreq>k)
            {
                freq[s.charAt(low)-'A']--;
                low++;
            }
            res = Math.max(res,high-low+1);
        }
        return res;
    }
}
