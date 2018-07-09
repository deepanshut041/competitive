// Given an array, , of  integers, print each element in reverse order as a single line of space-separated integers.

// Sample Input
// 4
// 1 4 3 2

// Sample Output
// 2 3 4 1

// By Deepanshu Tyagi on 9th July 14:02

#include <iostream>
#include <string>
#include <vector>

using namespace std;

class ArrayDs{
    public:
    void reverseArray(vector<int> array){
        
        for(int i = array.size() - 1; i >= 0; i--)
        {
            cout << array[i] << " ";
        }
    }

    public:
    void main(){
        int len;
        cin >> len;
        vector<int> array;
        for(int i = 0; i < len; i++)
        {
            int value;
            cin >> value;
            array.push_back(value);
        }
        reverseArray(array);
    }
};

int main()
{
    ArrayDs arrayDs;
    arrayDs.main();
    return 0;
}
