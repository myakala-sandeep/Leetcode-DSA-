package Arrays;
/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
               int  sum=0;
        int n=nums.length;

        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        int res=   n*(n+1)/2-sum;
        return res;
        
    }
}
// @lc code=end

