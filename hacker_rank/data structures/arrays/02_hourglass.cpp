"""
We define an hourglass  to be a subset of values with indices falling in this pattern in 's graphical representation:

Sample Input
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0


Explanation -> contains the following hourglasses:
1 1 1   1 1 0   1 0 0   0 0 0
  1       0       0       0
1 1 1   1 1 0   1 0 0   0 0 0

0 1 0   1 0 0   0 0 0   0 0 0
  1       1       0       0
0 0 2   0 2 4   2 4 4   4 4 0

1 1 1   1 1 0   1 0 0   0 0 0
  0       2       4       4
0 0 0   0 0 2   0 2 0   2 0 0

0 0 2   0 2 4   2 4 4   4 4 0
  0       0       2       0
0 0 1   0 1 2   1 2 4   2 4 0

Sample Output
19
"""
#include <iostream>
#include <vector>
#include <string>


class HourGlass{
    private:
    int hourglassSum(vector<vector<int>> array){
        int max_sum = array[0][0] + array[0][1] + array[0][2] + array[1][1] + array[2][0] + array[2][1] + array[2][2];
        
        for(int i = 0; i < array.size()-2; i ++)
        {
            for(int j = 0; j < array.size()-2; j ++){
                int sum = array[i][j] + array[i][j+1]+ array[i][j+1];
                sum += array[i+2][j] + array[i+2][j+1]+ array[i+2][j+1];
                sum += array[i+1][j+1];
                
                if (max_sum < sum) {
                    max_sum = sum;
                }
                
            }
        }
        return max_sum;
    }

    public:
    void main(int l)
    {
        vector<vector<int>> array;
        for(int i = 0; i < l; i++)
        {
            vector<int> temp;
            temp.resize(6);
            for(int i = 0; i < l; i++)
            {
                cin >> temp[i];
            }
            arrar.push_back(temp);
        }

        cout << hourglassSum(temp);
    }
    
}


