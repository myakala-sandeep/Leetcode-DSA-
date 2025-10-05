/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {


               s=s.trim();
        if(s.length()==0)
        return 0;
        StringBuilder res=new StringBuilder();
         if(!(s.charAt(0)=='-'||s.charAt(0)=='+'||s.charAt(0)>='0'&&s.charAt(0)<='9'))
        return 0;
        else
        {
        res.append.charAt(0);
        }
        for(int i=1;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(s.charAt(0)>='0'&&s.charAt(0)<='9')
            {
                res.apppend()ch;
            }
            else
            break;
        }
        if(s.charAt(0)=='-')
        {
            return -Interger.parseInt(res);
        }
        else
        {
           return Interger.parseInt(res);
        }
        
    }
}
// @lc code=end

