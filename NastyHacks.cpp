#include <iostream>

using namespace std;

int main()
{
	int n, r, e, c;
	cin >> n;

	while(n--){
		cin >> r >> e >> c;
		if (r+c < e){
			cout << "advertise" << endl;
		}else if (r+c == e){
			cout << "does not matter" << endl;
		}else{
			cout << "do not advertise" << endl;
		}
	}

}