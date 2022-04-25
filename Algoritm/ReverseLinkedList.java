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
public ListNode newHead;
public ListNode reverseList(ListNode head) {
//Checking for corner case: no nodes.
if (head == null) return null;

    //Checking for corner case: one node.
    if (head.next == null)  return head; 

    //We need this before the recurions starts because the                             
	//recursion stops at the second last node.
    newHead = head.next;  
    
    //Keep recursing until the second last node is reached
    if (head.next.next != null) reverseList(head.next); 
    
    //Start reversing each node one by one.
    head.next.next = head;
    
    //Make sure to cut off the old connedtions to avoid circular list
    head.next = null;
    
    return newHead;
}
}
