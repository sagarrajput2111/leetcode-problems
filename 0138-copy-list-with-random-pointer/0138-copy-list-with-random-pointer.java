/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       //with hashmap
      /*  HashMap<Node,Node> hm=new HashMap<>();
        Node temp=head;
        while(temp!=null)
        {
            Node node=new Node(temp.val);
            hm.put(temp,node);
            temp=temp.next;
            
        }
        
        temp=head;
        
        while(temp!=null)
        {
            if(temp.next!=null)
            {
                hm.get(temp).next=hm.get(temp.next);
                
            }
            
            if(temp.random!=null)
            {
                hm.get(temp).random=hm.get(temp.random);
            }
               
            temp=temp.next;
            
        }
        
        return hm.get(head);
        */
        
        //3step process
        //another approach is create a deep copy of node and add it as next
        if(head==null)
            return null;
        
        Node temp=head;
        //creating the dummy node
        while(temp!=null)
        {
            
           Node node=new Node(temp.val);
            node.next=temp.next;
            temp.next=node;
            temp=temp.next.next;
        }
       
        //putting the random 
       temp=head;
        while(temp!=null)
        {
            if(temp.random!=null)
                temp.next.random=temp.random.next;
            temp=temp.next.next;
             
            
        }
        
        
        
        // while(head!=null)
        // {
        //     System.out.println(head.val);
        //     head=head.next;
        // }
        //now we have to seperate the list
//         slow=head;
//         fast=head.next;
//         Node newHead=head.next;
//         while(fast!=null)
//         {
//             if(fast.next==null)
//                 break;
//             slow.next=slow.next.next;
//             fast.next=fast.next.next;
            
//         }
        
    Node dummy = new Node(0);
    Node itr = head;
    temp = dummy;
    Node fast=null;
    while(itr != null) {
        fast = itr.next.next;
        temp.next = itr.next;
        itr.next = fast;
        temp = temp.next;
        itr = fast;
    }
        
        
        return dummy.next;
    }
}