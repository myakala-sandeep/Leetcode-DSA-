/*
 * @lc app=leetcode id=1903 lang=java
 *
 * [1903] Largest Odd Number in String
 */

// @lc code=start
class Solution {
    public String largestOddNumber(String num) {
        
           for(int i=num.length()-1;i>=0;i--)
        {
            char ch = num.charAt(i);
            if((ch-'0')%2==1)
            return num.substring(0,i+1);
        }
        
        return "";
    }
}
// @lc code=end

