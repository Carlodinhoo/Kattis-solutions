#include <iostream>
#include <list>
#include <algorithm>

using namespace std;

int main()
{
	int events;
	cin >> events;

	int number_days = 1;
	list<int> days_array;
	list<int>::iterator it;
	it = days_array.begin();

	while(events > 0){
		int s, t;

		cin >> s >> t;

		for(int i = s; i < t; i++){
			
			list<int>::iterator it_2 = find(days_array.begin(), days_array.end(), i);

			if(it_2 != days_array.end(){
				days_array.insert(it,i);
				number_days++;
			}
		}



		events--;
	}

	/* Recorrer lista c++
	*
	for(it = days_array.begin(); it != days_array.end(); it++){
		cout << *it ;
	}
	*/
	
	

	cout << number_days << endl;
}