/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {


        String per="";

        for(int i=1;i<=strs[0].length();i++)
        {
            String s= strs[0].substring(0,i);
           boolean isprefix = true;
            for(int j=1;j<strs.length;j++)
            {
                  if(!strs[j].startsWith(s))
                  {
                    isprefix=false;
                    break;
                  }

            }

            if(isprefix)
            {
                per=s;
            }
            else
            break;

        }
        
        return per;
    }
}
// @lc code=end

