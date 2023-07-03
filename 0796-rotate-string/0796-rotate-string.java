class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
            return false;
        
        int idx=0;
        char c=goal.charAt(0);
        
        int ptr=-1;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c){
                ptr=i;
                String s1=s.substring(0,i);
                String s2=s.substring(i,s.length());
                String s3=s2+s1;
                System.out.println(s3);
                if(goal.equals(s3))
                    return true;
                else continue;
            
            }
        }
        return false;
        
    }
}