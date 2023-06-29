package LinkedList;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/6/29 11:27
 * @Version 1.0
 */


public class Remove_Nth_Node_From_End_of_List_019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode left = dummy, right = dummy;
        while (n-- > 0) {
            right = right.next;
        }
        while (right.next != null) {
            right = right.next;
            left = left.next;
        }
        left.next = left.next.next;
        return dummy.next;
    }
}
