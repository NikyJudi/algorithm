

public class RemoveElements {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode node = head;
        while (node != null) {
            remove(head,val);
            node = node.next;
        }
        return head;
    }
    public void remove (ListNode head,int val) {
        if (head == null){
            return;
        }
        if (head.val == val) {
            head = head.next;
            return;
        }
        ListNode pre = getPrePos (head,val);
        if (pre != null){
            pre.next = pre.next.next;
        } else {
            return;
        }
    }
    public ListNode getPrePos (ListNode head, int val) {
        for (ListNode p = head; p.next != null; p = p.next){
            if (p.next.val == val) {
                return p;
            }
        }
        return null;
    }
    }
}