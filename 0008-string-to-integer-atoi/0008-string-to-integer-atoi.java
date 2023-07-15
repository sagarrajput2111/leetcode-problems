class Solution {
    public int myAtoi(String s) {
        int flag=1;
        int i=0;
        if(s.length()==0)
            return 0;
       while(i<s.length()&&s.charAt(i)==' ')
           i++;
        
        if(i<s.length()&&s.charAt(i)=='-')
        {
            flag=-1;
            i++;
        }
        else if(i<s.length()&&s.charAt(i)=='+')
        {
            i++;
        }
        
        //this will handle the sign;
        
        //now find the first non zero index;
        
        while(i<s.length()&&s.charAt(i)=='0')
            i++;
        //this will handle all front zero and blank space
       long ans=0; 
        while(i<s.length())
        {
            int digit=s.charAt(i)-'0';
            if(digit>=0&&digit<=9)
            {
            ans=ans*10+ s.charAt(i)-'0';
                
            i++;
            if(ans*flag>(long)Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if(ans*flag<(long)Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            }
            else
            {
                break;
            }
            
        }
        ans=ans*flag;
        
        if(ans>(long)Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if(ans<(long)Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        
        return (int)ans;
        

       

    }
}