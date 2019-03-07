package ds.ll;

public class DoublyLinkedList {
    DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        int count = 0;
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);
        DoublyLinkedListNode currentNode = head;
        while (currentNode != null){
            if(currentNode.data > data){
                node.prev = currentNode.prev;
                node.next = currentNode;
                if(currentNode.prev != null)
                    currentNode.prev.next = node;
                currentNode.prev = node;
                break;
            }

            if(currentNode.next == null){
                node.prev = currentNode;
                currentNode.next = node;
                break;
            }
            count ++;
            currentNode = currentNode.next;

        }
        if(count == 0){
            return node;
        }
        return head;
    }
}

class DoublyLinkedListNode {
    public int data;
    public DoublyLinkedListNode next;
    public DoublyLinkedListNode prev;

    public DoublyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
        this.prev = null;
    }
}
