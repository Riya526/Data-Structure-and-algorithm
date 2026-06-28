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
    public static int len(ListNode head){
        int c=0;
        while(head!=null){
            head=head.next;
            c++;
        }
        return c;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int n=len(head);
        int groups=n/k;
        ListNode currhead=head;
        ListNode curr=head;
        ListNode prevhead=null;
        for(int g=0;g<groups;g++){
            ListNode prev=null;
            for(int i=0;i<k;i++){
                ListNode nextnode=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nextnode;
            }
            if(prevhead==null){
                head=prev;
            }else{
                prevhead.next=prev;
            }
            prevhead=currhead;
            currhead=curr;
        }
        prevhead.next=currhead;
        return head;
        

    }
}