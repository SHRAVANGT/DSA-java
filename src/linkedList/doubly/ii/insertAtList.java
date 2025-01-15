
//insert node at beginning ,end and given at any position

package linkedList.doubly.ii;

public class insertAtList {
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

    public insertAtList() {
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
    public void insertAtBeginning(int val){
        Node temp = new Node(val);
        if(isEmpty()){
            tail = temp;
        }
        else{
            head.prev = temp;
        }
        temp.next = head;
        head = temp;
        size++;
    }
    public void insertAtEnd(int val){
        Node temp = new Node(val);
        if(isEmpty()){
            head = temp;
        }
        else{
            tail.next = temp;
            temp.prev = tail;
        }
        tail = temp;
        size++;
    }
    public static void main(String[] args){
        insertAtList list = new insertAtList();
        list.insertAtBeginning(1);
        list.display();
        list.insertAtBeginning(2);
        list.insertAtEnd(3);
        list.display();
    }
}
