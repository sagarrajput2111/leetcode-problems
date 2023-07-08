class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target1) {

        List<List<Integer>> list=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        long target=(long)(target1);
        
         for(int i=0;i<nums.length;i++)
        {
            
             if (i > 0 && nums[i] == nums[i - 1]) continue;
                long sum1=target-nums[i];
            
            for(int j=i+1;j<nums.length;j++)
            {
                if (j >i+1 && nums[j] == nums[j - 1])
                    continue;
                
            //now we use two pointers to find the remainder
            
            int l=j+1,h=nums.length-1;
                long remainder=sum1-nums[j];
            while(l<h)
            {
                if((long)(nums[l]+nums[h])==remainder)
                {
                    List<Integer> temp=new ArrayList<Integer>();
                    
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[l]);
                    temp.add(nums[h]);
                    list.add(temp);
                   
                    while (l < h && nums[l] == nums[l + 1]) l++;
                    while (l< h && nums[h] == nums[h - 1]) h--;

                       l++;
                       h--;
                     }
                
                else if ((long)(nums[l] + nums[h])< remainder) l++;

                     else h--;
           
                 }
                
                
                
        
            }
                
        
        
            }
         
         
        
        
        return list;
    }
}