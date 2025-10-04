/*
 * @lc app=leetcode id=1614 lang=java
 *
 * [1614] Maximum Nesting Depth of the Parentheses
 */

// @lc code=start
class Solution {
    public int maxDepth(String s) {
            if(s.length()==0)
        return 0;

        int mnp=0;
        int p=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            p++;
            else if(ch==')')
            p--;

            mnp=Math.max(mnp,p);
        }
        return mnp;
        
    }
}
// @lc code=end

