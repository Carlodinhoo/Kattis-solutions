#include <iostream>

using namespace std;

int main()
{
	int set_number;

	cin >> set_number;

	while(set_number > 0){
		int number, days;

		cin >> number >> days;

		int total = days;

		for(int i = 1; i <= days; i++){
			total += i;
		}

		cout << number << " " << total << endl;

		set_number--;
	} 


}