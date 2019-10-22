public class MergeTwoLists {
    public static void main(String[] args) {

    }
     public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
         }
     }
    class Solution {
        public ListNode mergeTwoLists(ListNode L1, ListNode L2) {
            //合并两个有序链表
            ListNode pHead = new ListNode(-1);
            ListNode p = pHead;
            while (L1 != null && L2 != null) {
                if (L1.val < L2.val) {
                    p.next = L1;
                    L1 = L1.next;
                } else {
                    p.next = L2;
                    L2 = L2.next;
                }
                p = p.next;
            }
            if (L1 == null) {
                p.next = L2;
            }else {
                p.next = L1;
            }
            return pHead.next;
        }
    }
}
