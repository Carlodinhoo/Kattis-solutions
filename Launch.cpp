#include <iostream>

using namespace std;

int main(){
	int days;
	int launch;
	int aux = -1;
	int cont = 0;

	cin >> days;

	while(days--){
		cin >> launch;
		if(launch < aux or aux == -1){
			aux = launch;
			cont++;
		}
	}

	cout << cont << endl;
}