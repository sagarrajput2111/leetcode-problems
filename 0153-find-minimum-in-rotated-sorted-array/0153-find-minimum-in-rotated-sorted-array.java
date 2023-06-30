class Solution {
    public int findMin(int[] nums) {
        int l=0,h=nums.length-1;
          
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(nums[mid]<nums[0]&&nums[mid]<nums[mid-1])
            {
                return nums[mid];
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
        
        
        return nums[0];
        
        
    }
}