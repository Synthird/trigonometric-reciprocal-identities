import java.util.Scanner;

public class Examples {
    private static TrigReciprocal trigReciprocal = new TrigReciprocal();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("--- Which reciprocal trigonometric identity do you wish to do? ---");
        System.out.println("1 = Cosecant");
        System.out.println("2 = Secant");
        System.out.println("3 = Cotangent");
        
        System.out.print("Chosen reciprocal trigonometric identity: ");
        int choice = scanner.nextInt();

        System.out.print("Please choose a number: ");
        double solving = scanner.nextDouble();

        if (choice == 1) {
            double solved = trigReciprocal.cosecant(solving);
            
            System.out.println("csc(" + solving + ") = " + solved);
            System.out.println("Cosecant of " + solving + " is " + solved + " radians");
        } else if (choice == 2) {
            double solved = trigReciprocal.secant(solving);
            
            System.out.println("sec(" + solving + ") = " + solved);
            System.out.println("Secant of " + solving + " is " + solved + " radians");
        } else if (choice == 3) {
            double solved = trigReciprocal.cotangent(solving);

            System.out.println("cot(" + solving + ") = " + solved);
            System.out.println("Cotangent of " + solving + " is " + solved + " radians");
        }

        scanner.close();
    }
}
