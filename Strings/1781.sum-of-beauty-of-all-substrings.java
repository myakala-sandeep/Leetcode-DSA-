/*
 * @lc app=leetcode id=1781 lang=java
 *
 * [1781] Sum of Beauty of All Substrings
 */

// @lc code=start
class Solution {
    public int beautySum(String s) {
       
        
        int beauty=0;
     int n=s.length();
     for(int i=0;i<n;i++)
     {
        int f [] = new int [26];
        for(int j=i;j<n;j++)
        {
            f[s.charAt(j)-'a']++;
            int max=0;
            int min=Integer.MAX_VALUE;
            for(int t:f)
            {
                if(t>0)
                {
                    max=Math.max(max,t);
                    min=Math.min(min,t);
                }
            }

            beauty=beauty+(max-min);
        }


     }
     return beauty;
    }
}
// @lc code=end

