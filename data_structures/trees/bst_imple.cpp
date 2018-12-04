// Given a binary tree, first print all leaf nodes, and after that remove all the leaf nodes from tree and print all

#include <bits/stdc++.h>

using namespace std;


struct Node
{
    /* data */
    Node* left_node = NULL;
    Node* right_node = NULL;
    int value = 0; 
};

Node* head_node = NULL;

void recursive_insert(Node* c_node, int value){
    
    if (c_node->value >= value) {
        if (c_node->left_node == nullptr) {
            Node* new_node = new Node;
            new_node->value = value;
            c_node->left_node = new_node;
        }
        else
        {
            recursive_insert(c_node->left_node, value);
        }
    } else{
        if (c_node->right_node == nullptr) {
            Node* new_node = new Node;
            new_node->value = value;
            c_node->right_node = new_node;
        }
        else
        {
            recursive_insert(c_node->right_node, value);
        }
    }
}

void level_order_traversal(){
    if(head_node == NULL){
        cout << "Tree is Empty" << endl;
        return;
    }
    queue<Node*> Q;
    Q.push(head_node);
    
    while(!Q.empty()){
        Node* current_node = Q.front();
        cout << current_node->value << ", ";
        
        if (current_node->left_node != NULL) {
            Q.push(current_node->left_node);
        }
        if (current_node->right_node != NULL) {
            Q.push(current_node->right_node);
        }
        Q.pop();
    }
    
}

void pre_order_traversal(Node* root){
    // root -> left -> right
    if(root == NULL){
        return;
    }else{
        cout << root->value <<", ";
        pre_order_traversal(root->left_node);
        pre_order_traversal(root->right_node);
    }

}

void post_order_traversal(Node* root){
    // left -> right -> root
    if(root == NULL){
        return;
    }else{
        post_order_traversal(root->left_node);
        post_order_traversal(root->right_node);
        cout << root->value <<", ";
    }
}

void in_order_traversal(Node* root){
    // left -> root -> right
    if(root == NULL){
        return;
    }else{
        in_order_traversal(root->left_node);
        cout << root->value <<", ";
        in_order_traversal(root->right_node);
    }
}

void insert_value(int value){
    if (head_node == NULL) {
        /* code */
        head_node = new Node;
        head_node->value = value;
    }
    else{
        recursive_insert(head_node, value);
    }    
}

int main()
{
    for(int i = 0; i < 6; i++)
    {
        int value;
        cin >> value;
        insert_value(value);
    }
    cout << "Level Order: ";
    level_order_traversal();
    cout << endl << "Pre Order: ";
    pre_order_traversal(head_node);
    cout << endl << "Post Order: ";
    post_order_traversal(head_node);
    cout << endl << "In Order: ";
    in_order_traversal(head_node);
    cout << endl;
    return 0;
}
