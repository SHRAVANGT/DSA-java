
// implementation of binary search tree using linkedList using recursive approach
// search and validation function

package BinaryTree;


public class binarySearchTree {
    private Node root;

    private class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public binarySearchTree() {
        this.root = null;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    public Node insert(Node root, int data) {
        Node node = new Node(data);
        if (root == null) {
            root = node;
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public boolean search(int data) {
         return search(root,data);
    }
    public boolean search(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (data == root.data) {
            return true;
        }
        if (data < root.data) {
            return search(root.left, data);
        }
        else {
            return search(root.right, data);
        }
    }
public boolean isValidBST() {
    long min = Integer.MIN_VALUE;
    long max = Integer.MAX_VALUE;
        return isValidBST(root,min,max);
}
    public boolean isValidBST(Node root,long min,long max) {
      if (root == null) {
          return true;
      }

      if(min>=root.data || max<=root.data) {
return false;
      }
      boolean left = isValidBST(root.left,min,root.data);
      if(left) {
          boolean right = isValidBST(root.right,root.data,max);
          return right;
      }
      return false;
    }


public void inOrder() {
        inOrder(root);
}
    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + "-");
        inOrder(root.right);
    }



    public static void main(String[] args) {
        binarySearchTree bst = new binarySearchTree();
        bst.insert(4);
        bst.insert(2);
        bst.insert(3);
        bst.insert(1);
        bst.insert(5);
        bst.insert(6);
        System.out.println();
        bst.inOrder();
        System.out.println(bst.search(1));
        System.out.println(bst.isValidBST());
    }
}
