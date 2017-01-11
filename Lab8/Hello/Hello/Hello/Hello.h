#pragma once
#include "JNISample.h"

#ifdef __cplusplus
extern "C" {
#endif
	void sayHello();
	JNIEXPORT void JNICALL Java_JNISample_sayHello
		(JNIEnv *, jobject);
#ifdef __cplusplus
}
#endif

