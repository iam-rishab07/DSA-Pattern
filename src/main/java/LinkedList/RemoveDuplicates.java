package LinkedList;

// 83. remove duplicate elements from a sorted list
public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode curr = head;
        while(head.next != null)
        {
            if(head.val==head.next.val){
                head.next = head.next.next;
            }else{
                head = head.next;
            }
        }
        return curr;
    }
}
