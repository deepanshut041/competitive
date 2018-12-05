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

void merge(int* left_array, int* right_array, int* array, int l){
    int li = 0, ri = 0;
    int m = l / 2;

    for(int i = 0; i < l; i++)
    {
        
        if ((left_array[li] < right_array[ri] && li < m  ) || ri == l - m) {
            array[i] = left_array[li];
            li++;
        }
        else {
            array[i] = right_array[ri];
            ri++;
        }
        
    }

    cout << endl << "Left Array: ";
    for(int i = 0; i < m; i++)
    {
        cout << left_array[i] << ", ";
    }
    cout << endl << "Right Array: ";
    for(int i = 0; i < l-m; i++)
    {
        cout << right_array[i] << ", ";
    }
    cout<< endl << "Whole Array: ";
    for(int i = 0; i < l; i++)
    {
        cout << array[i] << ", ";
    }
    cout << endl;
}

void merge_sort(int* array, int l){
    int m = l / 2;
    if (l < 2) {
        return;
    }
    int left_array[m], right_array[l - m]; 
    for(int i = 0; i < m; i++)
    {
        left_array[i] = array[i];
    }
    for(int i = 0; i < l - m; i++)
    {
        right_array[i] = array[i + m];
    }
    merge_sort(left_array, m);
    merge_sort(right_array, l - m);
    merge(left_array, right_array, array, l);
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
    merge_sort(array, length);
    cout << endl << "Sorted Array:   ";
    print_array(array);

    return 0;
}
