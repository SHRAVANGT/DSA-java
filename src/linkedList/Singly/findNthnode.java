
//find nth node from the end of singly Linked list

package linkedList.Singly;

public class findNthnode {

    private static Node head;

    private static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public void printList(){
    findNthnode.Node curr = head;
        while(curr!=null){
        System.out.print(curr.data+"->");
        curr = curr.next;
    }
        System.out.println("null");
}

/* method 1 using findLength

public int findLen(){
        Node curr = head;int length=0;
        while(curr!=null){
            length++;
            curr = curr.next;
        }
        return length;
}

public void findNthNode( int n){
        Node temp = head;

    if (head == null){
        System.out.println("list is empty");
    }
    int count = 0;
    int length = findLen();
    while(count<length-n){
        assert temp != null;
        temp = temp.next;
        count++;
    }
    assert temp != null;
    System.out.println(temp.data);
} */

    public void findNthNode(int n){
        if(head==null){
            System.out.println("list is empty");
        }
        if(n<=0){
            throw new IllegalArgumentException("n must be greater than 0");
        }

        Node ref = head;
        Node main=head;
        int count=0;
        while (count<n){
            if(ref==null){
                throw new IllegalArgumentException("n is greater than length of list");
            }
            ref=ref.next;
            count++;
        }
        while(ref!=null){
            ref=ref.next;
            main=main.next;
        }
        System.out.println(main.data);
    }

    public static void main(String[] args){
        findNthnode obj = new findNthnode();
        obj.head = new Node(1);
        Node sec= new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        head.next=sec;
        sec.next=three;
        three.next=four;
        four.next=five;
        five.next=six;
        obj.printList();
//        System.out.println(obj.findLen());
        obj.findNthNode(2);
    }
}
