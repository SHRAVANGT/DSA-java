
// to find parentheses are balanced or closed after opened

package StackQueue.stack;

import java.util.Stack;

public class validParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
for (int i = 0; i < s.length(); i++) {
    char c = s.charAt(i);
    if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
    } else{
        if (stack.isEmpty()) {
            return false;
        }else {
        char top = stack.peek();
        if (c == ')' && top == '(' || c == '}' && top == '{' || c == ']' && top == '[') {
            stack.pop();
            } else {
             return false;
            }
        }
    }
}
if (stack.isEmpty()) {
    return true;
}
return false;
    }

    public static void main(String[] args) {
        validParentheses el = new validParentheses();
        String s = "{({})}";
        System.out.println(el.isValid(s));

    }
}
