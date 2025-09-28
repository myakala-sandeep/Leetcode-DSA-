package Strings;
/*
 * @lc app=leetcode id=1021 lang=java
 *
 * [1021] Remove Outermost Parentheses
 */

// @lc code=start
class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder sd = new StringBuilder();
        int count=0;
        int ind=0;
          for(int i=0;i<s.length();i++)
          {
            char ch = s.charAt(i);
            if(ch=='(')
            count++;
            else
            count--;
            if(count==0)
            {
                sd.append(s.substring(ind+1, i));
                ind=i+1;

            }

          }
        return sd.toString();
    }
}
// @lc code=end

