class Solution {
    public int longestConsecutive(int[] nums) {
        
        int n=nums.length;
        if(n==0)
            return 0;
//         Arrays.sort(nums);
//         int finalSum=1;
//         int tempSum=1;
        
//         for(int i=0;i<n-1;i++)
//         {
           
//             if(nums[i]==nums[i+1]-1)
//             {
//                 tempSum++;
            
            
//             if(tempSum>finalSum)
//                 finalSum=tempSum;
//             }
            
//             else if(nums[i]==nums[i+1])
//             {
                
//             }
//             else
//             {
//                 tempSum=1;
//             }
                
            
            
//         }
//         return finalSum;
        
        //optimal approach
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0;i<n;i++)
        {
            
            set.add(nums[i]);
        }
        
        int finalans=1;
        int tempans=1;
        
        for(int i=0;i<n;i++)
        {
            tempans=1;
            if(!set.contains(nums[i]-1))
            {
                int m=nums[i]+1;
                while(set.contains(m))
                {
                    tempans++;
                    m++;
                }
                
            }
            
            if(finalans<tempans)
                finalans=tempans;

            
            
        }
        
        
        
        return finalans;
    }
}