/*
 * @lc app=leetcode id=1423 lang=java
 *
 * [1423] Maximum Points You Can Obtain from Cards
 */

// @lc code=start
class Solution {
    public int maxScore(int[] cardPoints, int k) {

        

        int n = cardPoints.length;
        int sum =0;
        for(int i=0;i<k;i++)
        {
            sum+=cardPoints[i];
        }
        int maxscore=sum;
        
        for(int i=1;i<=k;i++)
        { 
            sum-=cardPoints[k-i];
            sum+=cardPoints[n-i];
            maxscore=Math.max(sum,maxscore);
            a++;
        }
        

        return maxscore;
        
    }
}
// @lc code=end

