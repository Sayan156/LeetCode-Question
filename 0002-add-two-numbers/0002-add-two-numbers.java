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
        int carry = 0;
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode ans = new ListNode(-1);
        ListNode ans_ptr = ans;
        while(t1 != null && t2 != null){
            int sum = t1.val + t2.val + carry;
            int s = sum % 10;
            carry = sum/10;
            ListNode temp = new ListNode(s);
            ans_ptr.next = temp;
            ans_ptr = ans_ptr.next;
            t1 = t1.next;
            t2 = t2.next;
        }
        while(t1 != null){
            int sum = t1.val  + carry;
            int s = sum % 10;
            ListNode temp = new ListNode(s);
            ans_ptr.next = temp;
            ans_ptr = ans_ptr.next;
            carry = sum/10;
            t1 = t1.next;
        }
        while(t2 != null){
            int sum = t2.val  + carry;
            int s = sum % 10;
            ListNode temp = new ListNode(s);
            ans_ptr.next = temp;
            ans_ptr = ans_ptr.next;
            carry = sum/10;
            t2 = t2.next;
        }
        if(carry != 0){
            ListNode temp = new ListNode(carry);
            ans_ptr.next = temp;
        }
        return ans.next;
    }
}