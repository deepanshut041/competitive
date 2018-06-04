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
        int num = decToBinary(a, b);
        count++;
        distance(num + 1, b, count);
    }

  public:
    int decToBinary(int a, int b)
    {
        int sum = 0, b_one = 0, b_zero = 0, a_one = 0, a_zero = 0;
        vector<bool> binary_b, binary_new, binary_a;
        while (b > 0 || a > 0)
        {
            if (a % 2 != 0 && a > 0)
            {
                binary_a.push_back(true);
                a_one++;
            }

            else
            {
                binary_a.push_back(false);
                a_zero++;
            }

            if (b % 2 != 0 && b > 0)
            {
                binary_b.push_back(true);
            }
            else
            {
                binary_b.push_back(false);
            }

            a = a / 2;
            b = b / 2;
        }

        std::vector<bool>::iterator it2;
        for (it2 = binary_b.begin(); it2 != binary_b.end(); ++it2)
        {

            if (*it2 == true && a_one > 0)
            {
                binary_new.push_back(true);
                a_one--;
            }
            else if (*it2 == false && a_zero > 0)
            {
                binary_new.push_back(false);
                a_zero--;
            }
            else if (*it2 == true && a_one == 0)
            {
                binary_new.push_back(false);
            }
            else if (*it2 == false && a_zero == 0)
            {
                binary_new.push_back(true);
            }
            else{

            }
        }

        for (int i = 0; i < binary_new.size(); i++)
        {

            if (binary_new[i] == true)
            {
                sum += pow(2, i);
            }
        }
        print_vector(binary_b);
        print_vector(binary_a);
        print_vector(binary_new);
        cout << "\n" << sum << "\n" << "\n";
        cin >> a;
        return sum;
    }

  public:
    void print_vector(vector<bool> binary_b)
    {
        std::vector<bool>::iterator it;
        for (it = binary_b.begin(); it != binary_b.end(); ++it)
        {
            cout << *it;
        }
        cout << "\n";
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
