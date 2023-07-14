class Solution {
    public int romanToInt(String s) {
        
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        
        int ans =0;
        
        for(int i=s.length()-1;i>=0;)
        {
        
            if(i>=1)
            {
                if(hm.get(s.charAt(i))>hm.get(s.charAt(i-1)))
                {
                    System.out.println(hm.get(s.charAt(i))-hm.get(s.charAt(i-1)));
                    ans=ans+hm.get(s.charAt(i))-hm.get(s.charAt(i-1));
                    i=i-2;
                }
                
                else
                {
                    System.out.println(hm.get(s.charAt(i)));
                    ans=ans+hm.get(s.charAt(i));
                    i=i-1;
                    
                }
                    
            }
            
            else
            {
                System.out.println(hm.get(s.charAt(i)));
                ans=ans+hm.get(s.charAt(i));
                i=i-1;
                
            }
            
        }

        return ans;
    }
}