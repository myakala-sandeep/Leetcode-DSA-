/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start
class Solution {
    public int longestConsecutive(int[] nums) {
         if(nums.length<2)
        {
            return nums.length==0?0:1;
        }
        int k=0;

        int value =nums[k];
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
                set.add(nums[i]);
        }
        int count=Integer.MIN_VALUE;
        
        for(int num:set)
        {
            if(!set.contains(num-1))
            {
                     int c=1;
             int a= num+1;
             while(set.contains(a))
             {
                c++;
                a++;
                
             }
             if(count<c)
             count=c;
            }
        }

    return count;
        
        
    }
}
// @lc code=end

