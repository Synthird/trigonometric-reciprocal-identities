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
 * @version 1.0.1
 */

/**
 * @param {number} angleInRadians A number in radians.
 * @returns {number} The cosecant of angleInRadians.
 */
export function csc(angleInRadians) {
	return angleInRadians === 0.0 || isNaN(angleInRadians) ? NaN : 1.0 / Math.sin(angleInRadians);
}

/**
 * @param {number} angleInRadians A number in radians.
 * @returns {number} The secant of angleInRadians.
 */
export function sec(angleInRadians) {
	return 1.0 / Math.cos(angleInRadians);
}

/**
 * @param {number} angleInRadians A number in radians.
 * @returns {number} The cotangent of angleInRadians.
 */
export function cot(angleInRadians) {
	return angleInRadians === 0.0 || isNaN(angleInRadians) ? NaN : 1.0 / Math.tan(angleInRadians);
}
