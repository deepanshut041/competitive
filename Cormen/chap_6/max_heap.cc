#include <iostream>
#include <vector>

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

  public:
    void maxHeapify(int A[], int i)
    {
        int l = left(i);
        int r = right(i);
        int largest = 0;

        //   Checking left node
        if (A[l] > A[i])
        {
            largest = l;
        }
        else if (A[r] > A[i])
        {
            largest = r;
        }
        else
        {
            largest = i;
        }

        if (largest != i)
        {
            int temp = A[i];
            A[i] = A[largest];
            if (largest == l)
            {
                A[left(i)] = temp;
            }
            else
            {
                A[right(i)] = temp;
            }
            maxHeapify(A, largest);
        }
        for(int i = 0; i < sizeof(A)/sizeof(A[0]); i++){
            cout << A[i] << ", ";
        }
        cout << "\n";
    }

  public:
    int main()
    {
        /* code */
        int A[] = {27, 17, 3, 16, 13, 10, 1, 5, 7, 12, 4, 8, 9, 0};
        maxHeapify(A, 3);
        return 0;
    }
};

int main()
{
    MaxHeap maxHeap;
    maxHeap.main();
    return 0;
}
