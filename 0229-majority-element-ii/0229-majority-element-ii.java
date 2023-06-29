class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int n=nums.length;
        int count1=0,count2=0,ele1=0,ele2=0;
        
        for(int i=0;i<nums.length;i++)
        {
             if(ele1==nums[i])
            {
                count1++;
            }
            else if(ele2==nums[i])
            {
                count2++;
            }
            else if(count1==0)
            {
                ele1=nums[i];
                count1=1;
            }
           
            else if(count2==0)
            {
                ele2=nums[i];
                count2=1;
            }
            
            else
            {
                count1--;
                count2--;
            }
            
        }
        
        count1=0;
        count2=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==ele1)
                count1++;
            else if(ele2==nums[i])
                count2++;
            
        }
    
    
    List<Integer> list=new ArrayList<>();
    
    if(count1>n/3)
        list.add(ele1);
    if(count2>n/3)
        list.add(ele2);
    
    return list;
    
    }
    
}