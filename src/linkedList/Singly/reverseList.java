package linkedList.Singly;

public class reverseList {
    private static ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data=data;
            this.next=null;

        }
    }
    public  void printList(ListNode head) {
        reverseList.ListNode curr = head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode temp = head;
        ListNode start;
        ListNode end = null;
        while (temp != null) {
            start = temp.next;
            temp.next = end;
            end = temp;
            temp = start;
        }
        return end;
    }

    public static void main(String[] args){
        reverseList li = new reverseList();
        li.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        head.next= second;
        second.next= third;
        third.next= fourth;
        fourth.next=null;
        li.printList(head);
        ListNode re=li.reverseList(head);
        li.printList(re);
    }
}
