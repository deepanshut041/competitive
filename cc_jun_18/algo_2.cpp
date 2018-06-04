#include <iostream>
#include <string>
#include <vector>
#include <cmath>

using namespace std;

class Algo1
{

  public:
    int distance(int a, int b, int count)
    {
        if (a == b)
        {
            return count;
        }
        int num = decToBinary(a, a > b, b);
        count++;
        distance(num + 1, b, count);
    }

  public:
    int decToBinary(int n, bool a_g_b, int b)
    {
        cout << n << "\n";
        int sum = 0, two_power = 0, max_count = 0;
        vector<bool> binary_num;
        while (n > 0)
        {
            binary_num.push_back(n % 2 != 0);
            n = n / 2;
        }

        while (b > 0)
        {
            max_count++;
            b = b / 2;
        }

        if (a_g_b == true)
        {
            two_power = 0;
            std::vector<bool>::iterator it;
            for (it = binary_num.begin(); it != binary_num.end(); ++it)
            {
                if (*it == true)
                {
                    sum += pow(2, two_power);
                    two_power++;
                }
            }
        }
        else
        {
            two_power = max_count - 1;
            std::vector<bool>::iterator it;
            for (it = binary_num.begin(); it != binary_num.end(); ++it)
            {
                if (*it == true)
                {
                    sum += pow(2, two_power);
                    two_power--;
                }
            }
        }
        binary_num.clear();
        return sum;
    }

  public:
    void main()
    {
        int test_cases;
        cin >> test_cases;
        for (int i = 0; i < test_cases; i++)
        {
            int a, b;
            cin >> a >> b;
            cout << distance(a, b, 0) << "\n";
        }
    }
};

int main()
{
    Algo1 algo;
    algo.main();
    return 0;
}
