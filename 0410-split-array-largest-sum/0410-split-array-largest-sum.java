class Solution {
    
    
    public boolean possible(int[] nums,int mid,int k)
    {
        int count=1,load=0;
        for(int i=0;i<nums.length;i++)
        {
            if(load+nums[i]>mid)
            {
                count++;
                load=nums[i];
            }
            else
            {
                load+=nums[i];
            }
        }
        
        return count<=k;
        
    }
    public int splitArray(int[] nums, int k) {
        
        int l=0,h=0;
        for(int i:nums)
        {
            l=Math.max(l,i);
            h+=i;
        }
        
        int ans=0;
        while(l<=h)
        {
            
            
            int mid=l+(h-l)/2;
            if(possible(nums,mid,k))
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