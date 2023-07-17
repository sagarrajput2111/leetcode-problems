class Solution {
    public void reverse(int[] arr)
    {
        int i=0,j=arr.length-1;
        
        while(i<j)
        {
            arr[i]=arr[i]^arr[j]^(arr[j]=arr[i]);
            i++;
            j--;
        }
    }
    public int trap(int[] height) {
//         //suffix and prefix sum
//         int n=height.length;
//         int [] ltr=new int[n],rtl=new int[n];
//         ltr[0]=height[0];
//         rtl[0]=height[n-1];
//         int max1=height[0],max2=height[n-1];
//         int i=1,j=n-2;
//         while(i<n)
//         {
//             if(max1<height[i])
//                 max1=height[i];
//             if(max2<height[j])
//                 max2=height[j];
//             ltr[i]=max1;
//             rtl[i]=max2;
//             i++;
//             j--;
            
//         }
        
//         int sum=0;
//          // Collections.reverse(Arrays.asList(rtl));
//         reverse(rtl);
        
//         for(int itr=0;itr<n;itr++)
//         {
//            System.out.println(ltr[itr]+"   "+rtl[itr]); 
//         }
        
//         for(int itr=1;itr<n-1;itr++)
//         {
//             sum+= Math.min(ltr[itr],rtl[itr])-height[itr];
//         }
//         return sum;
        
        //going to use two ponter approcah
        
        int n=height.length;
        int l=0,r=n-1,lmax=0,rmax=0;
        int sum=0;
        while(l<r)
        {
            if(height[l]<=height[r])
            {
                if(height[l]>lmax)
                    lmax=height[l];
                else
                    sum+=lmax-height[l];
                l++;
                    
            }
            else
            {
                if(height[r]>rmax)
                    rmax=height[r];
                else
                    sum+=rmax-height[r];
                r--;
            }
            
            
        }
        return sum;
        
        
    }
}