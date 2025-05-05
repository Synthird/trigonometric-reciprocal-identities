#include <stdio.h>
#include "trig_reciprocal.c"

int main(void) {
	double number = 0;
	printf("Please enter a number: ");
	scanf("%lf", &number);

	double cscAnswer = csc(number);
	double secAnswer= sec(number);
	double cotAnswer = cot(number);

	printf("csc(%lf) = %lf radians\n", number, cscAnswer);
	printf("sec(%lf) = %lf radians\n", number, secAnswer);
	printf("cot(%lf) = %lf radians\n", number, cotAnswer);
	return 0;
}
