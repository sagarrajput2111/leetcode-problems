class Solution {
    
    long find(int[]arr,int mid)
    {
       
        long count=0;
        int remainder=0;
        for(int i=0;i<arr.length;i++)
         {
            
            remainder=arr[i];
            if(remainder%mid==0)
            {
                count+=remainder/mid;
            }
            else
            {
                count=count+remainder/mid+1;
            }
       
          }
                

        
        System.out.println("count for "+ mid+" is"+count);
        return count;
    
    }
    
    public int minEatingSpeed(int[] piles, int h) {
        
        int r=1,l=1;
        for(int i=0;i<piles.length;i++)
        {
            r=Math.max(r,piles[i]);
            
            
        }
        int ans=r;
        while(l<=r)
        {
             int mid=l+(r-l)/2;
            
            if(find(piles,mid)<=(long)(h))
            {
                ans=mid;
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        
        return ans;
        
       
        
    }
}