/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {

        int left=0;
        int right=nums.length;
        while ( left<right) {
            int mid=left+(right-left)/2;
            if(nums[mid]==target)
            return mid;
            if (nums[mid]<target ) {
                left=mid+1;
            }
            else
            {
                right=mid;
            }
        }
        return -1;
    }
}
// @lc code=end

