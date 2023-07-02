class Solution {
    public int findPeakElement(int[] nums) {
        
        if(nums.length==1)
            return 0;
        if(nums[0]>nums[1])
            return 0;
        if(nums[nums.length-1]>nums[nums.length-2])
            return nums.length-1;
        int l=1,h=nums.length-2;
        
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1])
            {
                return mid;
            }
            
            else if(nums[mid]>nums[mid-1])
            {
                l=mid+1;
            }
            
            else
            {
                h=mid-1;
            }
                
            
        }
        
        return 0;
    }
}