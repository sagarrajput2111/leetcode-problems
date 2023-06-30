class Solution {
    
    public int findP(int[] nums,int l, int h)
    {
        
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(nums[mid]<nums[0]&&nums[mid]<nums[mid-1])
            {
                return mid;
            }
            else if(nums[mid]>=nums[0])
            {
                l=mid+1;
            }
                
            else if(nums[mid]<nums[0])
            {
            h=mid;
            }
            
        }
        return -1;
        
    }
    
     public int bsearch(int[] nums, int target,int l,int h) {
        
        
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        
        return -1;
        
    }
    public int search(int[] nums, int target) 
    
    
        
    {
        
    int pivot=findP(nums,0,nums.length-1);
    System.out.println(pivot);
       if(pivot==-1)
           return bsearch(nums,target,0,nums.length-1);
       int idx1=bsearch(nums,target,0,pivot-1);
        int idx2=bsearch(nums,target,pivot,nums.length-1);
        
        System.out.println(idx1+" "+ idx2);
        
        if(idx1==-1&&idx2==-1)
            return -1;
        else if(idx1!=-1)
            return idx1;
        else
            return idx2;
        
       
        
    }
}