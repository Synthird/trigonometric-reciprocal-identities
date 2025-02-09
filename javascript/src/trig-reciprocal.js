/**
 * Trigonometric reciprocal identities.
 * Such as cosecant, secant, and cotangent.
 * <ul>
 * 	<li><strong>Methods:</strong>
 * 		<ul>
 * 			<li>csc: The reciprocal of sin.</li>
 * 			<li>sec: The reciprocal of cos.</li>
 * 			<li>cot: The reciprocal of cot.</li>
 * 		</ul>
 * 	</li>
 * </ul>
 * @module trigReciprocal
 * @author Synthird
 * @version 1.0.0
 */

/**
 * @param {number} numberInRadians
 * @returns {number} The cosecant of numberInRadians.
 */
export function csc(numberInRadians) {
	return numberInRadians === 0.0 || isNaN(numberInRadians) ? NaN : 1.0 / Math.sin(numberInRadians);
}

/**
 * @param {number} numberInRadians
 * @returns {number} The secant of numberInRadians.
 */
export function sec(numberInRadians) {
	return 1.0 / Math.cos(numberInRadians);
}

/**
 * @param {number} numberInRadians
 * @returns {number} The cotangent of numberInRadians.
 */
export function cot(numberInRadians) {
	return numberInRadians === 0.0 || isNaN(numberInRadians) ? NaN : 1.0 / Math.tan(numberInRadians);
}
