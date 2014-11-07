import java.util.Scanner;

public class ImprovedCalculator {

	public static void main(String[] args) {
		double again;
		@SuppressWarnings("unused")
		boolean go;

		Math calc = new Math();

		while (go = true) {
			System.out.print("Choose an operation"); // Asks user to choose
			// +,-,*,/

			@SuppressWarnings("resource")
			Scanner operation = new Scanner(System.in); // Reads user input
			String operator = operation.nextLine(); // Reads user input

			if (operator.contains("+")) {

				System.out.print("Enter an  number: ");
				@SuppressWarnings("resource")
				Scanner numbers = new Scanner(System.in);
				double a = numbers.nextDouble();

				System.out.print("Enter another number: ");
				double b = numbers.nextDouble();
				double c = calc.add(a, b);

				System.out.println(a + " + " + b + " is " + c);

			}

			else if (operator.contains("-")) {
				System.out.print("Enter an  number: ");
				@SuppressWarnings("resource")
				Scanner numbers = new Scanner(System.in);
				double a = numbers.nextInt();

				System.out.print("Enter another number: ");
				double b = numbers.nextInt();
				double c = calc.sub(a, b);

				System.out.println(a + " - " + b + " is " + c);

			}

			else if (operator.contains("*")) {
				System.out.print("Enter an  number: ");
				@SuppressWarnings("resource")
				Scanner numbers = new Scanner(System.in);
				double a = numbers.nextInt();

				System.out.print("Enter another number: ");
				double b = numbers.nextInt();
				double c = calc.mult(a, b);

				System.out.println(a + " * " + b + " is " + c);
			}

			else if (operator.contains("/")) {
				System.out.print("Enter an  number: ");
				@SuppressWarnings("resource")
				Scanner numbers = new Scanner(System.in);
				double a = numbers.nextInt();

				System.out.print("Enter another number: ");
				double b = numbers.nextInt();
				if (b != 0) {
					double c = calc.div(a, b);
					double d = calc.divR(a, b);
					if (d == 0) {

						System.out.println(a + " divided by " + b + " is " + c);
					}

					else {
						System.out.println(a + " divided by " + b + " is " + c
								+ " with a remainder of " + d);
					}
				}

				else {
					System.out.println("Can't divide by 0");
				}
			}

			else {
				System.out.println("Not a valid operator");
				continue;
			}
			System.out.println("Would you like to perform another operation? 1(Yes) or 2(No): ");

			@SuppressWarnings("resource")
			Scanner restart = new Scanner(System.in);
			again = restart.nextInt();

			if (again == 1) {
				go = true;
			} else {
				break;
			}
		}
	}
}