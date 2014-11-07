import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int again;
		@SuppressWarnings("unused")
		boolean go;

		while (go = true) {
			System.out.print("Choose an operation"); // Asks user to choose
			// +,-,*,/

			@SuppressWarnings("resource")
			Scanner operation = new Scanner(System.in); // Reads user input
			String operator = operation.nextLine(); // Reads user input

			if (operator.contains("+")) {

				System.out.print("Enter an  integer: ");
				@SuppressWarnings("resource")
				Scanner numbers = new Scanner(System.in);
				int a = numbers.nextInt();

				System.out.print("Enter another integer: ");
				int b = numbers.nextInt();
				int c = a + b;

				System.out.println(a + " + " + b + " is " + c);

			}

			else if (operator.contains("-")) {
				System.out.print("Enter an  integer: ");
				@SuppressWarnings("resource")
				Scanner numbers = new Scanner(System.in);
				int a = numbers.nextInt();

				System.out.print("Enter another integer: ");
				int b = numbers.nextInt();
				int c = a - b;

				System.out.println(a + " - " + b + " is " + c);

			}

			else if (operator.contains("*")) {
				System.out.print("Enter an  integer: ");
				@SuppressWarnings("resource")
				Scanner numbers = new Scanner(System.in);
				int a = numbers.nextInt();

				System.out.print("Enter another integer: ");
				int b = numbers.nextInt();
				int c = a * b;

				System.out.println(a + " * " + b + " is " + c);
			}

			else if (operator.contains("/")) {
				System.out.print("Enter an  integer: ");
				@SuppressWarnings("resource")
				Scanner numbers = new Scanner(System.in);
				int a = numbers.nextInt();

				System.out.print("Enter another integer: ");
				int b = numbers.nextInt();
				if(b != 0)
				{
					int c = a / b;
					int d = a % b;

					System.out.println(a + " divided by " + b + " is " + c
							+ " with a remainder of " + d);
				}
				else
				{
					System.out.println("Can't divide by 0");
				}
			}

			else{
				System.out.println("Not a valid operator");
				continue;
			}
			System.out.print("Would you like to perform another operation? 1(Yes) or 2(No): ");

			@SuppressWarnings("resource")
			Scanner restart = new Scanner(System.in);
			again = restart.nextInt();

			if (again == 1) {
				go = true;
			}
			else {
				break;
			}
		}
	}
}