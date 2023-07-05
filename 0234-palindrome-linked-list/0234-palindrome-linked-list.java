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
        ListNode prev=null,curr=head,temp=null;
        
        while(curr!=null)
        {
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            
            
        }
        return prev;
        
    }
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        fast=head;
        
        slow=reverse(slow);
        while(slow!=null)
        {
            if(fast.val!=slow.val)
                return false;
            slow=slow.next;
            fast=fast.next;
            
        }
        return true;
    }
}