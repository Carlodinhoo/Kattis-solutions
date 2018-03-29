#include <iostream>
using namespace std;

int main()
{
	int x;
	int n;
	int megas = 0;

	cin >> x;

	cin >> n;

	while(n--){
		int p;
		cin >> p;
		megas += x - p;
	}

	cout << megas+x;
}