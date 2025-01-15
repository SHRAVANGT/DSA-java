
//insertion at first,last and at given position in a singly-Linked list


package linkedList.Singly;

public class insertAtList {

private static ListNode head;

private static class ListNode{

    private int data;
    private ListNode next;


    public ListNode(int data){
        this.data=data;
        this.next=null;
    }
}
public void print(){
    if(head==null){
        System.out.println("empty list");
    }
    ListNode temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");
}

    //insert at beginning of list
    public void insertAtBegin(int val){
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }

    //insert at end
    public void insertAtEnd(int val){
    ListNode newNode = new ListNode(val);
    if(head==null){
        head=newNode;
        return;
    }
    ListNode temp = head;
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=newNode;
    }
public int lengthFind(){
    ListNode temp=head;
    int length=0;
    while(temp!=null){
        temp=temp.next;
        length++;
    }
    return length;
}
//insert at a given position or index
    public void insertAtPosition(int index, int val) {
    if(index <1 || index > lengthFind()){
        throw new IndexOutOfBoundsException("index out of bounds");
    }
    ListNode newNode = new ListNode(val);
        if (index == 1) {
            insertAtBegin(val);
        } else {
            ListNode temp = head;
            int count = 1;
            while(count < index-1){
                    temp=temp.next;
                    count++;
                }
                newNode.next=temp.next;
                temp.next=newNode;

            }
        }



    public static void main(String[] args) {
        insertAtList li = new insertAtList();
        li.insertAtBegin(10);
        li.insertAtBegin(15);
        li.insertAtBegin(25);
        li.insertAtEnd(1);
        li.insertAtPosition(1,4);
        li.print();
    }
}
