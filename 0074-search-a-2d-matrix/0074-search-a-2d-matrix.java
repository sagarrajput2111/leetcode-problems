class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0;
       int h=matrix.length*(matrix[0].length)-1;
        int m=matrix[0].length;
        
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            
            if(matrix[mid/m][mid%m]==target)
            {
                return true;
            }
            
            else if(matrix[mid/m][mid%m]<target)
            {
                l=mid+1;
            }
            else
            {
                h=mid-1;
            }
        }
        
        return false;
        
        
    }
}