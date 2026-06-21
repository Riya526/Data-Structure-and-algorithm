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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode data=head;
        while(data!=null && data.next!=null){
            if(data.val==data.next.val){
                data.next=data.next.next;
            }else{
                data=data.next;
            }
        }
        return head;
    }
}