class Solution {
    public int maxSubArray(int[] nums) {
        
        int tempSum=0;
        int finalSum=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++)
        {
            tempSum+=nums[i];
            
            if(finalSum<tempSum)
                finalSum=tempSum;
            if(tempSum<0)
            {
                tempSum=0;
            }
             
            
        }
        
        return finalSum;
    }
}