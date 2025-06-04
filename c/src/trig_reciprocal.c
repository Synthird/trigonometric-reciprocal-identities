/**
 * @brief Trigonometric reciprocal identity methods that return radians.
 * @file trig_reciprocal.c
 * @author Synthird
 * @copyright MIT license
 * @version 1.1.0
 */

#include <math.h>

/**
 * @brief The reciprocal of sin.
 * @param angleInRadians An angle in radians.
 * @return The cosecant of angleInRadians in radians.
 */
double csc(double angleInRadians) {
	return 0 == angleInRadians ? NAN : 1 / sin(angleInRadians);
}

/**
 * @brief The reciprocal of cos.
 * @param angleInRadians An angle in radians.
 * @return The secant of angleInRadians in radians.
 */
double sec(double angleInRadians) {
	return 1 / cos(angleInRadians);
}

/**
 * @brief The reciprocal of tan.
 * @param angleInRadians An angle in radians.
 * @return The cotangent of angleInRadians in radians.
 */
double cot(double angleInRadians) {
	return 0 == angleInRadians ? NAN : 1 / tan(angleInRadians);
}

/**
 * @brief The inverse of csc.
 * @param angleInRadians An angle in radians.
 * @return The arccosecant of angleInRadians in radians.
 */
double acsc(double angleInRadians) {
	return -1 > angleInRadians || 1 < angleInRadians ? asin(1 / angleInRadians) : NAN;
}

/**
 * @brief The inverse of sec.
 * @param angleInRadians An angle in radians.
 * @return The arcsecant of angleInRadians in radians.
 */
double asec(double angleInRadians) {
	return -1 > angleInRadians || 1 < angleInRadians ? acos(1 / angleInRadians) : NAN;
}

/**
 * @brief The inverse of cot.
 * @param angleInRadians An angle in radians.
 * @return The arccotangent of angleInRadians in radians.
 */
double acot(double angleInRadians) {
	return atan(1 / angleInRadians);
}

/**
 * @brief The hyperbolic version of csc.
 * @param angleInRadians An angle in radians.
 * @return The hyperbolic cosecant of angleInRadians in radians.
 */
double csch(double angleInRadians) {
	return 0 == angleInRadians ? NAN : 1 / sinh(angleInRadians);
}

/**
 * @brief The hyperbolic version of sec.
 * @param angleInRadians An angle in radians.
 * @return The hyperbolic secant of angleInRadians in radians.
 */
double sech(double angleInRadians) {
	return 1 / cosh(angleInRadians);
}

/**
 * @brief The hyperbolic version of cot.
 * @param angleInRadians An angle in radians.
 * @return The hyperbolic cotangent of angleInRadians in radians.
 */
double coth(double angleInRadians) {
	return 0 == angleInRadians ? NAN : 1 / tanh(angleInRadians);
}

/**
 * @brief The inverse of csch.
 * @param angleInRadians An angle in radians.
 * @return The hyperbolic arccosecant of angleInRadians in radians.
 */
double acsch(double angleInRadians) {
	return log((1 / angleInRadians) + (sqrt(1 + pow(angleInRadians, 2.0)) / fabs(angleInRadians)));
}

/**
 * @brief The inverse of sech.
 * @param angleInRadians An angle in radians.
 * @return The hyperbolic arcsecant of angleInRadians in radians.
 */
double asech(double angleInRadians) {
	return 1 < angleInRadians || 0 >= angleInRadians ? NAN : log((1 + sqrt(1 - pow(angleInRadians, 2))) / angleInRadians);
}

/**
 * @brief The inverse of coth.
 * @param angleInRadians An angle in radians.
 * @return The hyperbolic arccotangent of angleInRadians in radians.
 */
double acoth(double angleInRadians) {
	return 1 >= angleInRadians || -1 <= angleInRadians ? NAN : 0.5 * log((angleInRadians + 1) / (angleInRadians - 1));
}
