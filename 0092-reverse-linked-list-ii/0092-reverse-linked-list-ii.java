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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right || head==null || head.next == null)
        return head;
        ListNode start = null;
        ListNode pointer_to_start = null;
        ListNode curr = head;
        ListNode prev =null;
        ListNode next = null;
        int i = 1;
        while(curr != null && i != left)
        {
            prev = curr;
            curr = curr.next;
          
            i+=1;
        }
        next = curr.next;
        start = curr;
        pointer_to_start = prev;
        prev = null;
        while(curr != null && i != right+1)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i+=1;
        }
        start.next = curr;
        if(pointer_to_start != null){
        pointer_to_start.next = prev;
        
        }
        else
        return prev;
        return head;

        
    }
}