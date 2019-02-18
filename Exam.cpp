#include <iostream>

using namespace std;

int main(){
	int n;

	cin >> n;

	string myfriend, me;

	cin >> me >> myfriend;
	int dif = 0;
	int same = 0;

	for(int i = 0; i < me.size(); i++){
		if(me[i] == myfriend[i]){
			same++;
		}else{
			dif++;
		}
	}

	int ans = 0;

	if (n > same)
	{
		ans = me.size() - (n - same);
	}else{
		ans = dif + n;
	}

	cout << ans << endl;
}