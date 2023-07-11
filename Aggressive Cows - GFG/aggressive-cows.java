//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    
    public static boolean possible(int[] arr,int k,int mid)
    {
        int count=1;
        int last=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]-arr[last]>=mid)
            {
                count++;
                last=i;
                
                if(count==k)
                return true;
                
            }
            
        }
        
        return false;
        
        
        
    }
    public static int solve(int n, int k, int[] stalls) {
        
        
        
      Arrays.sort(stalls);
      //we can either linearly travererse and search or binary search
      
      //1 to maxi-mini
      
      int l=1,h=1;
      
      for(int i:stalls)
      {
          l=Math.min(l,i);
          h=Math.max(h,i);
      }
      h=h-l;
      l=1;
      
      int ans=1;
      while(l<=h)
      {
          
          int mid=l+(h-l)/2;
          if(possible(stalls,k,mid))
          {
              ans=mid;
              l=mid+1;
          }
          else
          {
              h=mid-1;
          }
      }
        
        return ans;
        
        
    }
}