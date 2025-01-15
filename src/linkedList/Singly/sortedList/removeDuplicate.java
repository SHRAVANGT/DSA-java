
//To remove duplicate elements from sorted linked list


package linkedList.Singly.sortedList;

public class removeDuplicate {
    private static Node head;

    private static class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
public void removeDuplicateIn(){
        if (head == null){
            System.out.println("head is null");
        }
        Node temp = head;
        while(temp.next!= null){
            if (temp.data == temp.next.data) {
            temp.next = temp.next.next;
            }else {
            temp = temp.next;
        }}

}
    public static void main(String[] args) {
        removeDuplicate li = new removeDuplicate();
        head = new Node(1);
        Node sec= new Node(1);
        Node three = new Node(2);
        Node four = new Node(3);
        Node five = new Node(4);
        head.next = sec;
        sec.next = three;
        three.next = four;
        four.next = five;
        li.display();
li.removeDuplicateIn();
li.display();
    }
}
