#include <math.h>

double csc(double angleInRadians) {
	return 0.0 == angleInRadians ? NAN : 1.0 / sin(angleInRadians);
}

double sec(double angleInRadians) {
	return 1.0 / cos(angleInRadians);
}

double cot(double angleInRadians) {
	return 0.0 == angleInRadians ? NAN : 1.0 / tan(angleInRadians);
}
