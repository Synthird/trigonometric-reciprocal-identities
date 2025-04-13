/**
 * Trigonometric reciprocal identity methods that return radians.
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
 * 
 * @module trigReciprocal
 * @author Synthird
 * @version 1.0.0
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
