#include <iostream>
using namespace std;

class Calculator
{
public:

    // Method with 2 integer parameters
    int add(int a, int b)
    {
        return a + b;
    }

    // Method with 3 integer parameters
    int add(int a, int b, int c)
    {
        return a + b + c;
    }

    // Method with 2 double parameters
    double add(double a, double b)
    {
        return a + b;
    }
};

int main()
{
    Calculator obj;

    cout << "Sum of 2 integers: " << obj.add(10,20 ) << endl;
    cout << "Sum of 3 integers: " << obj.add(10,20,30 ) << endl;
    cout << "Sum of 2 doubles: " << obj.add(10.5, 20.5) << endl;

    return 0;
}
