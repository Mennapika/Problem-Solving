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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode temp=head;
       int counter=1; 
        int i=0;
		//counting the total number of elements in the list
        while(temp.next!=null)
        {
            temp=temp.next; 
             counter++;
        }
        
        //*deleting the only element in the list*
            if(counter==1)
            {
                return null;
            }
        
		//calculate the index of the element to delete
          i=counter-n;
		//reset the pointer and index
          temp=head;
          counter=1;
       //*deleting the first element in the list*
        if(i==0)
        {
            return head.next;
        }
       
	   //the counter carries the pointer one element behind him, so that when he arrives the pointer rearranges the .next's
        while(counter<i)
        {
            temp=temp.next;
            counter++;
            
        }
        temp.next=temp.next.next;
        
       return head; 
    }
}
