/*
 * @lc app=leetcode id=451 lang=java
 *
 * [451] Sort Characters By Frequency
 */

// @lc code=start
class Solution {
    public String frequencySort(String s) {


        class Solution {
    public String frequencySort(String s) {
        // Step 1: Count frequency
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Step 2: Create buckets (index = frequency)
        List<Character>[] buckets = new List[s.length() + 1];
        for (char c : freq.keySet()) {
            int f = freq.get(c);
            if (buckets[f] == null) {
                buckets[f] = new ArrayList<>();
            }
            buckets[f].add(c);
        }

        // Step 3: Build result from high to low frequency
        StringBuilder sb = new StringBuilder();
        for (int i = s.length(); i >= 0; i--) {
            if (buckets[i] != null) {
                for (char c : buckets[i]) {
                    sb.append(String.valueOf(c).repeat(i));
                }
            }
        }
        return sb.toString();
        //bhai
    }
}
        
    }
}
// @lc code=end

