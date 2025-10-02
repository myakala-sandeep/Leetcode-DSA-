/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {

        
        if(s.length()!=t.length())
        return false;
        char st [] = s .toCharArray();
        char tt [] = t.toCharArray();
        Arrays.sort(st);
        Arrays.sort(tt); 
        for(int i=0;i<st.length;i++)
        {
            if(st[i]!=tt[i])
            {
                return false;
            }
        } 

        return true;
        
    }
}
// @lc code=end

