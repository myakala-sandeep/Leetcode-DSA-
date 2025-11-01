/*
 * @lc app=leetcode id=1358 lang=java
 *
 * [1358] Number of Substrings Containing All Three Characters
 */

// @lc code=start
class Solution {
    public int numberOfSubstrings(String s) {
        
             int[] last = {-1, -1, -1};  
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;  

            
            if (last[0] != -1 && last[1] != -1 && last[2] != -1) {
                res += 1 + Math.min(last[0], Math.min(last[1], last[2]));
            }
        }

        return res;
    }
}
// @lc code=end

