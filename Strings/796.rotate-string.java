/*
 * @lc app=leetcode id=796 lang=java
 *
 * [796] Rotate String
 */

// @lc code=start
class Solution {
    public boolean rotateString(String s, String goal) {

  
 if(s.length()!=goal.length())
 return false;
String ss=s+s;
return ss.contains(goal);  
    }
}
// @lc code=end

