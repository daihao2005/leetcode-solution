public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }


    public static ListNode create(int[] array) {
        ListNode vHead = new ListNode();
        ListNode tmp = vHead;
        for (int i : array) {
            ListNode node = new ListNode(i);
            tmp.next = node;
            tmp = node;
        }
        return vHead.next;
    }
}
