#include <iostream>
using namespace std;

//Bijele
int main()
{
	int chess[6] = {1,1,2,2,2,8};
	int miko[6];
	//int p;
	int k,q,r,b,n,a;
	cin >> k >> q >> r >> b >> n >> a;

	miko[0] = k;
	miko[1] = q;
	miko[2] = r;
	miko[3] = b;
	miko[4] = n;
	miko[5] = a;

	/*for(int i = 0; i < 6; i++){
		cin >> p;
		miko[i] = p;
	}*/

	for(int j = 0; j < 6; j++){
		cout << chess[j] - miko[j] << " ";
	}

}