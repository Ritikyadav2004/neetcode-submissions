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
    public void reorderList(ListNode head) {
        // finding the half node;
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

        }

      
        
       ListNode secondHalf=slow.next;
       slow.next=null; // disconnecting
        

        // reversinthe half node from slow to end of the list
        ListNode prev=null;
        ListNode curr=secondHalf;
        ListNode nextNode=null;
        while(curr!=null)
        {
            nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;

        }

        // we had arrenged in reverse p\order and they start from prev now lets merge them
        ListNode firstHead=head;
        while(prev!=null)
        {
             ListNode firstNextNode=firstHead.next;
             ListNode prevNextNode=prev.next;

             firstHead.next=prev;
             prev.next=firstNextNode;
             //firstNextNode.next=prevNextNode;

             firstHead=firstNextNode;
             prev=prevNextNode;
        }
    }
}
