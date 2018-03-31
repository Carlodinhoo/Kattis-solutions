#include <iostream>
using namespace std;

int main()
{
	int n;
	int i = 0;

	
	while(i < 10){
		cin >> n;
		if(n == -1)
			break;
		int inicial = 0;
		int distancia = 0;
		int anterior = 0;
		while(n--){
			int speed, hours;
			cin >> speed >> hours;
			inicial = hours - anterior;
			anterior = hours;
			distancia += speed*inicial;
			
		}
		cout << distancia << " miles" << endl;
		i++;
	}
	

	
}