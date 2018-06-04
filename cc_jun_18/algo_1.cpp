

#include <iostream>
#include <string>

using namespace std;

struct constraint
{
    int N;
    int A;
    int B;
};

class Algo1
{
  private:
    int dice_faces[];

  public:
    void print_name(string s)
    {
        string s2;
        cout << s << "\n";
        getline(cin, s2);
        cout << s2 << "\n";
    }

  public:
    void input()
    {
        int test_cases;
        cin >> test_cases;
        for (int i = 0; i < test_cases; i++)
        {
            cout << i << "\n";
        }
    }
};

int main()
{
    Algo1 algo;
    algo.input();
    return 0;
}
