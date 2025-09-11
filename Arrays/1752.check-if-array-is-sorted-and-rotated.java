/*
 * @lc app=leetcode id=1752 lang=java
 *
 * [1752] Check if Array Is Sorted and Rotated
 */

// @lc code=start
class Solution {
    public boolean check(int[] nums) {

        int a=0;
         
        while(a<nums.length)
        {
          boolean issort = true;   
        for(int i=0;i<nums.length;i++)
        {
           
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                {
                 issort= false;
                 break;
                }
            
            }
             if(!issort)
                break;
        }
         if(issort)
         {
            return true;
            
         }
        int ele = nums[nums.length-1];
         for(int i=nums.length-1;i>0;i--)
         {
             nums[i]=nums[i-1];
         }
         nums[0]=ele;
       a++;
    }
       return false; 
    }
}
// @lc code=end

