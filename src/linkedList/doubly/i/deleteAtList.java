
//delete node at beginning ,end and given at any position

package linkedList.doubly.i;

public class deleteAtList {
    private  Node head;

    private class Node{
        private int data;
        private  Node next;
        private  Node prev;

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
        head=new  Node(1);
         Node sec  = new  Node(2);
         Node third = new  Node(3);
         Node fourth = new  Node(4);
         Node fifth = new  Node(5);
         Node sixth = new  Node(6);
         Node seventh = new  Node(7);
         Node eighth = new  Node(8);
        head.next = sec;
        sec.prev = head;
        sec.next = third;
        third.prev = sec;
        third.next = fourth;
        fourth.prev  = third;
        fourth.next = fifth;
        fifth.prev=  fourth;
        fifth.next = sixth;
        sixth.prev = fifth;
        sixth.next = seventh;
        seventh.prev = sixth;
        seventh.next = eighth;
        eighth.prev = seventh;
    }

    public void deleteAtBeginning(){
        head = head.next;
        head.prev = null;
    }
public void deleteAtEnd(){
        Node temp = head;
        Node curr = null;
        while(temp.next!=null){
            curr = temp;
            temp = temp.next;
        }
        curr.next = null;
    temp.prev = null;
}
public void deleteAtPosition(int pos){
        if (pos ==0 || head==null || pos >10){
            throw new IndexOutOfBoundsException("invalid position");
        }
        Node temp = head;
        Node curr = null;
        int count = 0;
        while (count<pos-1){
            curr = temp;
            temp = temp.next;
            count++;
        }
    curr.next = temp.next;
        temp.next=null;

}
    public static  void main(String[] args){
        deleteAtList li = new deleteAtList();
        li.createList();
        li.printList();
        li.deleteAtBeginning();
        li.printList();
        li.deleteAtEnd();
        li.printList();
        li.deleteAtPosition(4);
        li.printList();
    }
}
