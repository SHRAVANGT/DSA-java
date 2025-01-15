
//Delete the node value from sorted list within order

package linkedList.Singly.sortedList;

public class deleteNode {

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
    public void deleteNodeIn(int val) {

        if(head==null){
            System.out.println("null");
        }
        if(head.data==val){
            head = head.next;
            return;
        }
        Node temp = head;
        Node prev = null;
        while (temp!=null && temp.data <val){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        temp.next = null;
    }
    public static void main(String[] args) {
        deleteNode sl = new deleteNode();
        head = new Node(1);
        Node sec = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
    head.next = sec;
    sec.next = three;
    three.next = four;
    sl.printList();
    sl.deleteNodeIn(1);
    sl.printList();
    }
}
