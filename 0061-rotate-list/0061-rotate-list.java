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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null||head.next==null)
            return head;
        int length=1;
        ListNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            length++;
        }
        
        k=k%length;
        
        if(k==0)
            return head;
        //we need two nodes now 
        
        ListNode slow=null,fast=head;
        int k1=length-k;
        
        System.out.println(k1);
        
        while(k1!=0)
        {
            slow=fast;
            fast=fast.next;
            k1--;
            
        }
        
        slow.next=null;
        temp.next=head;
        head=fast;
        
        
        return head;
        
    }
}