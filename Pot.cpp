//Potencias de numeros
#include <iostream>
#include <cmath>
using namespace std;

int main()
{
	int n;
	long x = 0;
	cin >> n;
	while(n--){
		int p;
		cin >> p;
		//Concatena la suma number1+number2+...+numbern
		x += pow(p/10,p%10);
	}

	cout << x << endl;
}