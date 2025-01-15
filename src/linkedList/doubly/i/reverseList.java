package linkedList.doubly.i;

public class reverseList {
    private  Node head;
private Node tail;
    private class Node{
        private int data;
        private Node next;
        private Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
public reverseList() {
        this.head = null;
        this.tail = null;
}
    public void printForwardList(){
        Node temp  = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void printReverseList(){
        Node temp  = tail;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.prev;
        }
        System.out.println("null");
    }
    public void createList(){
        head=new Node(1);
        Node sec  = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        tail = new Node(5);
        head.next = sec;
        sec.prev = head;
        sec.next = third;
        third.prev = sec;
        third.next = fourth;
        fourth.prev  = third;
        fourth.next = tail;
        tail.prev=  fourth;
    }


    public static  void main(String[] args){
        reverseList li = new reverseList();
        li.createList();
        li.printForwardList();
li.printReverseList();
    }
}
