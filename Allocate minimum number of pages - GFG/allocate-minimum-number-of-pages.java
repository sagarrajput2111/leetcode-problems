//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    
    public static boolean isPossible(int[]arr,int mid, int m)
    {
        
        int count=1;
        int pages=0;
        for(int i=0;i<arr.length;i++)
        {
            
            if(pages+arr[i]>mid)
            {
                count++;
                pages=arr[i];
            }
            else
            {
                pages+=arr[i];
            }
           

        }
         return count<=m;

    }
    //Function to find minimum number of pages.
    public static int findPages(int[]arr,int n,int m)
    {
        
        if(m>n)
        return -1;
        int l=0,h=0;
        
        for(int i:arr)
        {
            l=Math.max(i,l);
            h+=i;
        }
        
        int ans=0;
        
        
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(isPossible(arr,mid,m))
            {
                ans=mid;
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
            
        }
        
        return ans;
        
        //Your code here
    }
};