package Strings;

/*
 * @lc app=leetcode id=151 lang=java
 *
 * [151] Reverse Words in a String
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {

         s=s.trim();
     String st [] = s.split("\\s+");
     StringBuilder sb = new StringBuilder();
      for(int i=st.length-1;i>=0;i--)
         {
            if(i!=0)
            {
                sb.append(st[i]).append(" ");
            }
            else
             sb.append(st[i]);

         }
      
        return sb.toString();
    }
}
// @lc code=end

