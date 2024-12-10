public class TrigReciprocal {
    /**
     * @param numberInRadians
     * @return The cosecant of a number in radians.
     */
    public double csc(double numberInRadians) {
        return numberInRadians == 0.0 ? Double.NaN : 1.0 / Math.sin(numberInRadians);
    }

    /**
     * @param numberInRadians
     * @return The secant of a number in radians.
     */
    public double sec(double numberInRadians) {
        return 1.0 / Math.cos(numberInRadians);
    }

    /**
     * @param numberInRadians
     * @return The cotangent of a number in radians.
     */
    public double cot(double numberInRadians) {
        return numberInRadians == 0.0 ? Double.NaN : 1.0 / Math.tan(numberInRadians);
    }
}
