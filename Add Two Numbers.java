/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;      
 *     }
 * }
 */
public class Solution {
    /**
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2 
     */
    public ListNode addLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return null;
        }
        
        ListNode result = new ListNode(0);
        ListNode currNode = result;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            currNode.next = new ListNode(sum % 10);
            carry = sum / 10;
            
            l1 = l1.next;
            l2 = l2.next;
            currNode = currNode.next;
        }
        
        while (l1 != null) {
            int sum = l1.val + carry;
            currNode.next = new ListNode(sum % 10);
            carry = sum / 10;
            
            l1 = l1.next;
            currNode = currNode.next;
        }
        
        while (l2 != null) {
            int sum = l2.val + carry;
            currNode.next = new ListNode(sum % 10);
            carry = sum / 10;

            l2 = l2.next;
            currNode = currNode.next;
        }
        
        if (carry != 0) {
            currNode.next = new ListNode(carry);
        }
        return result.next;
    }
}
