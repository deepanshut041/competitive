package ds.trees;

import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class HTree {
    /*
        Inorder  Traversal (Left, Root, Right)

        Algorithm Inorder(tree)
           1. Traverse the left subtree, i.e., call Inorder(left-subtree)
           2. Visit the root.
           3. Traverse the right subtree, i.e., call Inorder(right-subtree)
    */
    public static void inOrder(Node root) {
        if(root.left != null)
            inOrder(root.left);
        System.out.print(root.data + " ");
        if(root.right != null)
            inOrder(root.right);
    }

    /*
        PreOrder Traversal (Left, Right, Root)

        Algorithm preOrder(tree)
           1. Visit the root.
           2. Traverse the left subtree, i.e., call preOrder(left-subtree)
           3. Traverse the right subtree, i.e., call PreOrder(right-subtree)
    */
    public static void preOrder(Node root) {
        System.out.print(root.data + " ");
        if(root.left != null)
            preOrder(root.left);
        if(root.right != null)
            preOrder(root.right);
    }

    /*
        PostOrder (Left, Right, Root)

        Algorithm postOrder(tree)
            1. Traverse the left subtree, i.e., call postOrder(left-subtree)
            2. Traverse the right subtree, i.e., call postOrder(right-subtree)
            3. Visit the root.
    */
    public static void postOrder(Node root) {
        if(root.left != null)
            postOrder(root.left);
        if(root.right != null)
            postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        postOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
    }

}