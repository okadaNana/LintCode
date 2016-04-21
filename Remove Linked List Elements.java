/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    /**
     * @param head a ListNode
     * @param val an integer
     * @return a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // Empty LinkedList
        if (head == null) {
            return null;
        }
        
        // LinkedList only has one node
        if (head.next == null) {
            if (head.val == val) {
                return null;
            } else {
                return head;
            }
        }
        
        // LinkedList has more than one node
        ListNode currNode = head;
        while (currNode != null) {
            if (currNode.val == val) {                
                currNode = currNode.next;
                head = currNode;
                continue;
            }
            
            if (currNode.next != null) {
                if (currNode.next.val == val) {
                    currNode.next = currNode.next.next;
                } else {
                    currNode = currNode.next;
                }
            } else {
                currNode = currNode.next;
            }            
        }
        return head;
    }
}
