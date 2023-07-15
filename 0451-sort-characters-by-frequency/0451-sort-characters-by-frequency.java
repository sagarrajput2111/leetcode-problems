class Solution {
    public String frequencySort(String s) {
        
        //time-O(n)
        //space-O(2n)
        HashMap<Character,Integer> hm1=new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            
            if(hm1.containsKey(s.charAt(i)))
            {
                hm1.put(s.charAt(i),hm1.get(s.charAt(i))+1);
            }
            else
            {
                hm1.put(s.charAt(i),1);
            }
        }
        
        s="";
        int i=0;
        //make a array of pair class
        Pair[] arr=new Pair[hm1.size()];
        for(char c: hm1.keySet())
        {
           Pair<Character,Integer> p=new Pair(c,hm1.get(c));
            arr[i]=p;
            i++;
      
        }
     Arrays.sort(arr,(n1,n2)->
                    {
                      return (int)n2.getValue()-(int)n1.getValue();
                    });
     
   for(Pair p:arr)
       {
         // System.out.println(hm2.get(c));
           int j=0,n=(int)p.getValue();
           while(j<n)
           {
               s=s+(char)p.getKey();
               j++;
           }
           
       }
        
        
        return s;
        
    }
}