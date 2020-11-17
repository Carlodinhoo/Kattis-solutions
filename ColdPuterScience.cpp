#include <iostream>

using namespace std;

int main()
{
	int times;

	cin >> times;

	int degrees = 0;
	while(times > 0){
		int cold;
		cin >> cold;

		if(cold < 0){
			degrees++;
		}
		times--;
	}

	cout << degrees << endl;
}