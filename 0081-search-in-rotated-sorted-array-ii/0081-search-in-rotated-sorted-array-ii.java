class Solution {
    public boolean search(int[] nums, int target) {
        
        
         int l=0,h=nums.length-1;
        while(l<=h)
        {
            
            int mid=l+(h-l)/2;
            
            if(nums[mid]==target)
                return true;
            
            if(nums[mid]==nums[l]&&nums[mid]==nums[h])
            {
                l=l+1;
                h=h-1;
            }
            
            else if(nums[mid]>=nums[l])
            {
                //left side is sorted check if it present it or not
                
                if(target>=nums[l]&&target<nums[mid])
                    h=mid-1;
                else
                    l=mid+1;
                
            }
            
            else
            {
                if(target<=nums[h]&&target>nums[mid])
                    l=mid+1;
                else
                    h=mid-1;
            }
            
        }
        return false;
        
    }
}