/*
 * @lc app=leetcode id=1248 lang=java
 *
 * [1248] Count Number of Nice Subarrays
 */

// @lc code=start
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        int prefix = 0;  
        int count = 0;   
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0, 1);  
        
        for (int num : nums) {
        
            prefix += num % 2;
            
                        if (map.containsKey(prefix - k)) {
                count += map.get(prefix - k);
            }
         
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        
        return count;
        
        
    }
}
// @lc code=end

