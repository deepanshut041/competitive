// Inset a node at tail of linked list
#include <iostream>

using namespace std;

// This is a simple node of linked list
class SinglyLinkedListNode
{
  public:
    int data;
    SinglyLinkedListNode *next;

    SinglyLinkedListNode(int node_data)
    {
        this->data = node_data;
        this->next = nullptr;
    }
};

class SinglyLinkedList
{
  public:
    SinglyLinkedListNode *head;

    SinglyLinkedList()
    {
        this->head = nullptr;
    }

  public:
    void insertAtBottom(int value)
    {
        SinglyLinkedListNode *newNode = new SinglyLinkedListNode(value);
        if (!this->head)
        {
            this->head = newNode;
        }
        else
        {
            SinglyLinkedListNode *node = this->head;
            while (node->next != nullptr)
            {
                node = node->next;
            }
            node->next = newNode;
        }
    }

  public:
    void printList()
    {
        if (this->head)
        {
            SinglyLinkedListNode *node = this->head;
            cout << node->data << "\n";
            while (node->next != nullptr)
            {
                node = node->next;
                cout << node->data << "\n";
            }
        }
        else
        {
            cout << "Empty List \n";
        }
    }
};

int main()
{
    SinglyLinkedList *list = new SinglyLinkedList();
    int a = -1;
    cout << "SinglyLinkedList program \n";
    while (a != 0)
    {
        cout << "1: to insert a number \n";
        cout << "2: to print list \n";
        cin >> a;
        switch (a)
        {
        case 0:
            break;
        case 1:
            int b;
            cin >> b;
            list->insertAtBottom(b);
            break;

        case 2:
            list->printList();
            break;

        default:
            cout << "Wrong Choice\n";
            break;
        }
    }
    return 0;
}
