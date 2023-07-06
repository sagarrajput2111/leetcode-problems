/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1=headA,l2=headB;
       /* int length1=0,length2=0;
        while(l1!=null)
        {
            length1++;
            l1=l1.next;
            
        }
        
        while(l2!=null)
        {
            length2++;
            l2=l2.next;
        }
        System.out.println(length1+" "+length2);
        l1=headA;
        l2=headB;
        int count=0;
        if(length1>=length2)
        {
             count=length1-length2;
            while(count!=0)
            {
                l1=l1.next;
                count--;
            }
        }
        else
        {
            count=length2-length1;
            while(count!=0)
            {
                l2=l2.next;
                count--;
            } 
        }
        
        while(l1!=l2&&l1!=null&&l2!=null)
        {
            l1=l1.next;
            l2=l2.next;
        }
        
        if(l1==l2)
        {
            return l1;
        }
        else
        {
            return null;
        }
        
        */
        //method 2
        
        while(l1!=l2)
        {
            l1=l1==null?headB:l1.next;
            l2=l2==null?headA:l2.next;
        }
        return l1;
    }
}