class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> hm=new HashMap<>();
       int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sum==k)
            {
                count++;
            }
            
            int remainder=sum-k;
            if(hm.containsKey(remainder))
            {
                count=count+hm.get(remainder);
            }
            
            if(!hm.containsKey(sum))
            {
                hm.put(sum,1);
            }
            else
            {
                hm.put(sum,hm.get(sum)+1);
            }
            
            
            
        }
        
        return count;
        
    }
}