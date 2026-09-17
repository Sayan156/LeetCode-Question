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
        ListNode node = new ListNode(-1);
        ListNode curr = node;
        ListNode t1 = list1;
        ListNode t2 = list2;
        while(t1 != null && t2 != null){
            int val1 =  t1.val;
            int val2 =  t2.val;
            if(val1 < val2){
                curr.next = t1;
                curr = curr.next;
                t1 = t1.next;

            }
            else 
            {
                curr.next = t2;
                curr = curr.next;
                t2 = t2.next;

            }
            
        }
        if(t1 != null)
        {
            while(t1 != null){
            curr.next = t1;
            t1 = t1.next;
            curr = curr.next;
            }
        }
        if(t2 != null)
        {
            while(t2 != null){
            curr.next = t2;
            t2 = t2.next;
            curr = curr.next;
            }
        }
        return node.next;
        
    }
}