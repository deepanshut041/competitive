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

int partion(int* array, int s, int e){
    int p = array[e];
    int p_index = s;
    
    for(int i = s; i < e; i++)
    {
        
        if (array[i] <= p) {
            int temp = array[i];
            array[i] = array[p_index];
            array[p_index] = temp;
            p_index++;
        }
        
    }
    int temp = array[p_index];
    array[p_index] = array[e];
    array[e] = temp;
    return p_index;
}

void quick_sort(int* array, int s, int e){
    if (s < e) {
        int index = partion(array, s, e);
        quick_sort(array, s, index - 1);
        quick_sort(array, index + 1, e);
    }
    
}

int main()
{
    int array[length];

    for (int i = 0; i < length; i++)
    {
        array[i] = rand() / 10000000;
    }
    cout << "Unsorted Array: ";
    print_array(array);
    quick_sort(array, 0, length - 1);
    cout << endl << "Sorted Array:   ";
    print_array(array);

    return 0;
}
