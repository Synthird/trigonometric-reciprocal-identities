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

double acsc(double angleInRadians) {
	return 0.0 == angleInRadians ? NAN : asin(1.0 / angleInRadians);
}

double asec(double angleInRadians) {
	return 0.0 == angleInRadians ? NAN : acos(1.0 / angleInRadians);
}

double acot(double angleInRadians) {
	return atan(1.0 / angleInRadians);
}
