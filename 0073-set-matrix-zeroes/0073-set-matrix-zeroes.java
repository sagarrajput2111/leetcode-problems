class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        System.out.println(n);
        System.out.println(m);
        
        int [] verti=new int[n];
        int [] hori=new int[m];
        Arrays.fill(verti,1);
        Arrays.fill(hori,1);    
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                
                if(matrix[i][j]==0)
                {
                    verti[i]=0;
                    hori[j]=0;
                }
            }
        }
        System.out.println(verti[0]);
        System.out.println(hori[0]);
        
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                
                if(verti[i]==0||hori[j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }
                
    }
}