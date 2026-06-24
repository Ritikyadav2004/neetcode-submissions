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
        int sum=0;
        int carry=0;
        ListNode head= new ListNode(0);
        ListNode ptr= head;
       while(l1!=null || l2!=null)
       { sum=0;
         int val1=(l1!=null)?l1.val:0;
         int val2=(l2!=null)?l2.val:0;

         sum+=val1+val2+carry;
         carry=sum/10;
         ptr.next= new ListNode(sum%10);
         ptr=ptr.next;


         if(l1!=null)l1=l1.next;
         if(l2!=null)l2=l2.next;
       }
       if(carry>0)
       {
         ptr.next= new ListNode(carry);
         ptr=ptr.next;
       }

        return head.next;
    }
}
