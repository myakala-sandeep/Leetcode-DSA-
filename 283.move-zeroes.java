/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
      int arr [] = new int [nums.length];
      int index=0;
      int i=0;
        for(i=0;i<nums.length;i++)
        { 
           if(nums[i]!=0)
           {
            arr[index++]=nums[i];
           }
        }
        for(i=0;i<nums.length;i++)
        {
            nums[i]=arr[i];
        }
    }
}
// @lc code=end

