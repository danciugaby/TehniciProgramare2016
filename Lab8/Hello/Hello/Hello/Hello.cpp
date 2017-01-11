#include "Hello.h"
#include  <iostream>

using namespace std;

void sayHello() {
	cout << "Hello World from C++!" << endl;
	return;
}

JNIEXPORT void JNICALL Java_JNISample_sayHello
(JNIEnv *, jobject)
{
	sayHello();
}