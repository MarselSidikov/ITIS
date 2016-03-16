#ifndef LISTS_ARRAYLIST_H
#define LISTS_ARRAYLIST_H

const int MAX_SIZE = 100;

struct ArrayList
{
    int *array;
    int count;
};

void CreateArrayList(ArrayList *&list);
void AddIntoArrayList(ArrayList *&list, int element);
void Show(ArrayList *list);
#endif
