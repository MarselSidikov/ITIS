#ifndef TREE_BINARYSEARCHTREE_H

#define TREE_BINARYSEARCHTREE_H

struct Node
{
    int data;
    Node *left;
    Node *right;
};

struct BinarySearchTree
{
    Node *root;
};

void Create(BinarySearchTree *&tree);
void Insert(BinarySearchTree *&tree, int element);
void Print(BinarySearchTree *tree);
void InOrderPrint(BinarySearchTree *tree);

#endif