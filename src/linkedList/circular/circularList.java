
//implementation of circular list with insertion,deletion

package linkedList.circular;

public class circularList {

    private Node last;
   private int size;
    private class Node {
        private int data;
        private Node next;
    public Node(int data){
        this.data = data;

    }
    }
    public  circularList(){
       last = null;
        size = 0;
    }
    public int getSize(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    public void insertAtEnd(int val) {
        Node temp = new Node(val);
        if (isEmpty())
        {
            last = temp;
    }
        else {
            temp.next = last.next;

        }
        last.next = temp;
        last = temp;
        size++;
    }
    public void insertAtFront(int val){
        Node temp = new Node(val);
        if(isEmpty()){
            last = temp;
        }
        else{
            temp.next = last.next;
        }
        last.next = temp;
        size++;
    }
    public void display(){
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node current = last.next;
       while (current != last) {
           System.out.print(current.data + "->");
           current = current.next;
       }
       System.out.println(current.data);
    }
    public int deleteAtFront(){
        if(isEmpty()){
            System.out.println("List is empty");
            return 0;
        }
        Node current = last.next;
        if (last.next == last) {
            last=null;
        }
    else {
            last.next = current.next;
        }        current.next = null;
        size--;
        return current.data;
    }
    public static void main(String[] args) {
        circularList list = new circularList();
        list.insertAtEnd(1);
//        list.display();
        list.insertAtEnd(2);
//        list.display();
        list.insertAtEnd(3);
        list.insertAtEnd(7);
        list.insertAtFront(10);
        System.out.println(list.deleteAtFront());
        list.display();

        System.out.println(list.getSize());
    }
}
