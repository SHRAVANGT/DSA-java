
//insert node at beginning ,end and given at any position

package linkedList.doubly.i;

public class insertAtList {
    private Node head;
    
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

    public void printList(){
         Node temp  = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void createList(){
        head=new Node(1);
         Node sec  = new Node(2);
         Node third = new Node(3);
         Node fourth = new Node(4);
         Node fifth = new Node(5);
        head.next = sec;
        sec.prev = head;
        sec.next = third;
        third.prev = sec;
        third.next = fourth;
        fourth.prev  = third;
        fourth.next = fifth;
        fifth.prev=  fourth;
    }
    public void insertAtBeginning(int val){
        Node temp  = new Node(val);
        if(head==null){
            System.out.println("list is empty");
        }
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }
    public void insertAtEnd(int val){
        Node newNode  = new Node(val);
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
            while (temp.next!=null){
                temp = temp.next;
            }
       temp.next = newNode;
            newNode.prev = temp;
            newNode.next = null;
    }
    public void insertAtPosition(int pos,int val) {
        Node newNode = new Node(val);
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        int count = 1;
        if (pos == 1) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else {
            while (temp.next!= null && count < pos - 1) {
temp = temp.next;
count++;
            }
           newNode.next = temp.next;
            temp.next = newNode;

        }
    }
    public static  void main(String[] args){
        insertAtList li = new insertAtList();
        li.createList();
        li.printList();
//        li.insertAtBeginning(10);
//        li.printList();
//        li.insertAtEnd(10);
//        li.printList();
        li.insertAtPosition(2,20);
        li.printList();
    }
}
