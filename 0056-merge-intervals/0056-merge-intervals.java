class Solution {
    public int[][] merge(int[][] intervals) {
        
        //sorting based on last index;
       
        
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        
        
        List<int[]> alist=new ArrayList<>();
        int n=intervals.length;
        //ArrayList<int[]> list=new ArrayList<>();
        
        int [] temp=intervals[0];
        
        
        
        
        for(int i=0;i<n;i++)
            
        {
            
            if(intervals[i][0]<=temp[1])
            {
                temp[1]=Math.max(temp[1],intervals[i][1]);
                temp[0] = Math.min(intervals[i][0], temp[0]);
                if(i==intervals.length-1)
                    alist.add(temp);
                    
                
            }
            
            
           else
           {
               alist.add(temp);
               temp=intervals[i];
               if(i==intervals.length-1)
                    alist.add(temp);
               
           }
        }
        
        System.out.println(alist);
        
        return alist.toArray(new int[alist.size()][2]);
            
    
        
    }
}