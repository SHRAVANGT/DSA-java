package linkedList.Singly;

public class twoSum {
    private Node head1;
    private Node head2;

    private class Node{
        private int data;
        private Node next;


        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public void printList(Node temp) {

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void createList(){
        head1 = new Node(7);
        head2 = new Node(5);
 Node sec1 = new Node(4);
 Node sec2 = new Node(6);
 Node third1 = new Node(9);
// Node third2 = new Node(6);
 head1.next = sec1;
 sec1.next = third1;
 head2.next = sec2;
// sec2.next = third2;
    }

    public void sum(){
        Node temp1 = head1;
        Node temp2 = head2;
        Node curr = new Node(0);
Node temp = curr;
int carry = 0;
        while (temp1 != null || temp2 != null ) {
            int a=temp1!=null?temp1.data:0;
            int b = temp2!=null?temp2.data:0;
          int summ  = carry+ a+b;
          carry = summ / 10;
          temp.next = new Node(summ % 10);
          if(temp1!=null)temp1 = temp1.next;
          if(temp2!=null)temp2 = temp2.next;
          temp = temp.next;
        }

        if(carry>0){
            temp.next = new Node(carry);
        }
        reverseList(curr.next);
//        System.out.println(curr.data);
    }

    public void reverseList(Node temp) {
        if (temp == null) {
            System.out.println("null");
        }
        Node start;
        Node end = null;
        while (temp != null) {
            start = temp.next;
            temp.next = end;
            end = temp;
            temp = start;
        }
        printList(end);
    }
    public static void main(String[] args) {
        twoSum li  = new twoSum();
        li.createList();
        li.printList(li.head1);
        li.printList(li.head2);
        li.sum();
    }
}
