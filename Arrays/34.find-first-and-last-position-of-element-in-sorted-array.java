/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
          int result [] ={-1,-1};
        int left =0;
        int right=nums.length-1;
        while(left<=right)
        {
            if(nums[left]==target&&nums[right]==target)
            {
               result[0]=left;
               result[1]=right;
               return result; 
            }
             if(nums[left]!=target)
             left++;
              if(nums[right]!=target)
              right--;
            
        }
        return result; 

        
    }
}
// @lc code=end

