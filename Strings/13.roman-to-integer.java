/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
           int res=0;
        int va=0;
        for(int i=s.length()-1;i>=0;i--)
        {
           
             char ch = s.charAt(i);
             if(ch=='I')
             {
                if(va>1)  res=res-1;
                else  
                {
                 res=res+1; 
                 va=1;
                }   
             }
             else if(ch=='V')
             {
                if(va>5)  res=res-5;
                else 
                {
                  res=res+5;   
                  va=5;
                } 
             }
               else if(ch=='X')
             {
                if(va>10)  res=res-10;
                else 
                {
                  res=res+10;   
                  va=10;
                } 
             }
               else if(ch=='L')
             {
                if(va>50)  res=res-50;
                else 
                {
                  res=res+50;   
                  va=50;
                } 
             }
               else if(ch=='C')
             {
                if(va>100)  res=res-100;
                else 
                {
                  res=res+100;   
                  va=100;
                } 
             }
               else if(ch=='D')
             {
                if(va>500)  res=res-500;
                else 
                {
                  res=res+500;   
                  va=500;
                } 
             }
               else if(ch=='M')
             {
                if(va>1000)  res=res-1000;
                else 
                {
                  res=res+1000;   
                  va=1000;
                } 
             }
              
        }
        return res;
    }
}
// @lc code=end

