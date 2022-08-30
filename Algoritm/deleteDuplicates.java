class Solution {
    public ListNode deleteDuplicates(ListNode head) {
     if(head == null || head.next == null)
            return head;
        
        ListNode res = head;
        while(head != null){
            ListNode h = head;
            while(h.next != null && h.val == h.next.val) // skip the duplicates
                h = h.next;
            head.next = h.next;   // update the next of the  predecessor
            head = h.next; 
        }
        return res;
    }
}
