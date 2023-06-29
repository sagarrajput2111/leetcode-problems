class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        //we will switch case for this
        int n=matrix.length,m=matrix[0].length;
        
        int top=0,buttom=n-1,right=m-1,left=0;
        
        List<Integer> list=new ArrayList<>();
        int direction=1;
        while(list.size()<m*n)
        {
            switch(direction)
            {
                case 1:
                    for(int i=left;i<=right;i++)
                    {
                        list.add(matrix[top][i]);
                    }
                    top++;
                    direction=2;
                    break;
                    
                case 2:
                    for(int i=top;i<=buttom;i++)
                    {
                        list.add(matrix[i][right]);
                    }
                    right--;
                    direction=3;
                    break;
                    
                case 3:
                    for(int i=right;i>=left;i--)
                    {
                        list.add(matrix[buttom][i]);
                    }
                    buttom--;
                    direction=4;
                    break;
                    
                case 4:
                    for(int i=buttom;i>=top;i--)
                    {
                        list.add(matrix[i][left]);
                    }
                    left++;
                    direction=1;
                    break;
                 
            }
              
        }
        
        return list;
    }
}