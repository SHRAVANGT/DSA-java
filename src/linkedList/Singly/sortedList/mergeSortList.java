package linkedList.Singly.sortedList;

public class mergeSortList {

    private static Node head1;
    private static Node head2;
    private static class Node {
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }public  void printList(Node head) {
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println("null");
    }
public Node mergeList() {

    Node temp = new Node(0);
    Node head = temp;
    Node temp1 = head1;
    Node temp2 = head2;
    while(temp1!=null && temp2!=null){
        if(temp1.data<=temp2.data){
            head.next = temp1;
            temp1  =temp1.next;
        }else {
            head.next = temp2;
            temp2 = temp2.next;
        }
        head  =head.next;
    }
    if(temp1==null)
    {
        head.next = temp2;
    }else {
        head.next = temp1;
    }
    return temp.next;
    }


    public static void main(String[] args){
        mergeSortList obj = new mergeSortList();
        head1 = new Node(1);
        head2 = new Node(3);
        Node sec = new Node(4);
        Node third = new Node(8);
        Node fourth = new Node(6);
        Node fifth = new Node(7);
        head1.next = sec;
        sec.next = third;
        head2.next = fourth;
        fourth.next = fifth;
        obj.printList(head1);
        obj.printList(head2);
        Node n1 = obj.mergeList();
        obj.printList(n1);
    }
}
