
//create and print doubly linked list

package linkedList.doubly.i;

//method 1
public class doubleList {
    private Node head;

    private class Node {
        private int data;
        private Node prev;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void createList() {
        head = new Node(0);
        Node sec = new Node(1);
        Node third = new Node(2);
        Node fourth = new Node(3);
        Node fifth = new Node(4);
        head.next = sec;
        sec.prev = head;
        sec.next = third;
        third.prev = sec;
        third.next = fourth;
        fourth.prev = third;
        fourth.next = fifth;
        fifth.prev = fourth;
        printList();
    }

    public static void main(String[] args) {
        doubleList li = new doubleList();
        li.createList();
    }

}
