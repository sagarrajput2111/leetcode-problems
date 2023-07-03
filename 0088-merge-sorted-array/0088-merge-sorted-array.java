class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result=new int[n+m];
        
        int i=0,j=0;
        int ptr=0;
        while(i<m||j<n)
        {
            
            if(i<m&&j<n)
            {
                if(nums1[i]<=nums2[j])
                {
                    result[ptr]=nums1[i];
                    i++;
                    ptr++;
                }
                else
                {
                    result[ptr]=nums2[j];
                    j++;
                    ptr++;
                }
            }
            
            else if(i<m)
            {
                
                while(i<m)
                {
                    result[ptr]=nums1[i];
                    i++;
                    ptr++;
                }
            }
            else {
                while(j<n)
                {
                    result[ptr]=nums2[j];
                    j++;
                    ptr++;
                }
            }
        }
        int k=0;
       while(k<m+n)
       {
           nums1[k]=result[k];
           k++;
       }
        return;
    }
}