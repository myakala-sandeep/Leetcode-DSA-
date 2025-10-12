/*
 * @lc app=leetcode id=1528 lang=java
 *
 * [1528] Shuffle String
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public String restoreString(String s, int[] indices) {

        
         StringBuilder builder = new StringBuilder(s);
      
      
       for(int i=0;i<indices.length;i++)
       {
        builder.setCharAt(indices[i], s.charAt(i));
       }
      return builder.toString();
        
    }
}
// @lc code=end

