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
 * @version 1.0.0
 */
public class TrigReciprocal {
	/**
	 * @param numberInRadians
	 * @return The cosecant of numberInRadians.
	 */
	public double csc(double numberInRadians) {
		return numberInRadians == 0.0 ? Double.NaN : 1.0 / Math.sin(numberInRadians);
	}

	/**
	 * @param numberInRadians
	 * @return The secant of numberInRadians.
	 */
	public double sec(double numberInRadians) {
		return 1.0 / Math.cos(numberInRadians);
	}

	/**
	 * @param numberInRadians
	 * @return The cotangent of numberInRadians.
	 */
	public double cot(double numberInRadians) {
		return numberInRadians == 0.0 ? Double.NaN : 1.0 / Math.tan(numberInRadians);
	}
}
