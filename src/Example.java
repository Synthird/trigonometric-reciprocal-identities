import java.util.Scanner;

// This file is an example of using the trigReciprocal methods.

public class Example {
    private static Scanner scanner = new Scanner(System.in);
    private static TrigReciprocal trigReciprocal = new TrigReciprocal();

    public static void main(String[] args) {
        printHeading("Please choose a trigonometric reciprocal identity");
        System.out.println("1 = Cosecant (csc)");
        System.out.println("2 = Secant (sec)");
        System.out.println("3 = Cotangent (cot)");

        System.out.print("Chosen identity: ");
        int choice = scanner.nextInt();

        System.out.print("Please enter a number into your chosen identity: ");
        double solving = scanner.nextDouble();

        printHeading("ANSWER");

        if (choice == 1) {
            double answer = trigReciprocal.csc(solving);

            System.out.println(String.format("csc(%s) = %s", solving, answer));
            System.out.println(String.format("Cosecant of %s is equal to %s radians", solving, answer));
        } else if (choice == 2) {
            double answer = trigReciprocal.sec(solving);

            System.out.println(String.format("sec(%s) = %s", solving, answer));
            System.out.println(String.format("Secant of %s is equal to %s radians", solving, answer));
        } else if (choice == 3) {
            double answer = trigReciprocal.cot(solving);

            System.out.println(String.format("cot(%s) = %s", solving, answer));
            System.out.println(String.format("Cotangent of %s is equal to %s radians", solving, answer));
        } else {
            System.out.println("Whoops! You didn't choose a trigonometric reciprocal identity....");
            System.out.println("Feel free to try again if you want.");
        }

        scanner.close();
    }

    private static void printHeading(String title) {
        System.out.println(String.format("--- %s ---", title));
    }
}
