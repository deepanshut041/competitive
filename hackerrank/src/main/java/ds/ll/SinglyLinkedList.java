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

    SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if(llist == null)
            llist = node;
        else {
            node.next = llist;
            llist = node;
        }

        return llist;
    }

    SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);

        if(head == null)
            head = node;
        else{
            SinglyLinkedListNode currentNode = head;
            int count = 0;
            while (currentNode.next != null){
                count++;
                if(count == position){
                    node.next = currentNode.next;
                    currentNode.next = node;
                    break;
                }

                currentNode = currentNode.next;
            }
        }

        return head;
    }

    SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if(position == 0)
            head = head.next;
        else {
            SinglyLinkedListNode currentNode = head;
            int count = 1;
            while (currentNode.next != null){
                if(count == position){
                    currentNode.next = currentNode.next.next;
                    break;
                }
                currentNode = currentNode.next;
                count++;
            }

        }
        return head;
    }

    void reversePrint(SinglyLinkedListNode head) {
        StringBuilder builder = new StringBuilder();
        SinglyLinkedListNode currentNode = head;
        builder.append("\n");
        builder.append(new StringBuilder(currentNode.data + "").reverse().toString());
        while (currentNode.next != null){
            currentNode = currentNode.next;
            builder.append("\n");
            builder.append(new StringBuilder(currentNode.data + "").reverse().toString());
        }
        builder.reverse();
        String str = builder.toString();

        System.out.print(str);
    }

    SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode rhead = null;
        SinglyLinkedListNode currentNode = head;
        while (currentNode.next != null){
            rhead = insertNodeAtHead(rhead, currentNode.data);
            currentNode = currentNode.next;
        }
        rhead = insertNodeAtHead(rhead, currentNode.data);
        return rhead;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        SinglyLinkedList linkedList = new SinglyLinkedList();
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
