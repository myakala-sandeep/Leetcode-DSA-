/*
 * @lc app=leetcode id=152 lang=java
 *
 * [152] Maximum Product Subarray
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {

             int n = nums.length;
        int maxProd = nums[0];
        int minProd = nums[0];
        int ans = nums[0];

        for (int i = 1; i < n; i++) {
            int curr = nums[i];

            // If current number is negative, swap max and min
            if (curr < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            // Update max and min products ending at current index
            maxProd = Math.max(curr, maxProd * curr);
            minProd = Math.min(curr, minProd * curr);

            // Update the answer
            ans = Math.max(ans, maxProd);
        }

        return ans;
        
    }
}
// @lc code=end

