#include <math.h>

/// @brief The reciprocal of sin.
/// @param angleInRadians An angle in radians.
/// @return The cosecant of angleInRadians in radians.
double csc(double angleInRadians) {
	return 0.0 == angleInRadians ? NAN : 1.0 / sin(angleInRadians);
}

/// @brief The reciprocal of cos.
/// @param angleInRadians An angle in radians.
/// @return The secant of angleInRadians in radians.
double sec(double angleInRadians) {
	return 1.0 / cos(angleInRadians);
}

/// @brief The reciprocal of tan.
/// @param angleInRadians An angle in radians.
/// @return The cotangent of angleInRadians in radians.
double cot(double angleInRadians) {
	return 0.0 == angleInRadians ? NAN : 1.0 / tan(angleInRadians);
}

/// @brief The inverse of csc.
/// @param angleInRadians An angle in radians.
/// @return The arccosecant of angleInRadians in radians.
double acsc(double angleInRadians) {
	return 0.0 == angleInRadians ? NAN : asin(1.0 / angleInRadians);
}

/// @brief The inverse of sec.
/// @param angleInRadians An angle in radians.
/// @return The arcsecant of angleInRadians in radians.
double asec(double angleInRadians) {
	return 0.0 == angleInRadians ? NAN : acos(1.0 / angleInRadians);
}

/// @brief The inverse of cot.
/// @param angleInRadians An angle in radians.
/// @return The arccotangent of angleInRadians in radians.
double acot(double angleInRadians) {
	return atan(1.0 / angleInRadians);
}
