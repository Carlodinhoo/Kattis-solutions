#include <iostream>

using namespace std;

int main(){
	int x, y, res;

	cin >> x >> y;

	res = x*4+y*3;

	if(res%2 != 0){
		cout << "impossible" << endl;
	}else{
		cout << "possible" << endl;
	}
}