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
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        int carry = 0;
        while(t1 != null || t2 != null){
            int t1_val = (t1==null) ? 0 : t1.val;
            int t2_val = (t2==null) ? 0 : t2.val;
            int sum = t1_val + t2_val;
            sum += carry;
            carry = sum /10;
            sum %= 10;
            ListNode new_node = new ListNode(sum);
            curr.next = new_node;
            curr = new_node;
            
            t1 = (t1==null) ? t1 : t1.next;
            t2 = (t2==null) ? t2 : t2.next;
        }
        if(carry != 0){
         ListNode new_node = new ListNode(carry);
        curr.next = new_node;
        }

        return dummy.next;

        
    }
}