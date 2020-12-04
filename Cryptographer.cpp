#include <iostream>

using namespace std;

int main()
{
	string cypher;

	cin >> cypher;
	int dias = 0;

	for(int i = 0; i < cypher.length(); i++){
		int modulo = i %3;

		if(modulo == 0 && cypher[i] != 'P'){
			dias++;
		}

		if(modulo == 1 && cypher[i] != 'E'){
			dias++;
		}

		if(modulo == 2 && cypher[i] != 'R'){
			dias++;
		}

	}

	cout << dias << endl;
}