class Solution {
    public String reverseWords(String s) {
        
        //first finding the start index;
        int start=0;
        while(start<s.length()&&s.charAt(start)==' ')
        {
            start++;
            //for trailing spaces
        }
        
        //we have found the start
        
        int end=start;
        String temp="";
        //we are making new strings with reversed words
        while(end<s.length())
        {
            while(end<s.length()&&s.charAt(end)!=' ')
                end++;
            //put from end-1 to start in new string
            for(int i=end-1;i>=start;i--)
            {
                temp=temp+s.charAt(i);
            }
            temp=temp+" ";
            while(end<s.length()&&s.charAt(end)==' ')
                end++;
            start=end;
            
        }
        s="";
        System.out.println(temp);
        for(int i=temp.length()-2;i>=0;i--)
        {
          
                s=s+temp.charAt(i);
                
            
        }
        
        return s;
        
    }
}