/*
Sample Input

5 4
1 2 3 4 5
Sample Output

5 1 2 3 4

Explanation
When we perform d = 4  left rotations, the array undergoes the following sequence of changes:
 
1 2 3 4 5 --> 2 3 4 5 1 -->  3 4 5 1 2 --> 4 5 1 2 3 -->   5 1 2 3 4

Thus, we print the array's final state as a single line of space-separated values, which is 5 1 2 3 4.
*/

#include <iostream>
#include <vector>

using namespace std;

class LeftRotation{
    private:
    void left_rotate(vector<int> array, int r){
        int a_r = r % array.size();
        
        for(int i = a_r; i < array.size(); i++)
        {
            cout << array[i] << " ";
        }
        for(int i = 0; i < a_r; i++)
        {
            cout << array[i] << " ";
        }
        
    }

    public:
    void main(){
        int l, r;
        cin >> l >> r;
        vector<int> array;
        for(int i = 0; i < l; i++)
        {
            int value;
            cin >> value;
            array.push_back(value);
        }
        left_rotate(array, r);
    }
};

int main(){
    LeftRotation leftRotation;
    leftRotation.main();
    return 0;
}