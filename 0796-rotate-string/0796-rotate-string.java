class Solution {
    public boolean rotateString(String s, String goal) {
        
        if(s.length()!=goal.length())
            return false;
        
        
        
        //O(n) solution
        int i=0,j=0;
        
        while(j<goal.length()&&i<s.length())
        {
            if(s.charAt(i)==goal.charAt(j))
            {
                i++;
                j++;
            }
            
            else
            {
               if(j==0)
                   i++;
                else
                    j=0;
            }
            
            
        }
        
       // System.out.println(s.substring(i)+"  "+goal.substring(0,goal.length()-i));
        return (s.substring(0,goal.length() - j).equals(goal.substring(j)));
        
        
        
        
    }
}