class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int flag=1;
       
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    if(j==0)
                    {
                        matrix[i][0]=0;
                        flag=0;
                    }
                    else
                    {
                        matrix[i][0]=0;
                        matrix[0][j]=0;
                    }
                }
                
            }
        }
        
        for(int i=n-1;i>=0;i--)
        {
            for(int j=m-1;j>=0;j--)
            {
                if(j==0)
                {
                    if(flag==0||matrix[i][0]==0)
                        matrix[i][j]=0;
                }
                else
                {
                    if(matrix[i][0]==0||matrix[0][j]==0)
                    {
                        matrix[i][j]=0;
                    }
                }
                
            }
        }
                
    }
}