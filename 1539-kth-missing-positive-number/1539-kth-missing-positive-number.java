class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        //brute force
        
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]<k+1)
//                 k++;
//             else
//                 break;
            
            
//         }
//         return k;
        
        
        //optimal binary search
        int l=0,h=arr.length-1;
        
        while(l<=h)
        {
            
            int mid=l+(h-l)/2;
            
            int missing=arr[mid]-mid-1;
            if(missing<k)
                l=mid+1;
            else
                h=mid-1;
            
        }
        
        /*
        ans should be arr[h]+(k-missing at h) but h can be -1 if l=0 so
        arr[h]+k-(arr[h]-h-1)
        arr[h]+k-arr[h]+h+1
        k+h+1
        h+1=l
        k+l is the ans;
        
        */
        
        return k+l;
    }
}