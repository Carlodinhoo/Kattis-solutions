#include <iostream>
using namespace std;

int main()
{	
	int stars;
	cin >> stars;
	double res;

	cout << stars << ":" << endl;

	int i = 2;

	while(i < stars){
		if(stars%(i+i-1)==0 || stars%(i+i-1) == i){
			cout << i << "," << i-1 << endl;
		}

		if(stars%i == 0){
			cout << i << "," << i << endl;
		}
		i++;	
	}
	
	
}