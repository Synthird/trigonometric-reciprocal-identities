/**
 * Trigonometric reciprocal identity methods that return radians.
 * 
 * @module trigReciprocal
 * @author Synthird
 * @license MIT
 * @version 1.1.5
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
