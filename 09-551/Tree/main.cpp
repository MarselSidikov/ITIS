#include "BinarySearchTree.h"

#include <iostream>

using namespace std;

int main()
{
    BinarySearchTree *tree;
    Create(tree);

    int array[] = {8, 10, 14, 1,8, 13, 6, 4, 7, 3};

    for (int i = 0; i < 10; i++)
    {
        Insert(tree, array[i]);
    }

    //InOrderPrint(tree);
    Print(tree);

    return 0;
}