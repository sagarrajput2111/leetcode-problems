//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}


class Flatttening_A_LinkedList
{	
    Node head;
	
	void printList(Node node)
    {
        //Node temp = head;
        while (node != null)
        {
            System.out.print(node.data + " ");
            node =node.bottom;
        }
        System.out.println();
    }
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Flatttening_A_LinkedList list = new Flatttening_A_LinkedList();
		while(t>0)
		{
			int N = sc.nextInt();
			int arr[] = new int[N];
			for(int i=0;i<N;i++)
				arr[i] = sc.nextInt();
			
			Node temp = null;
			Node tempB = null;
			Node pre = null;
			Node preB = null;	
			int flag=1;
			int flag1=1;
			for(int i=0; i<N;i++)
			{
				int m = arr[i];
				m--;
				int a1 = sc.nextInt();
				temp = new Node(a1);
				if(flag == 1)
				{
					list.head = temp;
					pre = temp;
					flag = 0;
					flag1 = 1;
				}
				else
				{
					pre.next = temp;
					pre = temp;
					flag1 = 1;
				}
				
				for(int j=0;j<m;j++)
				{
					int a = sc.nextInt();
					tempB = new Node(a);
					if(flag1 == 1)
					{
						temp.bottom = tempB;
						preB = tempB;
						flag1 = 0;
					}
					else
					{
						preB.bottom = tempB;
						preB = tempB;
					}
				}
				
			}
			//list.printList();
			GfG g = new GfG();
			Node root = g.flatten(list.head);
			list.printList(root);
		
		t--;
		}
	}	
}
// } Driver Code Ends


/*Node class  used in the program
class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
*/
/*  Function which returns the  root of 
    the flattened linked list. */
class GfG
{
    public Node merge(Node l1,Node l2)
    {
        if(l1==null)
        return l2;
        if(l2==null)
        return l1;
        
        Node tail=null,head=null;
        
        if(l1.data<=l2.data)
        {
            head=l1;
            tail=l1;
            l1=l1.bottom;

        }
        
        else if(l1.data>l2.data)
        {
            head=l2;
            tail=l2;
            l2=l2.bottom;
            
        }
        
        while(l1!=null&&l2!=null)
        {
            
           if(l1.data<=l2.data)
           {
               tail.bottom=l1;
               tail=l1;
               l1=l1.bottom;
               
           }
           
           else
           {
               tail.bottom=l2;
               tail=l2;
               l2=l2.bottom;
               
           }
           
           
            
        }
        
        if(l1!=null)
        tail.bottom=l1;
        else
        tail.bottom=l2;
        
        
        return head;
        
        
        
    }
    
    Node flatten(Node head)
    {
        
        if(head==null||head.next==null)
        return head;
        
        Node l1=head,l2=null;
        Node temp=head.next;
        
        while(temp!=null)
        {
            l2=temp;
            
            l1=merge(l1,l2);
            
            temp=temp.next;
        }
        
        return l1;
        
        
	// Your code here
    }
}