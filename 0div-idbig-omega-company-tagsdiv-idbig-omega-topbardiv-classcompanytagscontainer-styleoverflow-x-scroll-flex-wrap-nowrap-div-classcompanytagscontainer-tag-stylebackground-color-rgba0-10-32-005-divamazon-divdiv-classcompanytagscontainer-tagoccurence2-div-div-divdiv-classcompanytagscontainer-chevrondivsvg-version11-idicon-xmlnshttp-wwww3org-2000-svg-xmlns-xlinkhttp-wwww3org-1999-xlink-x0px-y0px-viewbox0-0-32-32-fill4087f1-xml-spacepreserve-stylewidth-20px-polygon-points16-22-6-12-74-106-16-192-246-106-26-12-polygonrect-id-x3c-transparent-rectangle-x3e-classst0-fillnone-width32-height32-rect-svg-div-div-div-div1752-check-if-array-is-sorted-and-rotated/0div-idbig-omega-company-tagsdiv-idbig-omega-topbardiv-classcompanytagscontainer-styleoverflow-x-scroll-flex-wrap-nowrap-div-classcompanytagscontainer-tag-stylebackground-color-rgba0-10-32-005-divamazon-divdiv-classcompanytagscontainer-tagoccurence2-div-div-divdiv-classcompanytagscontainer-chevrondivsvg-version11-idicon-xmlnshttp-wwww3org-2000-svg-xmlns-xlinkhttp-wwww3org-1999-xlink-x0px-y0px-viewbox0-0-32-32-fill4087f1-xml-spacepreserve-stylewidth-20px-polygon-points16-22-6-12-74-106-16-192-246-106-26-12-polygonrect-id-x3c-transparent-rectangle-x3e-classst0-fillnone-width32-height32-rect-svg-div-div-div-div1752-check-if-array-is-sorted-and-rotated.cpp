class Solution {
public:
    bool check(vector<int>& nums) {
        
        int idx=-1;
        for(int i=0;i<nums.size()-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                idx=i;
            }
        }
        if(idx==-1)
            return true;
        bool flag=true;
        for(int i=idx+1;i<nums.size()+idx;i++)
        {
            if(nums[i%nums.size()]>nums[(i+1)%nums.size()])
                return false;
        }
        return true;
        
    }
};