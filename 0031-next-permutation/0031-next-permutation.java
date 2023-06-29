class Solution {
    
    public void reverse ( int[] arr ,int i, int n)
    {
        
       
        int j=n-1;
        while(i<=j)
        {
        //swap
            arr[i]=arr[i]^arr[j]^(arr[j]=arr[i]);
            i++;
            j--;
            
        }
        
        
    }
    public void nextPermutation(int[] nums) {
        
        if(nums.length==1)
            return;
        int n=nums.length;
        int idx=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i+1]>nums[i])
            {
                idx=i;
                break;
                
            }
            
        }
        
        if(idx==-1)
        {
            reverse(nums,0,n);
        
            return;
        }
        
        for(int i=n-1;i>idx;i--)
        {
            if(nums[idx]<nums[i])
            {
                //swap
                nums[idx]=nums[idx]^nums[i]^(nums[i]=nums[idx]);
                break;
            }
        }
        
        
        //reverse
        
        reverse(nums,idx+1,n);
        
        
        
       
        
    }
}