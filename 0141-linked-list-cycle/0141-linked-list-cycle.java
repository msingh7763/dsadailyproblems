/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // this will detect cycle if the cycle is at thr head of ll
        // ListNode curr=head;
        // while(curr!=null){
        //     curr=curr.next;
        //     if(curr==head){
        //         return true;
        //     }

        // }
        // return false;
        
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;

        
    }
}