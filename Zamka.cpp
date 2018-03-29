#include <iostream>
using namespace std;

int sumaDigito(int n){
	int digito = 0;
	while(n > 0){
		digito += n%10;
		n = n/10;
	}
	return digito;
}

int main()
{
	int l, d, x, n, m;
	cin >> l >> d >> x;
	int suma = sumaDigito(x);


	while(l<=d){
		int var = sumaDigito(l);
		if(var == x){
			cout << l << endl;
			break;
		}
		l++;
	}

	while(d>=l){
		int var = sumaDigito(d);
		if(var == x){
			cout << d << endl;
			break;
		}
		d--;
	}

}