import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

// This file is an example of using the trigReciprocal class.

public class Example {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		printHeading("Please choose a trigonometric reciprocal identity");
		System.out.println("1 = Cosecant (csc)");
		System.out.println("2 = Secant (sec)");
		System.out.println("3 = Cotangent (cot)");

		double choice = inputDouble("Chosen identity");
		double number = inputDouble("Please enter a number into your chosen identity");

		printHeading("ANSWER");

		if (choice == 1.0) {
			System.out.printf("csc(%s) = %s radians", number, TrigReciprocal.csc(number));
		} else if (choice == 2.0) {
			System.out.printf("sec(%s) = %s radians", number, TrigReciprocal.sec(number));
		} else if (choice == 3.0) {
			System.out.printf("cot(%s) = %s radians", number, TrigReciprocal.cot(number));
		} else {
			System.out.println("Whoops! You didn't choose a trigonometric reciprocal identity....");
		}

		scanner.close();
	}

	private static void printHeading(String title) {
		System.out.println(String.format("--- %s ---", title));
	}

	private static double inputDouble(String message) {
		double inputNumber = 0;

		System.out.print(String.format("%s: ", message));

		try {
			inputNumber = scanner.nextDouble();
			scanner.nextLine();
		} catch (InputMismatchException e) {
			exitWithMessage("Uh oh! You entered something that isn't a number.......");
		} catch (NoSuchElementException e) {
			exitWithMessage("\nYou exited via keyboard!");
		}

		return inputNumber;
	}

	private static void exitWithMessage(String message) {
		System.err.println(message);
		scanner.close();
		System.exit(0);
	}
}
