/**
 * Trigonometric reciprocal identity methods.
 * Such as cosecant, secant, and cotangent.
 * <ul>
 * <li><strong>Methods:</strong>
 * <ul>
 * <li>csc: The reciprocal of sin.</li>
 * <li>sec: The reciprocal of cos.</li>
 * <li>cot: The reciprocal of cot.</li>
 * </ul>
 * </li>
 * </ul>
 * 
 * @author Synthird
 * @version 1.0.1
 */
public class TrigReciprocal {
	/**
	 * @param angleInRadians A number in radians.
	 * @return The cosecant of angleInRadians.
	 */
	public double csc(double angleInRadians) {
		return angleInRadians == 0.0 ? Double.NaN : 1.0 / Math.sin(angleInRadians);
	}

	/**
	 * @param angleInRadians A number in radians.
	 * @return The secant of angleInRadians.
	 */
	public double sec(double angleInRadians) {
		return 1.0 / Math.cos(angleInRadians);
	}

	/**
	 * @param angleInRadians A number in radians.
	 * @return The cotangent of angleInRadians.
	 */
	public double cot(double angleInRadians) {
		return angleInRadians == 0.0 ? Double.NaN : 1.0 / Math.tan(angleInRadians);
	}
}
