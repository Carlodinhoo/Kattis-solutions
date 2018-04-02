#include <iostream>
using namespace std;

int main()
{
	int hora, min;

	cin >> hora >> min;

	min = min - 45;
	if(min < 0){
		hora--;
		min = 60 + min;
		if(hora < 0){
			hora = 23;
		}
	}

	cout << hora << " " <<min << endl;
}