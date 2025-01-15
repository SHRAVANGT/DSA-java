

//Insert a node value in a sorted list within order

package linkedList.Singly.sortedList;

public class insertNode {

    private static Node head;

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public  void printList() {
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public void insertnode(int val) {
        Node newNode = new Node(val);
        if(head==null){
            System.out.println("empty list");

        }
        if (newNode.data < head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp=head;
//        Node curr=null;
        while (temp.next!=null && temp.data<val-1){
//            curr=temp;
            temp=temp.next;
            }

        newNode.next=temp.next;
            temp.next=newNode;
    }
    public static void main(String[] args) {
        insertNode li = new insertNode();
        head = new Node(5);
        Node second = new Node(8);
        Node third = new Node(10);
        head.next = second;
        second.next = third;
        li.printList();
        li.insertnode(1);
        li.insertnode(11);
        li.printList();
    }
}
