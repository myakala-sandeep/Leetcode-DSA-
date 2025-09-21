 class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int left =0;
        int right=nums.length-1;
        int bit =0;
        while(left<=right)
        {
                if(left==right)
                {
                     if(nums[left]%2==0)
                     bit=bit|nums[left];
                    break;
                    
                }
                if(nums[left]%2==0)
                {
                    bit=bit|nums[left];
                }
                   if(nums[right]%2==0)
                  {
                    bit=bit|nums[right];
                  }
            left++;
            right--;
        }
      return bit;  
    }
}