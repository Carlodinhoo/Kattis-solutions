#include <iostream>
#include <math.h>
using namespace std;

int main()
{
	double x;
	int matches, weight, height, n;

	cin >> matches >> weight >> height;
	int vector[matches];
	//Se resolvio con raiz cuadrada
	x = sqrt(weight*weight+height*height);
	for(int i = 1; i <= matches; i++){
		cin >> n;
		vector[i] = n;
		
	}

	for(int i = 1; i <= (sizeof(vector)/sizeof(*vector)); i++){
		if(x >= vector[i]){
			cout << "DA" << endl;
		}else{
			cout << "NE" << endl;
		}
		//cout << vector[i];
	}
	
}