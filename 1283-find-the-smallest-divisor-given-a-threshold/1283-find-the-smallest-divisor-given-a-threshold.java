class Solution {
    
    public boolean check(int[]nums, int threshold,int mid){
        
        long sum=0;
        for(int i=0;i<nums.length;i++)
        {
            double cons=(double)(nums[i])/(double)(mid);
            sum=sum+(long)Math.ceil(cons);
            if(sum>(long)threshold)
            {
                System.out.println(mid+" "+false);
                return false;
                
            }
            
        }
    
        System.out.println(mid+" "+true);
        return true;
        
        
    }
    
    public int smallestDivisor(int[] nums, int threshold) {
        
        //1 to maxi
        
        int h=1,l=1;
        for(int i=0;i<nums.length;i++)
        {
            h=Math.max(h,nums[i]);
        }
        
        System.out.println(h);
        
        int ans=0;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(check(nums,threshold,mid))
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