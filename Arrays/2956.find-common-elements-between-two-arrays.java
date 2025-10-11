package Arrays;
/*
 * @lc app=leetcode id=2956 lang=java
 *
 * [2956] Find Common Elements Between Two Arrays
 */

// @lc code=start
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        


         int ans1 = 0; // count of nums1 elements appearing in nums2
        int ans2 = 0; // count of nums2 elements appearing in nums1

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    ans1++;
                    break; // move to next nums1 element
                }
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    ans2++;
                    break; // move to next nums2 element
                }
            }
        }

        return new int[]{ans1, ans2};
    }
}
// @lc code=end

