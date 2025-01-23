
//push pop using stack

package StackQueue.stack;

public class Stack_Node {

    private Node top;
    private int size;
    private  class Node {
        private int data;
        private Node next;
    public Node(int data) {
        this.data = data;
    }
    }
public Stack_Node() {
        this.top = null;
        this.size = 0;
}

public int getSize() {
        return size;
}

public boolean isEmpty() {
        return this.size == 0;
}
    public void display(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        else{
         Node temp = top;
         while(temp != null){
             System.out.print(temp.data+"-");
             temp=temp.next;
         }
            System.out.println(" ");
        }
    }

    public void push(int val){
        Node temp= new Node(val);
        temp.next = top;
        top = temp;
        size++;
    }
 public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else {
            Node temp = top;
            top = top.next;
            temp.next = null;
            size--;
            return temp.data;
        }
}
    public static void main(String[] args) {
Stack_Node stack = new Stack_Node();
stack.push(1);
stack.push(2);
stack.push(3);
stack.push(4);
stack.push(5);
        System.out.println(stack.pop());
        stack.display();
    }
}
