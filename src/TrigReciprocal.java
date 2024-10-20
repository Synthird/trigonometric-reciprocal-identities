public class TrigReciprocal {

    public double csc(double number) {
        return number == 0.0 ? Double.NaN : 1.0 / Math.sin(number);
    }

    public double sec(double number) {
        return 1.0 / Math.cos(number);
    }

    public double cot(double number) {
        return number == 0.0 ? Double.NaN : 1.0 / Math.tan(number);
    }
}
