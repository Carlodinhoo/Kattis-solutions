#include <iostream>
using namespace std;

int main()
{

	int iteraciones;
	int total = 2;
	cin >> iteraciones;
	while(iteraciones--){
		total += total-1;
	}
	cout << total*total << endl;
}