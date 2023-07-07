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
    public ListNode oddEvenList(ListNode head) {
        
        if(head==null||head.next==null||head.next.next==null)
            return head;
        ListNode temp=head;
        
        int length=0;
        while(temp.next!=null)
        {
            temp=temp.next;
            length++;
        }
        length++;
        ListNode tail=temp;
        
        temp=head;

        
        
        int i=0;
        while(i<length-1)
        {
            
                ListNode node=temp.next;
                temp.next=temp.next.next;
                temp=temp.next;
                tail.next=node;
                tail=tail.next;
                tail.next=null;
                i+=2;
                 


           
            
        }
        
        return head;
        
    }
}