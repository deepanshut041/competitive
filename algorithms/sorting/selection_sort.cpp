//  Selection sort array is sorted from one end until complete array is sorted. First maximun number
//  is set to last variable and process continues

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
        for (int j = i + 1; j < length; j++)
        {
            if (array[i] > array[j])
            {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        cout << "Iteration " << i + 1 << ": ";
        print_array(array);
    }
    cout << "Sorted Array: ";
    print_array(array);

    return 0;
}
