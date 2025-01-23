
// binary tree implementation using both recursive and iterative approach
// in-order,pre-order,post-order,level-order,find max in tree

package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class binarytree {

    private Node root;

    private class Node {
        private int data;
        private Node right;
        private Node left;

        public Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }



    public void createBinaryTree() {
        Node first = new Node(1);
        Node sec = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        root = first;
        first.left = sec;
        first.right = third;
        sec.left = fourth;
        sec.right = fifth;
        third.left = sixth;
    }

    //Recursive method
    //start with root and then in left subtree and then in right subtree
    public void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + "-");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root) {

        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + "-");
        inOrder(root.right);

    }

    public void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + "-");
    }

    //iterative method
    // using stack
    public void preOrder2(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.print(node.data + "-");
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }

        }
    }

    public void inOrder2(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            Node node = stack.pop();
            System.out.print(node.data + "-");
            if (node.right != null) {
                current = node.right;
            }
        }

    }

    public void postOrder2(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        Stack<Node> output = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            output.push(node);

            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        while (!output.isEmpty()) {
            Node node = output.pop();
            System.out.print(node.data + "-");
        }
    }

    public void levelOrder(Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node n = q.poll();
            System.out.print(n.data + "-");
            if (n.left != null) q.offer(n.left);
            if (n.right != null) q.offer(n.right);

        }
    }
public int findMax(){
      return   findMax(root);
}
    public int findMax(Node root) {
        if (root == null) return Integer.MIN_VALUE;
        int max = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);
        if (max < left) max = left;
        if (max < right) max = right;

        return max;
    }
    public boolean isValidBST() {
        long min = Integer.MIN_VALUE;
        long max = Integer.MAX_VALUE;
        return isValidBST(root,min,max);
    }
    public boolean isValidBST(Node root, long min, long max) {
        if (root == null) {
            return true;
        }if(min>=root.data|| max<=root.data) {
            return false;
        }
        boolean left = isValidBST(root.left,min,root.data);
        if(left) {
            boolean right = isValidBST(root.right,root.data,max);
            return right;
        }
        return false;
    }
    public static void main(String[] args) {
        binarytree bi = new binarytree();
        bi.createBinaryTree();
        bi.preOrder(bi.root);
        System.out.println();
        bi.preOrder2(bi.root);
        System.out.println(" ");
        bi.inOrder(bi.root);
        System.out.println(" ");
        bi.inOrder2(bi.root);
        System.out.println();
        bi.postOrder(bi.root);
        System.out.println();
        bi.postOrder2(bi.root);
        System.out.println();
        bi.levelOrder(bi.root);
        System.out.println();
        System.out.println(bi.findMax());
        System.out.println(bi.isValidBST());
    }
}
