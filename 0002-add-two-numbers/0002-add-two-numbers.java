/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        
        ListNode h1=l1,h2=l2;
        
        int input=h1.val+h2.val;
        int remainder=0;
        
        while(h1!=null&&h2!=null)
        {
            h1.val=input%10;
            remainder=input/10;
            if(h1.next==null&h2.next!=null)
            {
                h1.next=h2.next;
                h2=h2.next;
                int input2=remainder+h2.val;
                int remainder2=0;
                while(h2!=null)
                {
                    
                    h2.val=input2%10;
                    remainder2=input2/10;
                    if(h2.next==null)
                    {
                        if(remainder2!=0)
                        {
                        ListNode node=new ListNode(remainder2);
                        h2.next=node;
                        }
                        else
                        {}
                        break;
                    }
                    h2=h2.next;
                    input2=remainder2+h2.val;
                }
                break;
            }
            
            else if(h2.next==null&&h1.next!=null)
            {
                h1=h1.next;
                int input1=remainder+h1.val;
                int remainder1=0;
                while(h1!=null)
                {
                    h1.val=input1%10;
                    remainder1=input1/10;
                    if(h1.next==null)
                    {
                        if(remainder1!=0){
                        ListNode node=new ListNode(remainder1);
                        h1.next=node;
                        }
                        else
                        {}
                        break;
                    }
                    h1=h1.next;
                    input1=remainder1+h1.val;
                }
                break;
            }
            
            else if(h1.next==null&&h2.next==null){
                if(remainder!=0)
                {
                
                ListNode node=new ListNode(remainder);
                h1.next=node;
                break;
                }
                else
                {
                    break;
                }
                
                
            }
            
            else
            {
            h1=h1.next;
            h2=h2.next;
            input=h1.val+h2.val+remainder;
            
            
            }
            
            
        }
        return l1;
        
    }
}