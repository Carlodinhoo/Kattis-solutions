#include <iostream>
using namespace std;

int main()
{
	string cadena;
	cin >> cadena;
	int a = 1, b = 0, c = 0;
	int aux;

	for(int i = 0; i <= cadena.size()-1; i++){
		if(cadena[i] == 'A'){
			aux = a;
			a = b;
			b = aux;
		}else if(cadena[i] == 'B'){
			aux = b;
			b = c;
			c = aux;
		}else if(cadena[i] == 'C'){
			aux = c;
			c = a;
			a = aux;
		}
	}
	if(a == 1){
		cout << 1;
	}else if(b == 1){
		cout << 2;
	}else if(c == 1){
		cout << 3;
	}
}