
// implement array using stack

package StackQueue.stack;

public class Stack_Array {
    private int[] stackArray;
    private int top;
    public Stack_Array(int size) {
        stackArray = new int[size];
        top = -1;
    }
    public void push(int value) {
        if (top < stackArray.length - 1) {
           stackArray[++top] = value;
        }
        else {
            throw  new StackOverflowError("Stack Overflow");
//            System.out.println("Stack Overflow");
        }
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception if preferred
        }
        else {
        return stackArray[top--];
        }
    }

    public int top() {
        return top;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        else {
            for(int i=0;i<=top;i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack_Array stack = new Stack_Array(4);
//stack.display();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.display();
        System.out.println(stack.pop());
        stack.display();
        stack.pop();
        stack.display();
    }
}

