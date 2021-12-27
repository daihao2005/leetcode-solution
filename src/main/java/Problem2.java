public class Problem2 {

    public static void main(String[] args) {
        ListNode l1 = ListNode.create(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode l2 = ListNode.create(new int[]{9, 9, 9, 9});
        Problem2 p = new Problem2();
        ListNode listNode = p.addTwoNumbers(l1, l2);
        while (listNode != null) {
            System.out.print(listNode.val);
            System.out.print(",");
            listNode = listNode.next;
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode vHead = new ListNode();
        ListNode tempR = vHead;
        int t = 0;
        while (temp1 != null || temp2 != null) {
            int curResult;

            if (temp1 == null) {
                curResult = temp2.val;
            } else if (temp2 == null) {
                curResult = temp1.val;
            } else {
                curResult = temp1.val + temp2.val;
            }
            curResult = curResult + t;

            int curT;
            if (curResult >= 10) {
                curT = 1;
                curResult = curResult - 10;
            } else {
                curT = 0;
            }
            ListNode t1 = new ListNode();
            t1.val = curResult;
            tempR.next = t1;

            t = curT;
            tempR = t1;
            temp1 = temp1 == null ? null : temp1.next;
            temp2 = temp2 == null ? null : temp2.next;
        }
        if (t > 0) {
            tempR.next = new ListNode(1);
        }
        return vHead.next;
    }


}
