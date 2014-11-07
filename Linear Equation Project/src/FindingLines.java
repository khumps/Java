/*
 * Linear Equation Solver and Builder
 * By Kevin Humphreys
 */

import java.util.Scanner;

public class FindingLines {

	public static void main(String[] args) {
		double again;
		double x, y, yInt, slope;
		LinearEquation formula = new LinearEquation();
		System.out.println("Linear Equation Solver and Builder");
		System.out.println("Written By Kevin Humphreys");
		boolean go;

		while (go = true) {
			// Start:
			System.out.println();
			System.out.println("Would you like to...");
			System.out.println("1) Solve an Equation");
			System.out.println("2) Build an Equation");
			int question;
			double answer;
			String result = null;
			Scanner input = new Scanner(System.in);
			question = input.nextInt();
			if (question == 1) {
				System.out.println("Would you like to solve for...");
				System.out.println("1) The value of X");
				System.out.println("2) The value of Y");
				System.out.println("3) The Slope");
				System.out.println("4) The Y-Intercept");

				question = input.nextInt();

				if (question == 1) {
					System.out.println("input the value of Y");
					y = input.nextDouble();

					System.out.println("input the Y-Intercept");
					yInt = input.nextDouble();

					System.out.println("input the Slope");
					slope = input.nextDouble();

					answer = formula.getX(y, yInt, slope);

					result = ("the value of X is " + answer);
					// Outputs at the end of the program
				}

				else if (question == 2) {
					System.out.println("input the Slope");
					slope = input.nextDouble();

					System.out.println("input the value of X");
					x = input.nextDouble();

					System.out.println("input the Y-Intercept");
					yInt = input.nextDouble();

					answer = formula.getY(slope, x, yInt);

					result = ("the value of Y is " + answer);
					// Outputs at the end of the program
				} else if (question == 3) {
					double x1, y1, x2, y2;
					System.out
							.println("Would you like to find the slope by...?");
					System.out.println("1) Solving for 2 Points");
					System.out
							.println("2) Solving by Slope-Intercept Equation (y=mx+b)?");
					question = input.nextInt();
					if (question == 1) {
						System.out
								.println("Enter the x value of the first point");
						x1 = input.nextDouble();
						System.out
								.println("Enter the y value of the first point");
						y1 = input.nextDouble();
						System.out
								.println("Enter the x value for the second point");
						x2 = input.nextDouble();
						System.out
								.println("Enter the y value for the second point");
						y2 = input.nextDouble();

						answer = formula.getSlope(x1, y1, x2, y2);

						result = ("The slope of the line is" + answer);
						// Outputs at the end of the program
					}

					else if (question == 2) {
						System.out.println("input the value of Y ");
						y = input.nextDouble();

						System.out.println("input the value of X");
						x = input.nextDouble();

						System.out.println("input the Y-Intercept");
						yInt = input.nextDouble();

						answer = formula.getSlope(y, x, yInt);

						result = ("the Slope of the line is " + answer);
						// Outputs at the end of the program
					}
				}

				else if (question == 4) {
					System.out.println("Enter the value of Y");
					y = input.nextDouble();
					System.out.println("Enter the Slope");
					slope = input.nextDouble();
					System.out.println("Enter the value of X");
					x = input.nextDouble();

					answer = formula.yInt(y, slope, x);

					result = ("the Y-Intercept is " + answer);
					// Outputs at the end of the program
				}
			} else if (question == 2) {
				System.out.println("Enter the Slope");
				slope = input.nextDouble();
				System.out.println("Enter the Y-Intercept");
				yInt = input.nextDouble();

				result = ("The equation of the line is " + "y " + "= " + slope
						+ "x " + "+ " + yInt);
				// Outputs at the end of the program
			}

			else {
				System.out.println("Not a valid answer. Please try again.");
				// Prevents mistyped responses
				continue;
			}

			System.out.println(result);

			System.out
					.println("Would you like to perform another operation? 1(Yes) or 2(No): ");

			@SuppressWarnings("resource")
			Scanner restart = new Scanner(System.in);
			again = restart.nextInt();

			if (again == 1) { // If user selects 1(Yes) program goes back to
								// Start:
				go = true;
			} else {			//Otherwise Breaks
				break;

			}
		}
	}
}

/*
       __________________
      /\  ______________ \
     /::\ \ZZZZZZZZZZZZ/\ \
    /:/\.\ \        /:/\:\ \
   /:/Z/\:\ \      /:/Z/\:\ \
  /:/Z/__\:\ \____/:/Z/  \:\ \
 /:/Z/____\:\ \___\/Z/    \:\ \
 \:\ \ZZZZZ\:\ \ZZ/\ \     \:\ \
  \:\ \     \:\ \ \:\ \     \:\ \
   \:\ \     \:\ \_\;\_\_____\;\ \
    \:\ \     \:\_________________\
     \:\ \    /:/ZZZZZZZZZZZZZZZZZ/
      \:\ \  /:/Z/    \:\ \  /:/Z/
       \:\ \/:/Z/      \:\ \/:/Z/
        \:\/:/Z/________\;\/:/Z/
         \::/Z/_______itz__\/Z/
          \/ZZZZZZZZZZZZZZZZZ/
 */ 
