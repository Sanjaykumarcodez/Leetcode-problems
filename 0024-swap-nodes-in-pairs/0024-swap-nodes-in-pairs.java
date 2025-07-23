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
    public ListNode swapPairs(ListNode head) {
        ListNode node = head;
        while(head != null &&head.next != null){
            int a = head.val,b=head.next.val;
            a = a+b;
            b = a-b;
            a = a-b;
            head.val = a;
            head.next.val = b;
            if(head.next.next != null){
                head = head.next.next;
            }else{
                head = head.next;
            }
        }

        return node;
    }
}