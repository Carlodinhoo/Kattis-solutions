#include <iostream>
using namespace std;

	int factorial(int x){
		if(x == 0){
			x = 1;
		}else{
			x *= factorial(x-1);
		}
		return x;
	}
// Factorial de un numero de forma recursiva
int main()
{
	int n;
	cin >> n;
	cout << factorial(n);
}