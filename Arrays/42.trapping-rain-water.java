
/*
 * @lc app=leetcode id=42 lang=java
 *
 * [42] Trapping Rain Water
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
         int trap=0;
      int left =0;
      int  right=height.length-1;
      int leftmax=0;
      int rightmax=0;
      while(left<right)
      {
        if(height[left]<height[right])
        {
            if(leftmax<=height[left])
            {
                leftmax=height[left];
            }
            else
            {
                trap=trap+(leftmax-height[left]);
            }
            left++;

        }
        else
        {
            if(rightmax<=height[right])
            {
             rightmax=height[right];
            }
            else
            {
                 trap=trap+(rightmax-height[right]);
            }
            right--;
        }
         
      }
      return trap;
        
        
    }
}
// @lc code=end

