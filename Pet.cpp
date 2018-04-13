#include <iostream>
using namespace std;

int main()
{	
	int suma = 0;
	int grade, aux, mayor;
	int pos = 0;
	//int matriz[5][4];
	for(int i = 0; i < 5; i++){
		for(int j = 0; j < 4; j++){
			cin >> grade;
			//matriz[i][j] = grade;
			suma += grade;
			aux = suma;
		}
		suma = 0;
		if(mayor < aux){
			mayor = aux;
			pos = i+1;
		}
	}

	cout << pos << " " << mayor << endl;
}