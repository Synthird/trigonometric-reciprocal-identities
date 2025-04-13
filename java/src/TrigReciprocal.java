/**
 * Trigonometric reciprocal identity methods that return radians.
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
 * @version 1.1.1
 */
public class TrigReciprocal {
	/**
	 * The reciprocal of sin.
	 * 
	 * @param angleInRadians An angle in radians.
	 * @return The cosecant of angleInRadians in radians.
	 */
	public static double csc(double angleInRadians) {
		return angleInRadians == 0.0 ? Double.NaN : 1.0 / Math.sin(angleInRadians);
	}

	/**
	 * The reciprocal of cos.
	 * 
	 * @param angleInRadians An angle in radians.
	 * @return The secant of angleInRadians in radians.
	 */
	public static double sec(double angleInRadians) {
		return 1.0 / Math.cos(angleInRadians);
	}

	/**
	 * The reciprocal of tan.
	 * 
	 * @param angleInRadians An angle in radians.
	 * @return The cotangent of angleInRadians in radians.
	 */
	public static double cot(double angleInRadians) {
		return angleInRadians == 0.0 ? Double.NaN : 1.0 / Math.tan(angleInRadians);
	}
}
