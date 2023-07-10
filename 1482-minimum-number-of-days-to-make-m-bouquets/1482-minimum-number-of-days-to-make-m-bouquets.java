class Solution {
    boolean find(int[] arr,int mid,int m,int k)
    {
        int countFinal=0;
        int count=0;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]<=mid)
           {
               count++;
               if(count==k)
               {
                   countFinal++;
                   count=0;
               }
               if(countFinal==m)
               {
                    System.out.println(mid+" "+true);
                   
                   return true;
               }
           }
           else
               count=0;
           
           
       }
        
         System.out.println(mid+" "+false);
      return false;  
        
    }
    
    public int minDays(int[] bloomDay, int m, int k) {
        int l=1, h=1;
        for(int i=0;i<bloomDay.length;i++)
        {
            l=Math.min(l,bloomDay[i]);
            h=Math.max(h,bloomDay[i]);
        }
       
        int ans=-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(find(bloomDay,mid,m, k))
            {
                ans=mid;
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
            
        }
        
        
        return ans;
        
        
        
    }
}