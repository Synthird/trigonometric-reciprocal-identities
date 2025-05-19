#include "trig_reciprocal.c"
#include <stdio.h>
#include <math.h>

void printHeading();

int main(void) {
	double number = 0;

	printf("Please enter a number: ");
	scanf("%lf", &number);

	printf("csc(%lf) = %lf radians\n", number, csc(number));
	printf("sec(%lf) = %lf radians\n", number, sec(number));
	printf("cot(%lf) = %lf radians\n", number, cot(number));

	printHeading();

	printf("arccsc(%lf) = %lf radians\n", number, acsc(number));
	printf("arcsec(%lf) = %lf radians\n", number, asec(number));
	printf("arccot(%lf) = %lf radians\n", number, acot(number));

	printHeading();

	printf("csch(%lf) = %lf radians\n", number, csch(number));
	printf("sech(%lf) = %lf radians\n", number, sech(number));
	printf("coth(%lf) = %lf radians\n", number, coth(number));

	printHeading();

	printf("arccsch(%lf) = %lf radians\n", number, acsch(number));
	printf("arcsech(%lf) = %lf radians\n", number, asech(number));
	printf("arccoth(%lf) = %lf radians\n", number, acoth(number));
	return 0;
}

void printHeading() {
	printf("-------\n");
}
