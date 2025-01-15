
//create and print doubly linked list

package linkedList.doubly.ii;


  public class DoubleList {
        private Node head;
        private Node tail;
        private int size;

    private class Node{
        private int data;
        private Node next;
        private Node prev;
        public Node(int data) {
            this.data = data;

        }

    }

public DoubleList() {
    this.head = null;
    this.tail = null;
    this.size = 0;
}
public boolean isEmpty() {
    return this.size == 0; //head==null
}
public int size() {
    return this.size;
}
public void display() {
    Node current = head;
    while (current != null) {
        System.out.print(current.data + "->");

    current = current.next;
    }
    System.out.println();
}

public void create() {

        head = new Node(1);
    tail = new Node(2);
        head.next =tail;
        tail.prev = head;

}

public static void main(String[] args){
    DoubleList list = new DoubleList();
    list.create();
    list.display();
}

    }


