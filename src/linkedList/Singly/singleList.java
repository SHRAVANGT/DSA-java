

// create ,print and search in linked list

package linkedList.Singly;

public class singleList {

    private static ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //to print the list
    public  void printList() {
    ListNode curr = head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
    System.out.println("null");
    }

//length of list
    public void listLength(){
        if(head==null){
            System.out.println("list is empty");}
        ListNode curr = head;
        int length = 0;
        while (curr!=null){
            length++;
            curr = curr.next;
        }
        System.out.println("length of list is "+length);
    }

    //search through list
    public void searchInList(int val){
        if(head==null){
            System.out.println("list is empty");
        }
        ListNode temp = head;
        while(temp!=null){
            if(temp.data==val){
                System.out.println("exists");
                return;
            }
            temp=temp.next;

            }
        System.out.println("not exists");
        }


    public static void main(String[] args) {
        singleList list = new singleList();
        head = new ListNode(10);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        //to link
        head.next = second; //10->2
        second.next = third; // 10->2->3
        third.next = null; // .... ->null
        list.printList();
        list.listLength();
        list.printList();
        list.searchInList(9);
    }
}