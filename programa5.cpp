#include <iostream>
using namespace std;

int main()
{
	//Declaracion de variables
	string cadena;
	int contador = 0;
	int convert;
	int aux;
	cin >> cadena;
	int entero = cadena.size();
	//Recorremos la cadena para buscar el caracter '?' y sustituirlo
	int arr[entero] = {0};
	for(int i = 0; i < cadena.size(); i++){
		if(cadena[i] == '?'){
			cadena[i] = '1';
		}
		arr[i];

	}
	convert = std::stoi(cadena);

	//Hacemos bubble-sort para ordenar el numero
	for(int i = 0; i < convert-1; i++){
		for(int j = 1; j < convert; j++){
			if(i > j){
				aux = j;
				j = i;
				i = aux;
				contador++;
			}
		}
	}

	return 0;
}