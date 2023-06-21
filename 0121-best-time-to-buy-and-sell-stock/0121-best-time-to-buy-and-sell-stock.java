class Solution {
    public int maxProfit(int[] prices) {
        
        int maxiProfit=0;
        
        int mini=prices[0];
        
        int profit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]>mini)
             profit=prices[i]-mini;
            if(maxiProfit<profit)
                maxiProfit=profit;
            
            if(mini>prices[i])
            {
             mini=prices[i];   
            }
            
        }
        
        return maxiProfit;
        
    }
}