 
class Solution {
    public int search(int[] nums, int target) {

        
        int right=nums.length;
         int left=0;
        while ( left<right) {
            int mid=left+(right-left)/2;
            if(nums[mid]==target)
            return mid;
            if (nums[mid]<target ) {
                left=mid+1;
            }
            else
            {
                right=mid;
            }
        }
        return -1;
    }
}
 

