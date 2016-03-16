#include <iostream>

using namespace std;

int fact(int n)
{
    if (n < 2)
    {
        return 1;
    }
    else
    {
        return n * fact(n-1);
    }
}
int main()
{
    int result = fact(5);
    cout << result;
}