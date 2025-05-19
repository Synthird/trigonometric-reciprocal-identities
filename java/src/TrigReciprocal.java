/**
 * Trigonometric reciprocal identity methods that return radians.
 * 
 * @author Synthird
 * @version 1.4.0
 */
public final class TrigReciprocal {

	/**
	 * TrigReciprocal class cannot be instantiated.
	 * 
	 * @throws IllegalAccessException
	 */
	public TrigReciprocal() throws IllegalAccessException {
		throw new IllegalAccessException("TrigReciprocal cannot be instantiated!");
	}

	/**
	 * The reciprocal of sin.
	 * 
	 * @param angleInRadians An angle in radians.
	 * @return The cosecant of angleInRadians in radians.
	 */
	public static final double csc(double angleInRadians) {
		return angleInRadians == 0.0 ? Double.NaN : 1.0 / Math.sin(angleInRadians);
	}

	/**
	 * The reciprocal of cos.
	 * 
	 * @param angleInRadians An angle in radians.
	 * @return The secant of angleInRadians in radians.
	 */
	public static final double sec(double angleInRadians) {
		return 1.0 / Math.cos(angleInRadians);
	}

	/**
	 * The reciprocal of tan.
	 * 
	 * @param angleInRadians An angle in radians.
	 * @return The cotangent of angleInRadians in radians.
	 */
	public static final double cot(double angleInRadians) {
		return angleInRadians == 0.0 ? Double.NaN : 1.0 / Math.tan(angleInRadians);
	}

	/**
	 * The inverse of csc.
	 * 
	 * @param angleInRadians An angle in radians.
	 * @return The arccosecant of angleInRadians in radians.
	 */
	public static final double acsc(double angleInRadians) {
		return Math.asin(1.0 / angleInRadians);
	}

	/**
	 * The inverse of sec.
	 * 
	 * @param angleInRadians An angle in radians.
	 * @return The arcsecant of angleInRadians.
	 */
	public static final double asec(double angleInRadians) {
		return Math.acos(1.0 / angleInRadians);
	}

	/**
	 * The inverse of cot.
	 * 
	 * @param angleInRadians An angle in radians.
	 * @return The arccotangent of angleInRadians.
	 */
	public static final double acot(double angleInRadians) {
		return Math.atan(1.0 / angleInRadians);
	}

	/**
	 * The hyperbolic version of csc.
	 * 
	 * @param angleInRadians An angle in radians.
	 * @return The hyperbolic cosecant of angleInRadians in radians.
	 */
	public static final double csch(double angleInRadians) {
		return angleInRadians == 0.0 ? Double.NaN : 1.0 / Math.sinh(angleInRadians);
	}

	/**
	 * The hyperbolic version of sec.
	 * 
	 * @param angleInRadians An angle in radians.
	 * @return The hyperbolic secant of angleInRadians in radians.
	 */
	public static final double sech(double angleInRadians) {
		return 1.0 / Math.cosh(angleInRadians);
	}

	/**
	 * The hyperbolic version of cot.
	 * 
	 * @param angleInRadians An angle in radians.
	 * @return The hyperbolic cotangent of angleInRadians in radians.
	 */
	public static final double coth(double angleInRadians) {
		return angleInRadians == 0.0 ? Double.NaN : 1.0 / Math.tanh(angleInRadians);
	}

	/**
	 * The inverse of csch.
	 * 
	 * @param angleInRadians An angle in radians.
	 * @return The hyperbolic arccosecant of angleInRadians in radians.
	 */
	public static final double acsch(double angleInRadians) {
		return Math.log((1.0 / angleInRadians) + (Math.sqrt(1.0 + Math.pow(angleInRadians, 2)) / Math.abs(angleInRadians)));
		// return angleInRadians == 0.0 ? Double.NaN
		// 		: Math.log(Math.sqrt((1.0 / Math.pow(angleInRadians, 2)) + 1.0) + (1.0 / angleInRadians));
	}

	/**
	 * The inverse of sech.
	 * 
	 * @param angleInRadians An angle in radians.
	 * @return The hyperbolic arcsecant of angleInRadians in radians.
	 */
	public static double asech(double angleInRadians) {
		return Math.log((1.0 + Math.sqrt(1.0 - Math.pow(angleInRadians, 2))) / angleInRadians);
	}

	/**
	 * The inverse of coth.
	 * 
	 * @param angleInRadians An angle in radians.
	 * @return The hyperbolic arccotangent of angleInRadians in radians.
	 */
	public static double acoth(double angleInRadians) {
		return 0.5 * Math.log((angleInRadians + 1.0) / (angleInRadians - 1.0));
	}
}
