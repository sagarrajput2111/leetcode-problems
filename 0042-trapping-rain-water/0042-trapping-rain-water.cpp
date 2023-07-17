class Solution {
public:
    int trap(vector<int>& arr) {
        int n=arr.size();
         vector<int>ltr;
        vector<int>rtl;
        int max=arr[0];
        ltr.push_back(max);
        for(int i=1;i<n;i++){
            if(arr[i]>max){
            max=arr[i];
            ltr.push_back(max);
                
            }
            
            else
            ltr.push_back(max);
            
            
        }
        max=arr[n-1];
        rtl.push_back(max);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
            max=arr[i];
            rtl.push_back(max);
                
            }
            
            else
            rtl.push_back(max);
            
            
        }
        
        reverse(rtl.begin(),rtl.end());
        long long sum=0;
        for(int i=1;i<n-1;i++){
            
            sum=sum+min(ltr[i],rtl[i])-arr[i];
            
        }
        
        
        
        return sum;
        
        
        
        
        
        
    }
};