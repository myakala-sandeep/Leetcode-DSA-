/*
 * @lc app=leetcode id=81 lang=java
 *
 * [81] Search in Rotated Sorted Array II
 */

// @lc code=start
class Solution {
    public boolean search(int[] nums, int target) {

        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // 🎯 Step 1: Direct match
            if (nums[mid] == target) {
                return true;
            }

            // 🎭 Step 2: Handle duplicates (confusion case)
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            }
            // 🧭 Step 3: Left half is sorted
            else if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;  // Search left
                } else {
                    low = mid + 1;   // Search right
                }
            }
            // 🧭 Step 4: Right half is sorted
            else {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;   // Search right
                } else {
                    high = mid - 1;  // Search left
                }
            }
        }

        return false;
        
    }
}
// @lc code=end

