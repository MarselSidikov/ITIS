// БИБЛИОТЕКА ВВОДА ВЫВОДА C++
#include <iostream>
// ПРОСТРАНСТВО ИМЕН ДЛЯ БИБЛИОТЕКИ
using namespace std;

struct RationalNumbers
{
    int a;
    int b;
};

// работа с массивом первым способом
void work_with_array_1(int a[], int n)
{
    // массивы ВСЕГДА передаются по ссылкe
    a[1] = 5;
}
void work_with_array_2(int *a, int n)
{
    // работает так же, как и в первом случае
    a[1] = 5;
}
// возврат массива как результата
// numbers - массив структур, в который вы сохраните ряд
// N - порядок ряда
// n - фактический размер массива - сколько элементов в нем будет лежать
void RunFarey(RationalNumbers numbers[], int N, int &n)
{

}
RationalNumbers* RunFarrey(int N, int &n)
{
    RationalNumbers* numbers = new RationalNumbers[100];

    // заполняете numbers, меняете n
    n = 10;
    return numbers;
}
int main()
{
    // & - взятие адреса от переменной
    int y = 5;

    // указатель - переменная, содержащая адрес другой переменной
    int *u = &y;

    // * - операция взятия содержимого по адресу
    cout << &y << ' ' << u;

    // ДИНАМИЧЕСКИЕ МАССИВЫ
    int n;

    cin >> n;
    // ТАК НЕЛЬЗЯ - b - нединамический массив
    // int b[n];

    // Так можно, а - динамический
    int *a = new int[n];

    // переменная массива - это всегда указатель на первый байт массива

    // РЯД ФАРЕЯ
    int numbersCount;

    RationalNumbers* numbers = RunFarrey(6, numbersCount);

    for (int i = 0; i < numbersCount; i++)
    {
        cout << numbers[i].a << '/' << numbers[i].b << endl;
    }
}