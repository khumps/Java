/*
 * Prints a table of the areas of rectangles given a min and max length and width
 * using the methods in the LoopExamples class
 */
import java.util.Scanner;

public class AreaTest
{

	public static void main(String[] args)
	{
		double minLength;
		double maxLength;
		double minWidth;
		double maxWidth;
		boolean isDouble;
		boolean again = true;
		Scanner input = new Scanner(System.in);
		while (again)
		{
			do
			{
				System.out.println("Enter the minimum length of the rectangle: ");
				isDouble = input.hasNextDouble();

				if (isDouble)
				{
					minLength = input.nextDouble();
					if (minLength > 0)
					{
						break;

					}
					else
					{
						System.out.println("Not a valid length.");

					}

				}
				else
				{
					input.next(); // Clears input
					System.out.println("Not a valid length.");
				}
			}
			while (true);
			do
			{
				System.out.println("Enter the maximum length of the rectangle: ");
				isDouble = input.hasNextDouble();

				if (isDouble)
				{
					maxLength = input.nextDouble();
					if (maxLength > 0)
					{
						break;

					}
					else
					{
						System.out.println("Not a valid length.");

					}

				}
				else
				{
					input.next(); // Clears input
					System.out.println("Not a valid length.");
				}
			}
			while (true);
			do
			{
				System.out.println("Enter the minimum width of the rectangle: ");
				isDouble = input.hasNextDouble();

				if (isDouble)
				{
					minWidth = input.nextDouble();
					if (minWidth > 0)
					{
						break;

					}
					else
					{
						System.out.println("Enter the maximum width of the rectangle: ");

					}

				}
				else
				{
					input.next(); // Clears input
					System.out.println("Not a valid length.");
				}
			}
			while (true);
			do
			{
				System.out.println("Enter the maximum width of the rectangle: ");
				isDouble = input.hasNextDouble();

				if (isDouble)
				{
					maxWidth = input.nextDouble();
					if (maxWidth > 0)
					{
						break;

					}
					else
					{
						System.out.println("Not a valid length.");

					}

				}
				else
				{
					input.next(); // Clears input
					System.out.println("Not a valid length.");
				}
			}
			while (true);

			LoopExamples.printArea(minWidth, maxWidth, minLength, maxLength);

			do
			{

				System.out
						.println("Would you like to calculate the area of more rectangles? 1(Yes) or 2(No) ");

				if (input.hasNextInt())
				{
					int answer = input.nextInt();

					if (answer == 1)
					{
						again = true;
						break;

					}
					else if (answer == 2)
					{
						again = false;
						break;
					}
					else
						System.out.println("Not a valid Answer");
				}
				else
				{
					input.next();
					System.out.println("Not a valid answer.");
				}
			}
			while (true);
		}
		input.close();
	}
}
