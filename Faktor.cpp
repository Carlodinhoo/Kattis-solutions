#include <iostream>
#include <cmath>

using namespace std;
//Faktor problem
int main()
{
	int articles, factor;
	cin >> articles >> factor;

	int scientist = factor*articles;

	while((double) --scientist/articles > factor - 1){

	}
	cout << ++scientist;
}