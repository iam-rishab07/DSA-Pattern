package LinkedList.FastSlow;
import LinkedList.ListNode;

// Leetcode 142 : linked-list cycle 2
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next  != null)   // if head is null or head.next is null loop will not execute
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                slow = head;
                while(slow!=fast)
                {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
