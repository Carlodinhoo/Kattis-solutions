#include <iostream>
#include <iomanip>

using namespace std;

int main(){
	
	int r;
	int c;
	double s;

	cin >> r >> c;
	int d = r*r;
	double res = (r-c)*100/d;
	cout << fixed;
	cout << setprecision(6) << res << endl;

}