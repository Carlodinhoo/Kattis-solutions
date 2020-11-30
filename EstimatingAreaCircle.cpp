#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
	double pi = 3.141592654;

	while(true){

		double r;
		double m, c;
		cin >>	r >> m >> c;

		if(r != 0 && m != 0 && c != 0){
			double resa = r*r*pi;
			double resb = 4*c/m*r*r; 

			cout << setprecision(10) << resa  << " " << resb << endl;
		}else{
			break;
		}
	}
}