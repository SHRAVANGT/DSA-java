
// to find next maximum element in array and replace it with in new array


package StackQueue.stack;

import java.util.Stack;

public class nextGreaterElement {

    public int[] NextGreaterElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--) {
            if(!stack.isEmpty()){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
               stack.pop();
            }
        }
            if(stack.isEmpty()){
            res[i] = -1;}
            else {
                res[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return res;
    }

    public void display(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        nextGreaterElement el=new nextGreaterElement();
    int[] arr = {4,7,3,4,8,1};
    el.display(arr);
        el.display(el.NextGreaterElement(arr));
    }
}
