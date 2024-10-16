public class TrigReciprocal {

    public double cosecant(double number) {
        return number == 0.0 ? Double.NaN : 1.0 / Math.sin(number);
    }

    public double secant(double number) {
        return 1.0 / Math.cos(number);
    }

    public double cotangent(double number) {
        return number == 0.0 ? Double.NaN : 1.0 / Math.tan(number);
    }
}
