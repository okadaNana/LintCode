/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: The head of linked list.
     */
    ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        
        if (head.next == null) {
            return null;
        }
        
        ListNode iterator = head;
        ListNode target = head;
        ListNode prevNode = null;
        int count = 1;
        
        while (iterator != null) {
            if (count > n) {
                prevNode = target;
                target = target.next;
            }
            count++;
            iterator = iterator.next;
        }
        
        if (target == head) {
            return target.next;
        } else if (target.next == null) {
            prevNode.next = null;
            return head;
        } else {
            prevNode.next = prevNode.next.next;
            return head;
        }
    }
}
