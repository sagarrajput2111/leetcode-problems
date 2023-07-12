class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        
        //we didi this apply binary search in only small part of the array
        if(nums2.length<nums1.length)
            return findMedianSortedArrays(nums2,nums1);
        
        int n=nums1.length,m=nums2.length;
        
        int l=0,h=nums1.length;
        int median=(n+m+1)/2;
        
        while(l<=h)
        {
            int cut1=(l+h)/2;
            int cut2=median-cut1;
            int l1=cut1==0?Integer.MIN_VALUE:nums1[cut1-1];
            int r1=cut1==n?Integer.MAX_VALUE:nums1[cut1];
            int l2=cut2==0?Integer.MIN_VALUE:nums2[cut2-1];
            int r2=cut2==m?Integer.MAX_VALUE:nums2[cut2];
//             int mid=l+(h-l)/2;
//             int l1=mid-1>=0?nums1[mid-1]:Integer.MIN_VALUE;
//             int r1=mid<nums1.length?nums1[mid]:Integer.MAX_VALUE;
//             int l2=leftcount-mid-1>=0?nums2[leftcount-mid-1]:Integer.MIN_VALUE;
//             int r2=leftcount-mid<nums2.length?nums2[leftcount-mid]:Integer.MAX_VALUE;
            
            if(l1<=r2&&l2<=r1)
            {
                if((nums1.length+nums2.length)%2==0)
                    return (((double)Math.max(l1,l2))+((double)Math.min(r1,r2)))/2.0;
                else
                    return (double)Math.max(l1,l2);
            }
            else if(l1>r2)
            {
                
                h=cut1-1;
            }
            else
            {
               l=cut1+1;
            }   
        }
        return 0.0;
    }
}