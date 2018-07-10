/*
Sample input 
5 3
1 2 100
2 5 100
3 4 100

Sample Output
200


Explanation

After the first update list will be 100 100 0 0 0. 
After the second update list will be 100 200 100 100 100. 
After the third update list will be 100 200 200 200 100. 
The required answer will be 200.

*/

#include <iostream>
#include <vector>
#include <string>

using namespace std;

class ArrayManipulation
{
  public:
    void main()
    {
        long la, lc;
        cin >> la >> lc;
        vector<long> array;
        array.resize(la);
        for (long i = 0; i < lc; i++)
        {
            long a, b, k;
            cin >> a >> b >> k;
            array[a - 1] += k;
            array[b] -= k;
        }
        long max = array[0];
        long sum = 0;
        for(long i= 0; i < array.size(); i++)
        {
            sum += array[i];
            if(max < sum)
            {
                max = sum;
            }
        }
        cout << max;
    }
};

int main()
{

    ArrayManipulation arrayManipulation;
    arrayManipulation.main();
    return 0;
}