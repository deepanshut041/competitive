package ds.ll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SinglyLinkedList {

    public SinglyLinkedListNode head;

    public SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
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

    public SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if(llist == null)
            llist = node;
        else {
            node.next = llist;
            llist = node;
        }

        return llist;
    }

    public SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
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

    public SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        SinglyLinkedListNode currentNode = head;
        while (currentNode.next != null){
            if(currentNode.data == currentNode.next.data){
                if(currentNode.next.next == null){
                    currentNode.next = null;
                    break;
                }
                currentNode.next = currentNode.next.next;
            }else{
                currentNode = currentNode.next;
            }
        }
        return head;
    }

    public boolean hasCycle(SinglyLinkedListNode head) {
        int count = 0;
        Set<SinglyLinkedListNode> nodeSet = new HashSet<>();
        SinglyLinkedListNode currentNode = head;
        while (currentNode.next != null){
            nodeSet.add(currentNode);
            count ++;
            if(count != nodeSet.size()){
                return true;
            }
            currentNode = currentNode.next;
        }
        nodeSet.add(currentNode);
        return false;
    }

    public boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode currentNode1 = head1;
        SinglyLinkedListNode currentNode2 = head2;
        while (currentNode1.next != null || currentNode2.next != null){
            if(currentNode1.data != currentNode2.data){
                return false;
            }
            currentNode1 = currentNode1.next;
            currentNode2 = currentNode2.next;
            if(currentNode1 == null ^ currentNode2 == null){
                return false;
            }
        }
        return true;
    }

    public SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode head3 = null;
        SinglyLinkedListNode currentNode1 = head1;
        SinglyLinkedListNode currentNode2 = head2;
        while (currentNode1 != null && currentNode2 != null){
            if(currentNode1.data < currentNode2.data){
                head3 = insertNodeAtTail(head3, currentNode1.data);
                currentNode1 = currentNode1.next;
            } else{
                head3 = insertNodeAtTail(head3, currentNode2.data);
                currentNode2 = currentNode2.next;
            }
        }

        while(currentNode1 != null){
            head3 = insertNodeAtTail(head3, currentNode1.data);
            currentNode1 = currentNode1.next;
        }
        while (currentNode2 != null){
            head3 = insertNodeAtTail(head3, currentNode2.data);
            currentNode2 = currentNode2.next;
        }

        return head3;

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
