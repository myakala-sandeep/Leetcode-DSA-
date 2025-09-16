/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
            int n = nums.length;
    k = k % n;

    reverse(nums, 0, n - 1);     // reverse whole array
    reverse(nums, 0, k - 1);     // reverse first k elements
    reverse(nums, k, n - 1);     // reverse remaining elements
}

private void reverse(int[] nums, int start, int end) {
    while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
}
        
}
// @lc code=end

