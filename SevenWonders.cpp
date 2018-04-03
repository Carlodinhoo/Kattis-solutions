#include <iostream>
#include <math.h>
using namespace std;

int main()
{
	string card;
	cin >> card;
	int t=0, c=0, g=0, bonus=0;
	for(int i = 0; i < card.size(); i++){
		if(card[i] == 'T'){
			t++;
		}
		if(card[i] == 'C'){
			c++;
		}
		if(card[i] == 'G'){
			g++;
		}
	}
	int t1=t, c1=c, g1=g;

	while(t1 > 0 && c1 > 0 && g1 > 0){
		bonus += 7;
		t1--;
		g1--;
		c1--;
	}

	t = pow(t,2);
	g = pow(g,2);
	c = pow(c,2);
	int total = t+g+c+bonus;

	cout << total << endl;
}