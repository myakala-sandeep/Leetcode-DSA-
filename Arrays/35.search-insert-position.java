/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int  k) {
          int start =0;
  int end=nums.length-1;
  
  int index=-1;
  while(start<=end)
  {
     int mid=start+(end-start)/2;
    if(nums[mid]<k)
    {
        start=mid+1;
        index=mid;
    }
    else if(nums[mid]>k)
    {
        end=mid-1;
        //  index=mid;
    }
    else if(nums[mid]==k)
    {
        return mid;
    }
  }
     return index+1;  
      
    }
}
// @lc code=end

