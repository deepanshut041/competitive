/* 
    You are in an infinite 2D grid where you can move in any of the 8 directions :
    (x,y) to 
    (x+1, y), 
    (x - 1, y), 
    (x, y+1), 
    (x, y-1), 
    (x-1, y-1), 
    (x+1,y+1), 
    (x-1,y+1), 
    (x+1,y-1) 

    You are given a sequence of points and the order in which you need to cover the points. Give the minimum number of steps in which you can achieve it. You start from the first point.

    Input : [(0, 0), (1, 1), (1, 2)]
    Output : 2

*/

#include <bits/stdc++.h>
using namespace std;


void solution(vector<int> &A, vector<int> &B){
    int total_steps = 0;
    for(int i = 1; i < A.size(); i++){
        total_steps += max(abs(A[i] - A[i - 1]), abs(B[i] - B[i - 1]));
    }
    cout << total_steps << endl;
}
int main()
{
    vector<int> A({4, 8, -7, -5, -13, 9, -7, 8}), B({4, -15, -10, -3, -13, 12, 8, -8});

    solution(A, B);

    return 0;
}
