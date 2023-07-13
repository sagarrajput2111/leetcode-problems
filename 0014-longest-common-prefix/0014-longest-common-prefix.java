class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length==1)
            return strs[0];
            
        int start=0,end=Math.min(strs[0].length(),strs[1].length());
        int count=0,countFinal=Integer.MAX_VALUE;
        for(int i=0;i<strs.length-1;i++)
        {
            count=0;
            while(start<end)
            {
                if(strs[i].charAt(start)==strs[i+1].charAt(start))
                {
                    count++;
                    System.out.println(count);
                    start++;
                    if(start==end&&i+2<strs.length)
                    {
                     end=Math.min(start,strs[i+2].length());
                     start=0;
                     break;
                    }
                }
                else
                {
                    if(i+2<strs.length)
                    end=Math.min(start,strs[i+2].length());
                    start=0;
                    break;
                    
                }
                
            }
            start=0;
            
            if(count<countFinal)
                countFinal=count;
            
            
            
        }
        
        System.out.println(countFinal);
        
        if(start==countFinal)
            return "";
        else
            return strs[0].substring(0,countFinal);
        
    }
}