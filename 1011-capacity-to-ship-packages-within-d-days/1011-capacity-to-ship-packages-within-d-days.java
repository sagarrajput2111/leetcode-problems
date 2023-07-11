class Solution {
    
    public boolean check(int[]arr,long mid,long days)
    {
       long count=1;
        long load=0;
        for(int i=0;i<arr.length;i++)
        {
            if(load+arr[i]>mid)
            {
                count++;
               load=arr[i];
            }
            else
            {
                load+=arr[i];
            }
            
           
        }
        return count<=days;
    }
    
    public int shipWithinDays(int[] weights, int days) {
       //binary search
        //if weight remains it can also get shiped
        
        long l=1,h=1;
        for(int i:weights)
        {
            l=Math.max(l,i);
            h+=i;
        }
        
        System.out.println(h+" "+l);
       
        long ans=0;
        while(l<=h)
        {
            long mid=l+(h-l)/2;
            if(check(weights,mid,days))
            {
                ans=mid;
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
                
            
        }
        return (int)ans;
    
    }
}