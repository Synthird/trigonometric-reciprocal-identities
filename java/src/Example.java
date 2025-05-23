import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

// This file is an example of using the trigReciprocal class.

public class Example {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		double number = 0;

		System.out.print("Please enter a number: ");

		try {
			number = scanner.nextDouble();
			scanner.nextLine();
		} catch (InputMismatchException e) {
			exitWithMessage("Uh oh! You entered something that isn't a number.......");
		} catch (NoSuchElementException e) {
			exitWithMessage("\nYou exited via keyboard!");
		}

		System.out.println(String.format("csc(%s) = %s radian(s)", number, TrigReciprocal.csc(number)));
		System.out.println(String.format("sec(%s) = %s radian(s)", number, TrigReciprocal.sec(number)));
		System.out.println(String.format("cot(%s) = %s radian(s)", number, TrigReciprocal.cot(number)));

		printHeading();

		System.out.println(String.format("arccsc(%s) = %s radian(s)", number, TrigReciprocal.acsc(number)));
		System.out.println(String.format("arcsec(%s) = %s radian(s)", number, TrigReciprocal.asec(number)));
		System.out.println(String.format("arccot(%s) = %s radian(s)", number, TrigReciprocal.acot(number)));

		printHeading();

		System.out.println(String.format("csch(%s) = %s radians(s)", number, TrigReciprocal.csch(number)));
		System.out.println(String.format("sech(%s) = %s radians(s)", number, TrigReciprocal.sech(number)));
		System.out.println(String.format("coth(%s) = %s radians(s)", number, TrigReciprocal.coth(number)));

		printHeading();

		System.out.println(String.format("arccsch(%s) = %s radian(s)", number, TrigReciprocal.acsch(number)));
		System.out.println(String.format("arcsech(%s) = %s radian(s)", number, TrigReciprocal.asech(number)));
		System.out.println(String.format("arccoth(%s) = %s radian(s)", number, TrigReciprocal.acoth(number)));

		scanner.close();
	}

	private static void printHeading() {
		System.out.println("-------");
	}

	private static void exitWithMessage(String message) {
		System.err.println(message);
		scanner.close();
		System.exit(0);
	}
}
