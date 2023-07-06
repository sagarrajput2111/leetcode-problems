//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    public static Node addOne(Node head) 
    { 

        Node curr=head,temp=null,prev=null;
        
        while(curr!=null)
        {
            
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        head=prev;
        temp=prev;
        
        int remainder=0;
        int input=(temp.data+1);
         while(temp!=null)
         {
             temp.data=input%10;
             remainder=input/10;
             
             if(remainder==0)
             break;
             
             if(temp.next==null&&remainder!=0)
             {
                 Node node =new Node(remainder);
                 temp.next=node;
                 break;
             }
             
             temp=temp.next;
             input=(remainder+temp.data);
             
             
         }
         
         curr=head;temp=null;prev=null;
        
        while(curr!=null)
        {
            
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
         return prev;
    }
}
