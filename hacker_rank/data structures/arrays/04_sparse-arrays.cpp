/*
Sample Input
4
aba
baba
aba
xzxb
3
aba
xzxb
ab

Sample output
2
1
0

Explanation 
Here, "aba" occurs twice, in the first and third string.
The string "xzxb" occurs once in the fourth string, and "ab" does not occur at all.
*/
#include <iostream>
#include <string>
#include <vector>

using namespace std;
class SparseArrays
{
  private:
    void compare(string str, vector<string> strings)
    {
        int count = 0;
        // cout << str << " ";
        for(int i=0; i < strings.size(); i++){
            if(str.compare(strings[i]) == 0){
                count ++;
            }
        }
        cout << count <<"\n";
    }

  private:
    void sparse(vector<string> strings, vector<string> queries)
    {
        for (int i = 0; i < queries.size(); i++)
        {
            compare(queries[i], strings);
        }
    }

  public:
    void main()
    {
        int ls, lq;
        cin >> ls;
        cin.ignore();
        vector<string> strings, queries;
        for (int i = 0; i < ls; i++)
        {
            string value;
            getline(cin, value);
            strings.push_back(value);
        }
        cin >> lq;
        cin.ignore();
        for (int i = 0; i < lq; i++)
        {
            string value;
            getline(cin, value);
            queries.push_back(value);
        }
        sparse(strings, queries);
    }
};

int main()
{
    SparseArrays sparseArrays;
    sparseArrays.main();
    return 0;
}