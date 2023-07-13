class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character,Character> hm1=new HashMap<>();
        HashMap<Character,Character> hm2=new HashMap<>();
        int i=0;
        int n=s.length();
        while(i<n)
        {
            if(hm1.containsKey(s.charAt(i)))
            {
                if(hm1.get(s.charAt(i))==t.charAt(i))
                    i++;
                else
                    return false;
            }
            else
            {
                
                if(!hm2.containsKey(t.charAt(i)))
                {
                hm1.put(s.charAt(i),t.charAt(i));
                hm2.put(t.charAt(i),s.charAt(i));
              
                }
                else
                {
                    return false;
                }
            
            }
            
            
        }
        
        return true;
        
    }
}