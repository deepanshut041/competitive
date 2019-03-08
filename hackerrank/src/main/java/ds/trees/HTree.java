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

    // Inorder (Left, Root, Right)
    //

    /*
        Postorder (Left, Right, Root)

        Algorithm postorder(tree)
            1. Traverse the left subtree, i.e., call Postorder(left-subtree)
            2. Traverse the right subtree, i.e., call Postorder(right-subtree)
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
    }

}