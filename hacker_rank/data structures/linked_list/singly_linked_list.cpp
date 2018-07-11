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
    void insertAtTop(int value)
    {
        SinglyLinkedListNode *newNode = new SinglyLinkedListNode(value);
        if (!this->head)
        {
            this->head = newNode;
        }
        else
        {
            SinglyLinkedListNode *node = this->head;
            this->head = newNode;
            this->head->next = node;
        }
    }

  public:
    void insertAtPosition(int value, int pos)
    {
        int count = 1;
        SinglyLinkedListNode *newNode = new SinglyLinkedListNode(value);
        if (!this->head)
        {
            if (pos == 0)
            {
                head = newNode;
            }
        }
        else
        {
            SinglyLinkedListNode *node = this->head;
            while (node->next != nullptr)
            {
                if (count == pos)
                {
                    newNode->next = node->next;
                    node->next = newNode;
                    break;
                }
                count++;
                node = node->next;
            }
        }
    }

  public:
    void deletAtPosition(int pos)
    {
        int count = 0;
        if (!this->head)
        {
            SinglyLinkedListNode *node = this->head;
            while (node->next != nullptr)
            {
                if (count == pos - 1)
                {
                    node->next = node->next->next;
                    break;
                }
                count++;
                node = node->next;
            }
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
        cout << "1: to insert a number at bottom \n";
        cout << "2: to insert a number at top \n";
        cout << "3: to insert a number at position as: <position> <value> \n";
        cout << "4: to print list \n";
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
            int t;
            cin >> t;
            list->insertAtTop(t);
            break;
        case 3:
            int n, p;
            cin >> p >> n;
            list->insertAtPosition(n, p);
            break;

        case 4:
            list->printList();
            break;

        default:
            cout << "Wrong Choice\n";
            break;
        }
    }
    return 0;
}
