let potentialNaN = 0.0;

/**
 * 
 * @param {number} numberInRadians 
 * @returns The cosecant of numberInRadians.
 */
export function csc(numberInRadians) {
	potentialNaN = parseFloat(numberInRadians);
	return potentialNaN === 0.0 || isNaN(potentialNaN) ? NaN : 1.0 / Math.sin(numberInRadians);
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
	potentialNaN = parseFloat(numberInRadians);
	return potentialNaN === 0.0 || isNaN(potentialNaN) ? NaN : 1.0 / Math.tan(numberInRadians);
}