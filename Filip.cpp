#include <iostream>
#include <string>

using namespace std;

int main()
{
	string primer, segundo;

	cin >> primer >> segundo;

	
	
	int longitud_1 = primer.length();
	char s = primer.at(longitud_1-1);
	int primer_digito = s - '0';

	int longitud_2 = segundo.length();
	char g = segundo.at(longitud_2-1);
	int segundo_digito = g - '0';


	string cadena = "";
	if(longitud_1 == longitud_2){
		if(primer_digito > segundo_digito){
			
			for(int i = primer.length()-1; i >= 0; i--){
				cadena += primer.at(i);
			}
		}else{
			for(int i = segundo.length()-1; i >= 0; i--){
				cadena += segundo.at(i);
			}
		}
	}else if(longitud_1 > longitud_2){
		for(int i = primer.length()-1; i >= 0; i--){
			cadena += primer.at(i);
		}
	}else{
		for(int i = segundo.length()-1; i >= 0; i--){
			cadena += segundo.at(i);
		}
	}

	int answer = stoi(cadena);

	cout << answer << endl;
}






