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
    
    public ListNode reverse(ListNode head)
    {
        if(head==null||head.next==null)
            return head;
        
        ListNode curr=head,prev=null,temp=null;
        
        while(curr!=null)
        {
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            
        }
        return prev;
        
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        
        
        if(head.next==null||k==1)
            return head;
        
        ListNode temp1=head;
        ListNode newHead=null;
        ListNode tail=null;
        ListNode myHead=head;
        
        while(temp1!=null)
        {
            
            int i=0;
            while(temp1!=null&&i<k-1)
            {
              temp1=temp1.next;
                i++;
            }
            if(temp1==null)
            {
                break;
            }

            newHead=temp1.next;
            temp1.next=null;
            if(tail==null)
            {
                head=reverse(myHead);
                tail=myHead;
            }
            else
            {
                tail.next=reverse(myHead);
                tail=myHead;
            }
            myHead.next=newHead;
            myHead=myHead.next;
            temp1=myHead;
            
        }
        return head;
        
    }
}