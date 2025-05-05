#include <stdio.h>
#include "trig_reciprocal.c"

int main(void) {
	double number = 0;
	printf("Please enter a number: ");
	scanf("%lf", &number);

	printf("csc(%lf) = %lf radians\n", number, csc(number));
	printf("sec(%lf) = %lf radians\n", number, sec(number));
	printf("cot(%lf) = %lf radians\n", number, cot(number));
	printf("arccsc(%lf) = %lf radians\n", number, acsc(number));
	printf("arcsec(%lf) = %lf radians\n", number, asec(number));
	printf("arccot(%lf) = %lf radians\n", number, acot(number));
	return 0;
}
