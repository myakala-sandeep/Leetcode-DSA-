/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         int ones=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=1)
            {
                if(count>ones)
                {
                    ones=count;
                    count=0;
                }
                else
                count=0;
                
            }
            else
            {
             count++;
             
            }
        }
        if(count>ones)
           ones=count;
           
        return ones; 
        
    }
}
// @lc code=end

