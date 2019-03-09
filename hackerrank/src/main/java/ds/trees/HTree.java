package ds.trees;

import java.util.*;

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
class NodeKey{
    Node node;
    int key;

    public NodeKey(Node node, int key) {
        this.node = node;
        this.key = key;
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
    private static void inOrder(Node root) {
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
    private static void preOrder(Node root) {
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
    private static void postOrder(Node root) {
        if(root.left != null)
            postOrder(root.left);
        if(root.right != null)
            postOrder(root.right);
        System.out.print(root.data + " ");
    }


    // Height of tree
    private static int height(Node root) {
        int l = 0, r = 0;
        if(root.left != null){
            l = 1;
            l += height(root.left);

        }

        if(root.right != null) {
            r = 1;
            r += height(root.right);
        }
        if (l > r)
            return l;
        else
            return r;

    }

    private static void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node node = queue.poll();
            if( node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
            System.out.print(node.data + " ");
        }
    }

    private static void topView(Node root) {
        Queue<NodeKey> mqueue = new LinkedList<>();
        mqueue.add(new NodeKey(root, 0));
        TreeMap<Integer, Queue<Node>> treeMap = new TreeMap<>();
        while (!mqueue.isEmpty()){
            NodeKey node = mqueue.poll();
            if (node.node.left != null){
                mqueue.add(new NodeKey(node.node.left, node.key - 1));
            }
            if (node.node.right != null){
                mqueue.add(new NodeKey(node.node.right, node.key + 1));
            }

            if(!treeMap.containsKey(node.key))
                treeMap.put(node.key, new LinkedList<>());
            treeMap.get(node.key).add(node.node);
        }

        for(Map.Entry<Integer, Queue<Node>> m:treeMap.entrySet()){
            if(m.getValue().peek() != null)
                System.out.print(m.getValue().peek().data + " ");
        }
    }

    private static Node insert(Node root, int data) {
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
        topView(root);
    }

}