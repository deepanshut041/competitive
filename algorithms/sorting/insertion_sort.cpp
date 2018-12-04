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
    for (int i = 1; i < length; i++)
    {
        int temp = array[i];
        
        for (int j = 0; j < i; j++)
        {
            if (array[j] > temp)
            {
                int t = array[j];
                array[j] = temp;
                temp = t;
            }
        }
        array[i] = temp;
        cout << "Iteration " << i << ": ";
        print_array(array);
    }
    cout << "Sorted Array: ";
    print_array(array);

    return 0;
}
