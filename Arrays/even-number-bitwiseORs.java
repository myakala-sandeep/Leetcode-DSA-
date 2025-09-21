 class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int left =0;
        int right=nums.length-1;
        int bitvalue =0;
        while(left<=right)
        {
                if(left==right)
                {
                     if(nums[left]%2==0)
                     bitvalue=bitvalue|nums[left];
                    break;
                    
                }
                if(nums[left]%2==0)
                {
                    bitvalue=bitvalue|nums[left];
                }
                   if(nums[right]%2==0)
                  {
                    bitvalue=bitvalue|nums[right];
                  }
            left++;
            right--;
        }
      return bitvalue;  
    }
}