
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode slow = node;
        ListNode fast = node.next;
        while (fast != null) {
            while (fast.next != null && fast.val == fast.next.val) {
                fast = fast.next;
            }
            if (slow.next == fast) {
                slow = slow.next;
            } else {
                slow.next = fast.next;
            }
            fast = fast.next;
        }
        return node.next;
    }
}
