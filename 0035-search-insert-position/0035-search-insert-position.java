class Solution {
    public int searchInsert(int[] nums, int target) {
        
         int l=0,h=nums.length-1;
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
        
        l=0;h=nums.length-1;
        int idx=-1;
         while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(nums[mid]>=target)
            {
             idx=mid;
             h=mid-1;
            }
           
            else
            {
                l=mid+1;
            }
        }
        if(idx==-1)
            return nums.length;
        else
            return idx;
        
    }
}