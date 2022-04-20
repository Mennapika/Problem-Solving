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
    public ListNode middleNode(ListNode head) {
       int count =1;
       ListNode node = head;
       ListNode middle = head;
      while(node.next!=null){
          count++;
          node=node.next;
      }
        if(count%2==0){
            int x=((count+1)/2);
            while(x>0){
                middle=middle.next;
                x--;
            }
            return middle;
        }
        else{
           int x=(count/2);
            while(x>0){
                middle=middle.next;
                x--;
            }
            return middle;
            
        }
    }
}
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
    public ListNode middleNode(ListNode head) {
       int count =1;
       ListNode node = head;
       ListNode middle = head;
      while(node.next!=null){
          count++;
          node=node.next;
      }
        if(count%2==0){
            int x=((count+1)/2);
            while(x>0){
                middle=middle.next;
                x--;
            }
            return middle;
        }
        else{
           int x=(count/2);
            while(x>0){
                middle=middle.next;
                x--;
            }
            return middle;
            
        }
    }
}
