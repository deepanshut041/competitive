#include <iostream>
#include <bits/stdc++.h>

using namespace std;

class MaxHeap
{
  private:
    int left(int i)
    {
        return 2 * i;
    }

  private:
    int right(int i)
    {
        return 2 * i + 1;
    }
    private:
    int height(int N)
    {
        return ceil(log2(N + 1)) - 1;
    }
  public:
    void maxHeapify(int* A, int i, int heap_size)
    {
        int l = left(i);
        int r = right(i);
        int largest = 0;

        //   Checking left node
        if (A[l - 1] > A[i - 1] && l <= heap_size)
        {
            largest = l;
        }
        else{
            largest = i;
        }
        if(A[r - 1] > A[largest - 1] && r <= heap_size)
        {
            largest = r;
        }
        cout << l << r << heap_size << largest << " \n";
        if (largest != i)
        {
            int temp = A[i - 1];
            A[i - 1] = A[largest - 1];
            A[largest - 1] = temp;
            maxHeapify(A, largest, heap_size);
        }
    }

  public:
    int main()
    {
        /* code */
        int A[] = {27, 17, 3, 16, 13, 10, 1, 5, 7, 12, 4, 8, 9, 0};
        int heap_size = sizeof(A)/sizeof(A[0]);
        maxHeapify(A, 3, heap_size);
        for(int i = 0; i < sizeof(A)/sizeof(A[0]); i++){
            cout << A[i] << ", ";
        }
        cout << "\n";
        return 0;
    }
};

int main()
{
    MaxHeap maxHeap;
    maxHeap.main();
    return 0;
}
