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
class Solution implements Comparator<ListNode>{
    @Override
    public int compare(ListNode a , ListNode b){
        return Integer.compare(a.val , b.val);
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(this);
        ListNode t1 = list1;
        ListNode t2 = list2;
        while(t1 != null ){
            pq.offer(t1);
            t1 = t1.next;
        }
         while(t2 != null ){
            pq.offer(t2);
            t2 = t2.next;
        }
       ListNode dummy = new ListNode(-1);
       ListNode curr = dummy;
       while(!pq.isEmpty()){
        ListNode node = pq.poll();
        curr.next = node;
        curr = curr.next;
       }
       curr.next = null;
       return dummy.next;
        
    }
}