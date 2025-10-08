/*
 * @lc app=leetcode id=1759 lang=java
 *
 * [1759] Count Number of Homogenous Substrings
 */

// @lc code=start
class Solution {
    public int countHomogenous(String s) {
     
        
            long res = 0;
        long count = 1;
        int mod = 1000000007;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                res += (count * (count + 1)) / 2;
                count = 1;
            }
        }

        // Add last group
        res += (count * (count + 1)) / 2;
        
        return (int)(res % mod);
    }
}
// @lc code=end

