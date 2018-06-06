#include <iostream>
#include <string>
#include <vector>
#include <cmath>

using namespace std;

class Algo1
{
  private:
    int count, a, b, c;

    // This function print vector
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

    // This function performs action 1
  private:
    void leading_zeros()
    {
    }

  private:
    vector<bool> lay_digits()
    {
        vector<bool> binary_a;

        return binary_a;
    }

    // This function performs action 2
  private:
    void shuffle()
    {
    }
    // This function perfroms action 3
  private:
    void add_one()
    {
        a += 1;
        count++;
    }

    //  This is recursive function for number of operation calculator
  private:
    int distance()
    {
        if (operations() != -2)
        {
            return count;
        }
        if ((a - b) < 3)
        {
            add_one();
            if (operations() != -2)
            {
                return count;
            }
            add_one();
            if (operations() != -2)
            {
                return count;
            }
        }
        vector<bool> binary_a = lay_digits();
    }

    // This function return distance if their
  private:
    int operations()
    {
        if (a == b)
        {
            return count;
        }
        return -2;
        if (count == 1000)
        {
            return -1;
        }
    }

  public:
    void main()
    {
        int test_cases;
        cin >> test_cases;
        for (int i = 0; i < test_cases; i++)
        {
            count = 0;
            cin >> a >> b;
            c = a;
            cout << distance() << "\n";
        }
    }
};

int main()
{
    Algo1 algo;
    algo.main();
    return 0;
}
