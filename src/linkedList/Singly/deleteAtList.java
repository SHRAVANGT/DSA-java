
////deletion at first,last and at given position in a singly-Linked list

package linkedList.Singly;

public class deleteAtList {
    private static ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next=null;
        }
    }
    public void printList(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //to delete at first
    public void deleteAtBeginning(){
        if(head==null){
            System.out.println("empty list");
        }
        ListNode temp=head;
        head=head.next;
        temp.next=null;
    }

    public int lengthFind(){
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }


    //to delete at end
    public void deleteAtEnd(){
        if(head==null){
            System.out.println("empty list");
        }
        ListNode temp=head;
        int count  = 1;
        while(count<lengthFind()-1){
            temp=temp.next;
            count++;
        }

        temp.next=null;
    }


//   method2 - without using lengthFind method

//            if(head == null || head.next==null){
//                System.out.println(head);
//    }
//            ListNode current=head;
//            ListNode prev=null;
//            while(current.next!=null)
//    {
//        prev = current;
//        current = current.next;
//    }
//            prev.next=null;
//

    //to delete at given position
    public void deleteAtPosition(int index){
        if(index==0 || index>lengthFind()){
            throw new IndexOutOfBoundsException("index out of bounds");
        }
        if(head==null){
            System.out.println("empty list");
        }
        if(index==1){head=head.next;
        }else {
        ListNode temp=head;
        int count  = 1;
        while(count<index-1){
            temp=temp.next;
            count++;
        }
        temp.next = temp.next.next; //or Listnode node = temp.next; temp.next = node.next;
        temp.next.next=null;
    }}

    public static void main(String[] args) {
        deleteAtList sl  =new deleteAtList();
        head = new ListNode(12);
        ListNode second = new ListNode(13);
        ListNode third = new ListNode(14);
        ListNode four = new ListNode(15);
        ListNode five = new ListNode(4);
        ListNode last = new ListNode(6);
        head.next =second;
        second.next=third;
        third.next = four;
        four.next=five;
        five.next=last;
        last.next = null;
        sl.printList();
        sl.deleteAtBeginning();
        sl.printList();
        sl.deleteAtEnd();
        sl.printList();
        sl.deleteAtPosition(3);
        sl.printList();
    }
}
