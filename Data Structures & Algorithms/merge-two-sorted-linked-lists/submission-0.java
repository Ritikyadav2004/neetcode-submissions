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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode li=new ListNode(-1);
        ListNode ptr=li;
       
        while(list1!=null && list2!=null)
        {
             if(list1.val<=list2.val)
            {
                ptr.next=list1;
                list1=list1.next;
            }
            else{
                ptr.next=list2;
                list2=list2.next;
            }
            ptr=ptr.next;
        
        }

        if(list1!=null)
        {
            // while(list1!=null)
            // {
            //     ListNode temp= new ListNode();
            
           
            //     temp.val=list1.val;
           
            //   ptr.next=temp;
            // ptr=temp;
            // list1=list1.next;
            // }
            ptr.next=list1;
        }

        else
        {
            // while(list2!=null)
            // {
            //     ListNode temp= new ListNode();
            
           
            //     temp.val=list2.val;
           
            //      ptr.next=temp;
            //      ptr=temp;
            //      list2=list2.next;
            // }
            ptr.next=list2;
        }
        return li.next;

    }
}