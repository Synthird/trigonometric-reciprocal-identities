import java.util.Scanner;

public class Example {
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

            System.out.println(String.format("csc(%s) = %s", solving, solved));
            System.out.println(String.format("Cosecant of %s is %s", solving, solved));
        } else if (choice == 2) {
            double solved = trigReciprocal.secant(solving);
            
            System.out.println(String.format("sec(%s) = %s", solving, solved));
            System.out.println(String.format("Secant of %s is %s", solving, solved));
        } else if (choice == 3) {
            double solved = trigReciprocal.cotangent(solving);

            System.out.println(String.format("cot(%s) = %s", solving, solved));
            System.out.println(String.format("Cotangent of %s is %s", solving, solved));
        }

        scanner.close();
    }
}
