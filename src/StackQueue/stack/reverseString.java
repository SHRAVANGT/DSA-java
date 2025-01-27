
// reverse the string using stack

package StackQueue.stack;

import java.util.Stack;

public class reverseString {

    public String reversestring(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for(char c : chars){
            stack.push(c);
        }
        for(int i=0;i<s.length();i++){
            chars[i] = stack.pop();
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        reverseString re = new reverseString();
        System.out.println(re.reversestring("abc3"));

    }
}
