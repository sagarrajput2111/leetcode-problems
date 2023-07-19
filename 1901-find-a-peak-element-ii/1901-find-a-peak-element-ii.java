class Solution {
    
    public int findIndex(int[] arr)
    {
        int max=0;
        int res=0;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
                res=i;
                
            }
        }
        
        return res;
        
    }
    public int[] findPeakGrid(int[][] mat) {
        
        int l=0,h=mat.length;
        
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            
            int idx=findIndex(mat[mid]);
            int upValue=mid==0?-1:mat[mid-1][idx];
            int downValue=mid==mat.length-1?-1:mat[mid+1][idx];
            
            if(mat[mid][idx]>upValue&&mat[mid][idx]>downValue)
            {
                return new int[]{mid,idx};
            }
            
            else if(mat[mid][idx]<upValue)
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
            
        }
        
        return new int[]{0,0};
        
    }
}