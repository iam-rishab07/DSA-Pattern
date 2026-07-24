package LinkedList.FastSlow;

import LinkedList.ListNode;

// 876. Middle Node
public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
