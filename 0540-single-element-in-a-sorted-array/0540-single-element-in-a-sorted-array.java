class Solution {
    public int singleNonDuplicate(int[] nums) {
       if(nums.length==1)
           return nums[0];
        if(nums[0]!=nums[1])
            return nums[0];
        if(nums[nums.length-1]!=nums[nums.length-2])
            return nums[nums.length-1];
        
        //this remove the edge cases 
        //now we start from 1 and n-2
        int l=1,h=nums.length-2;
        
        while(l<=h)
        {
            
            int mid=l+(h-l)/2;
            if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1])
                return nums[mid];
            else if((mid%2!=0&&nums[mid]!=nums[mid+1])||mid%2==0&&nums[mid]!=nums[mid-1])
            {
                //right half 
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