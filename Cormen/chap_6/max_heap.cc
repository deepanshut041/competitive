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

//   private:
//     int height(int N)
//     {
//         return ceil(log2(N + 1)) - 1;
//     }

  private:
    void buildMaxHeap(int *A, int heap_size)
    {
        
        for(int i = heap_size / 2; i >= 1; i--)
        {
            /* code */
            maxHeapify(A, i, heap_size);
        }
        
    }

    private: 
        void heapSort(int* A, int heap_size){
            buildMaxHeap(A, heap_size);
            for( int i = heap_size; i > 1; i--){
                int temp = A[0];
                A[0] = A[i - 1];
                A[i - 1] = temp;
                heap_size = heap_size - 1;
                maxHeapify(A, 1, heap_size);
            }
        }

  private:
    void maxHeapify(int *A, int i, int heap_size)
    {
        int l = left(i);
        int r = right(i);
        int largest = 0;

        //   Checking left node
        if (A[l - 1] > A[i - 1] && l <= heap_size)
        {
            largest = l;
        }
        else
        {
            largest = i;
        }
        if (A[r - 1] > A[largest - 1] && r <= heap_size)
        {
            largest = r;
        }
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
        int A[] = {5, 13, 2, 25, 7, 17, 20, 8, 4};
        int heap_size = sizeof(A) / sizeof(A[0]);
        heapSort(A, heap_size);
        for (int i = 0; i < heap_size; i++)
        {
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
