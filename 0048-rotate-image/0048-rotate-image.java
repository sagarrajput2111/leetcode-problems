class Solution {
    
    public static void reverse ( int[] arr ,int i, int n)
    {
       
       
       
        int j=n-1;
        while(i<=j)
        {
        //swap
            arr[i]=arr[i]^arr[j]^(arr[j]=arr[i]);
            i++;
            j--;
            
        }
        
        
    }
    public void rotate(int[][] matrix) {
        
        int n=matrix.length, m=matrix[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(i!=j)
                {
                    matrix[i][j]=matrix[i][j]^matrix[j][i]^(matrix[j][i]=matrix[i][j]);
                }
            }
            
            
        }
        
        for(int i=0;i<n;i++)
        {
            reverse(matrix[i],0,m);
        }
        
        
        
    }
}