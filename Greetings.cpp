#include <iostream>
#include <string>

using namespace std;

int main()
{
	string cadena;

	cin >> cadena;

	string cadena_2 = "";
	for(int i = 1; i < cadena.length()-1; i++){
		cadena_2 += cadena.at(i);
	}

	cadena.insert(1,cadena_2);

	cout << cadena <<endl;

}






