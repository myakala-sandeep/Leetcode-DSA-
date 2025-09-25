/*
 * @lc app=leetcode id=875 lang=java
 *
 * [875] Koko Eating Bananas
 */

// @lc code=start
class Solution {
    public int minEatingSpeed(int[] piles, int h) {

            int low = 1;
    int high = 0;

    // find max pile (upper bound)
    for (int a : piles) {
        high = Math.max(high, a);
    }

    int ans = high; // store minimum k found
    while (low <= high) {
        int mid = low + (high - low) / 2; 
             long hours = 0;
 
        for (int a : piles) {
            hours += (a + (long)mid - 1) / (long)mid; 
        }

        if (hours <= h) {
            ans = mid;     
            high = mid - 1;
        } else {
            low = mid + 1;  
        }
    }
    return ans;
        
    }
}
// @lc code=end

