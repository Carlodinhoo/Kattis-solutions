#include <iostream>
#include <cmath>

using namespace std;

int main()
{
	int number;
	cin >> number;

	while(number > 0){

		string encoded;
		cin >> encoded;

		int longitud = sqrt(encoded.length());

		char cuadrado[longitud][longitud];
		int apuntador = 0;
		string resultado = "";

		for(int i = 0; i < longitud; i++){
			for(int j = 0; j < longitud; j++){
				cuadrado[i][j] = encoded[apuntador];
				apuntador++;
			}
		}

		for(int i = longitud-1; i >= 0; i--){
			for(int j = 0; j < longitud; j++){
				resultado += cuadrado[j][i];
			}
		}

		cout << resultado << endl;
		number--;
	}

	
	
}