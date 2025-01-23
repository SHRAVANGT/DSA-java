
//implement queue using linkedList
//enqueue and dequeue

package StackQueue.queue;

import java.util.NoSuchElementException;

public class QueueNode {

    private Node front;
    private Node rear;
    private int size;

    private class Node {
        private int data;
        private Node next;
    public Node(int data) {
        this.data = data;
    }
    }
    public QueueNode() {
        front = null;
        rear = null;
        size = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;

        }
        else {
            rear.next = newNode;

        }
        rear = newNode;
        size++;
    }
    public void dequeue() {
        if (isEmpty()) {
          throw new NoSuchElementException();
        }
        else {
            front = front.next;
            if (front == null) {
                rear = null;
            }
            size--;
        }
    }
    public int peek() {
        if (isEmpty()) {

            throw new NoSuchElementException();
        }
        else {
            return front.data;
        }

    }
    public static void main(String[] args){
        QueueNode el = new QueueNode();
        el.enqueue(1);
        el.enqueue(2);
        el.enqueue(3);
        System.out.println(el.peek());
        el.dequeue();
        System.out.println(el.peek());
        el.dequeue();
        System.out.println(el.peek());
        el.enqueue(4);
        System.out.println(el.peek());
        el.dequeue();
        el.dequeue();
        el.dequeue();
        System.out.println(el.peek());
    }
}
