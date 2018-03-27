#include <iostream>
using namespace std;

//Hissing problem
int main()
{
	string cadena;
	cin >> cadena;
	int contador = 0;

	for(int i = 0; i < cadena.size()-1; i++){
		if(cadena[i] == 's' && cadena[i+1] == 's'){
			contador = 1;
		}
	}

	if(contador == 1){
		cout << "hiss";
	}else if (contador == 0){
		cout << "no hiss";
	}

	return 0;
}