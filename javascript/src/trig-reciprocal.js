/**
 *
 * @param {number} numberInRadians
 * @returns The cosecant of numberInRadians.
 */
export function csc(numberInRadians) {
	return numberInRadians === 0.0 || isNaN(numberInRadians) ? NaN : 1.0 / Math.sin(numberInRadians);
}

/**
 *
 * @param {number} numberInRadians
 * @returns The secant of numberInRadians.
 */
export function sec(numberInRadians) {
	return 1.0 / Math.cos(numberInRadians);
}

/**
 *
 * @param {number} numberInRadians
 * @returns The cotangent of numberInRadians.
 */
export function cot(numberInRadians) {
	return numberInRadians === 0.0 || isNaN(numberInRadians) ? NaN : 1.0 / Math.tan(numberInRadians);
}
