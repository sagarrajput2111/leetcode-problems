//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int m = Integer.parseInt(inputLine[1]);
		    long arr1[] = new long[n];
		    long arr2[] = new long[m];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr1[i] = Long.parseLong(inputLine[i]);
		    }
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<m; i++){
		        arr2[i] = Long.parseLong(inputLine[i]);
		    }
		    Solution ob = new Solution();
		    ob.merge(arr1, arr2, n, m);
		    
		    StringBuffer str = new StringBuffer();
		    for(int i=0; i<n; i++){
		        str.append(arr1[i]+" ");
		    }
		    for(int i=0; i<m; i++){
		        str.append(arr2[i]+" ");
		    }
		    System.out.println(str);
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        
        int gap=(n+m+1)/2;
        
        while(gap>0)
        {
            int left=0;
            int right=gap;
            
            while(right<(n+m))
            {
                
                if(left<n&&right<n)
                {
                    if(arr1[left]>arr1[right])
                    {
                        //swap
                        arr1[left]=arr1[left]^arr1[right]^(arr1[right]=arr1[left]);
                    }
                   
                    
                }
                
                else if(left<n&&right>=n)
                {
                    
                    if(arr1[left]>arr2[right-n])
                    {
                        //swap
                        arr1[left]=arr1[left]^arr2[right-n]^(arr2[right-n]=arr1[left]);
                    }
                  
                }
                
                else if(left>=n&&right>=n)
                {
                     if(arr2[left-n]>arr2[right-n])
                    {
                        //swap
                       arr2[left-n]=arr2[left-n]^arr2[right-n]^(arr2[right-n]=arr2[left-n]);
                    }
                    
                }
                
                    left++;
                    right++;
              
            }
            if(gap==1)
            return;
            
             gap=(gap+1)/2;
            
        }



    }
}
