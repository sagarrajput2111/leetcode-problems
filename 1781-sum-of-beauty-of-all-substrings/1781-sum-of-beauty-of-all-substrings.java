class Solution {
    
    public int beauty(int[] freq)
    {
        int l=Integer.MAX_VALUE,h=-1;
        
        for(int i:freq)
        {
            
            if(i>0)
                l=Math.min(i,l);
            h=Math.max(i,h);
        }
        return h-l;
        
    }
    public int beautySum(String s) {
        
        int ans=0;
        
        for(int i=0;i<s.length();i++)
        {
            int[] freq=new int[26];
            
            for(int j=i;j<s.length();j++)
            {
                //updating the frequency
                freq[s.charAt(j)-'a']++;
                //find beauty
                ans+=beauty(freq);
                
            }
            
            
            
        }
        
        
        
        return ans;
        
        
        
    }
}