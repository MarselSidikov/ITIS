#include <iostream>
#include "ArrayList.h"
using namespace std;

int main()
{
    ArrayList *list;

    CreateArrayList(list);

    AddIntoArrayList(list, 5);
    AddIntoArrayList(list, 7);
    AddIntoArrayList(list, 9);

    Show(list);
}