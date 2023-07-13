class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(count==0)
            {
                if(s.charAt(i)=='(')
                    count++;
            }
            
            else{
                
                if(s.charAt(i)==')')
                {
                    count--;
                    if(count>=1)
                    ans=ans+s.charAt(i);
                }
                
                else{
                    
                    if(count>=1)
                        ans=ans+s.charAt(i);
                    count++;
                }
            }
            
            
        }
        
        
        return ans;
        
    }
}