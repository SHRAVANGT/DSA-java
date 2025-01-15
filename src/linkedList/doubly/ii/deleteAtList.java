
//delete node at beginning ,end and given at any position

package linkedList.doubly.ii;

import java.util.NoSuchElementException;

public class deleteAtList {
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

    public deleteAtList() {
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
    public void create(int val) {
       Node temp = new Node(val);
       if (isEmpty()) {
           head = temp;
       }
       else {
           tail.next = temp;
           temp.prev = tail;

       }
        tail = temp;
        size++;
    }
    public void deleteAtBeginning() {
        if (isEmpty()) {
            throw new NoSuchElementException("nothing to delete");
        }
Node temp = head;
        if(head == tail){
            tail=null;
        }
        else {
           head = head.next;
        }
        temp.next = null;
        head.prev = null;
        size--;
    }
    public void deleteAtEnd() {
        if (isEmpty()) {
            throw new NoSuchElementException("nothing to delete");
        }
        Node temp = tail;
        if(head == tail){
            head=null;
        }
        else {
            tail = tail.prev;
        }
        temp.prev = null;
        tail.next = null;
        size--;
    }
    public static  void main(String[] args) {
        deleteAtList list = new deleteAtList();
        list.create(1);
        list.create(2);
        list.create(3);
        list.display();
        list.deleteAtBeginning();
        list.display();
        list.deleteAtEnd();
        list.display();
    }
}
