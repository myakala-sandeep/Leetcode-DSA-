/*
 * @lc app=leetcode id=540 lang=java
 *
 * [540] Single Element in a Sorted Array
 */

// @lc code=start
class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int left=0;
        int right=nums.length-1;
        while(left<right)
        {
             int mid=left+(right-left)/2;
           if(mid%2==0)
           {
            if(nums[mid]!=nums[mid+1])
            {
                right=mid;
            }
            else
            left=mid+1;
           }
           else
           {
             if(nums[mid]!=nums[mid-1])
            {
                right=mid;
            }
            else
            left=mid+1;


           }

        }

        return nums[left];
    }
}
// @lc code=end

