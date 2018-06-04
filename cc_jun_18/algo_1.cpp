#include <iostream>
#include <string>
#include <vector>

using namespace std;

class Algo1
{

  public:
    float p_cal(vector<int> faces, int a, int b)
    {
        int ct1 = 0, ct2 = 0;
        std::vector<int>::iterator it;
        for (it = faces.begin(); it != faces.end(); ++it)
        {
            ct1 += (a == *it);
            ct2 += (b == *it);
        }
        return  ((float) ct1 / faces.size()) * ((float) ct2 / faces.size());
    }

  public:
    void main()
    {
        int test_cases;
        cin >> test_cases;
        for (int i = 0; i < test_cases; i++)
        {
            int n, a, b;
            cin >> n >> a >> b;
            vector<int> faces;
            for (int j = 0; j < n; j++)
            {
                int inp;
                cin >> inp;
                faces.push_back(inp);
            }
            cout << p_cal(faces, a, b) << "\n";
        }
    }
};

int main()
{
    Algo1 algo;
    algo.main();
    return 0;
}
