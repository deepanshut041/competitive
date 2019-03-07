package ds.ll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SinglyLinkedList {

    public SinglyLinkedListNode head;

    SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if(head == null)
            head = node;
        else{
            SinglyLinkedListNode currentNode = head;
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
        return head;

    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        SinglyLinkedList linkedList = new SinglyLinkedList();
        for (int i = 0; i < n; i++) {
            linkedList.insertNodeAtTail(linkedList.head, Integer.parseInt(br.readLine()));
        }

    }
}

class SinglyLinkedListNode{
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}
