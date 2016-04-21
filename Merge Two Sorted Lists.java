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
     * @param ListNode l1 is the head of the linked list
     * @param ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        
        if (l2 == null) {
            return l1;
        }
        
        ListNode mallerNode = null;
        if (l1.val < l2.val) {
            mallerNode = l1;
            mallerNode.next = mergeTwoLists(l1.next, l2);
        } else {
            mallerNode = l2;
            mallerNode.next = mergeTwoLists(l1, l2.next);
        }
        return mallerNode;
    }
}
