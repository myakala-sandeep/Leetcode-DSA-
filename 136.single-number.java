/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
          if(nums.length==1)
        return nums[0];
        
        int count;
        for(int i=0;i<nums.length;i++)
        { 
            count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
                

            }
             if(count==1)
                {
                    return nums[i];
                }
        }
        return nums[0];
        
    }
}
// @lc code=end

