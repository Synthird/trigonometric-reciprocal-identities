/**
 * Trigonometric reciprocal identity methods that return radians.
 * 
 * @module trigReciprocal
 * @author Synthird
 * @license MIT
 * @version 1.2.0
 */

/**
 * The reciprocal of sin.
 * 
 * @param {number} angleInRadians An angle in radians.
 * @returns {number} The cosecant of angleInRadians in radians.
 */
export function csc(angleInRadians) {
	return angleInRadians === 0.0 || isNaN(angleInRadians) ? NaN : 1.0 / Math.sin(angleInRadians);
}

/**
 * The reciprocal of cos.
 * 
 * @param {number} angleInRadians An angle in radians.
 * @returns {number} The secant of angleInRadians in radians.
 */
export function sec(angleInRadians) {
	return 1.0 / Math.cos(angleInRadians);
}

/**
 * The reciprocal of tan.
 * 
 * @param {number} angleInRadians An angle in radians.
 * @returns {number} The cotangent of angleInRadians in radians.
 */
export function cot(angleInRadians) {
	return angleInRadians === 0.0 || isNaN(angleInRadians) ? NaN : 1.0 / Math.tan(angleInRadians);
}

/**
 * The inverse of csc.
 * 
 * @param {number} angleInRadians An angle in radians.
 * @return {number} The arccosecant of angleInRadians in radians.
 */
export function acsc(angleInRadians) {
	return Math.asin(1.0 / angleInRadians);
}

/**
 * The inverse of sec.
 * 
 * @param {number} angleInRadians An angle in radians.
 * @return {number} The arcsecant of angleInRadians.
 */
export function asec(angleInRadians) {
	return Math.acos(1.0 / angleInRadians);
}

/**
 * The inverse of cot.
 * 
 * @param {number} angleInRadians An angle in radians.
 * @return {number} The arccotangent of angleInRadians.
 */
export function acot(angleInRadians) {
	return Math.atan(1.0 / angleInRadians);
}

/**
 * The hyperbolic version of csc.
 * @param {number} angleInRadians An angle in radians.
 * @returns {number} The hyperbolic cosecant of angleInRadians in radians.
 */
export function csch(angleInRadians) {
	return angleInRadians === 0.0 || isNaN(angleInRadians) ? NaN : 1.0 / Math.sinh(angleInRadians);
}

/**
 * The hyperbolic version of sec.
 * @param {number} angleInRadians An angle in radians.
 * @returns {number} The hyperbolic secant of angleInRadians in radians.
 */
export function sech(angleInRadians) {
	return 1.0 / Math.cosh(angleInRadians);
}

/**
 * The hyperbolic version of cot.
 * @param {number} angleInRadians An angle in radians.
 * @returns {number} The hyperbolic cotangent of angleInRadians in radians.
 */
export function coth(angleInRadians) {
	return angleInRadians === 0.0 || isNaN(angleInRadians) ? NaN : 1.0 / Math.tanh(angleInRadians);
}

/**
 * The inverse of csch.
 * @param {number} angleInRadians An angle in radians.
 * @returns {number} The hyperbolic arccosecant of angleInRadians in radians.
 */
export function acsch(angleInRadians) {
	return angleInRadians === 0.0 || isNaN(angleInRadians) ? NaN : Math.log(Math.sqrt((1.0 / Math.pow(angleInRadians, 2)) + 1.0) + (1.0 / angleInRadians));
}

/**
 * The inverse of sech.
 * @param {number} angleInRadians An angle in radians.
 * @returns {number} The hyperbolic arcsecant of angleInRadians in radians.
 */
export function asech(angleInRadians) {
	return angleInRadians <= 0.0 || angleInRadians > 1.0 || isNaN(angleInRadians) ? NaN : Math.log(Math.sqrt((1.0 / angleInRadians) - 1) * Math.sqrt((1.0 / angleInRadians) + 1) + (1.0 / angleInRadians));
}

/**
 * The inverse of coth.
 * @param {number} angleInRadians An angle in radians.
 * @returns {number} The hyperbolic arccotangent of angleInRadians in radians.
 */
export function acoth(angleInRadians) {
	return angleInRadians < -1.0 || angleInRadians > 1.0 || !isNaN(angleInRadians) ? 0.5 * (Math.log(angleInRadians + 1) - Math.log(angleInRadians - 1)) : NaN;
}
