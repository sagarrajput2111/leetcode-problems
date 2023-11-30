class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n=nums.size();
        long sum=n*(n+1)/2;
        long tempsum=0;
        for(int i=0;i<n;i++)
            tempsum+=nums[i];
        return (int)(sum-tempsum);
        
    }
};