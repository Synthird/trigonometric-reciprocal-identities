public class TrigReciprocal {
    public double csc(double numberInRadians) {
        return numberInRadians == 0.0 ? Double.NaN : 1.0 / Math.sin(numberInRadians);
    }

    public double sec(double numberInRadians) {
        return 1.0 / Math.cos(numberInRadians);
    }

    public double cot(double numberInRadians) {
        return numberInRadians == 0.0 ? Double.NaN : 1.0 / Math.tan(numberInRadians);
    }
}
