#include<stdio.h>
int main()
{
	int m=7;
	float x=2.5,y=4.7;
	printf("%f",(x+m%3*(int)(x+y)%2/4));
	return 0;
}
