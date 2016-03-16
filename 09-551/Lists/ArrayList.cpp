#include "ArrayList.h"
#include <iostream>
using namespace std;

void CreateArrayList(ArrayList *&list)
{
    list = new ArrayList;
    list->array = new int[MAX_SIZE];
    list->count = 0;
}
void AddIntoArrayList(ArrayList *&list, int element)
{
    list->array[list->count] = element;
    list->count++;
}
void Show(ArrayList *list)
{
    for (int i = 0; i < list->count; i++)
    {
        cout << list->array[i] << " ";
    }
}