//  First maximun number is set to last variable and process continues

#include <iostream>
#include <math.h>

using namespace std;
const int length = 10;

void print_array(int (&arr)[length]){
    for (int a : arr)
    {
        cout << a << ", ";
    }
    cout << endl;
}

int main()
{
    int array[length];

    for (int i = 0; i < length; i++)
    {
        array[i] = rand() % 100;
    }
    cout << "Unsorted Array: ";
    print_array(array);
    for (int i = 0; i < length; i++)
    {
        for (int j = 0; j < length - 1 - i; j++)
        {
            if (array[j] > array[j + 1])
            {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
        cout << "Iteration " << i + 1 << ": ";
        print_array(array);
    }
    cout << "Sorted Array: ";
    print_array(array);

    return 0;
}
