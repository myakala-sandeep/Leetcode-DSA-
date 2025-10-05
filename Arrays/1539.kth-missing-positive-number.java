/*
 * @lc app=leetcode id=1539 lang=java
 *
 * [1539] Kth Missing Positive Number
 */

// @lc code=start
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num=1;
       int num=1;
        int count=0;
         int index=0;
         int n=arr.length;
        while(index<n)
        {
            if(arr[index]!=num)
            {
            count++;
            if(count==k)
            return num;

          
            }
            else
            {
               
                index++;
            }
            num++;
        }  
        if(count!=k)
        {
     num=num+(k-count-1);
        }
        return num;
        
    }
}
// @lc code=end

