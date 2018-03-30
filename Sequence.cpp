#include <iostream>
using namespace std;

int main()
{
	string cadena;
	int contador = 0;
	int convert;
	cin >> cadena;
	for(int i = 0; i <= cadena.size(); i++){
		if(cadena[i] == '?'){
			cadena[i] = '1';
		}

	}

	int n = std::stoi(cadena);
	//int n = 987654321;
	int digito = 0;
	int arr[3];
	int i = 0;
	while(n > 0){
		digito = n%10;
		arr[i] = digito;
		n = n/10;
		i++;
	}
	int aux;
	for(int j = 0; j < (sizeof(arr)/sizeof(*arr)); j++){
		for(int k = 1; k < (sizeof(arr)/sizeof(*arr))-j; k++){
				if(arr[k-1] > arr[k]){
					aux = arr[k-1];
					arr[k-1] = arr[k];
					arr[k] = aux;
					contador++;
				}
		}
	}

	cout << contador;
	/*for(int l = 0; l < (sizeof(arr)/sizeof(*arr)); l++){
		cout << arr[l];
	}*/
	
}