/*
 * prints a table of the areas of shapes with 3-10 sides given either a radius or side length
 * using the methods in the Polygon class
 */
import java.util.Scanner;

public class PolygonTest
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double radius;
		double sides = 3;
		double sideLength;
		double method;
		boolean again = true;
		boolean isDouble;
		while (again)
		{
			do
			{
				System.out
						.println("Would you like to calculate the area with a radius(1) or a Side Length(2)? ");
				if (input.hasNextInt())
				{
					method = input.nextInt();
					// Runs program in debug mode
					if (method == 91 || method == 92)
					{
						Polygon.setDebug(true);
						break;
					}
					// Runs program normally
					else if (method == 1 || method == 2)
						break;

					else
					{
						System.out.println("Not a valid answer please try again.");
					}
				}
				else
				{
					input.next(); // Clears input
					System.out.println("Not a valid answer please try again.");
				}
			}
			while (true);
			// Uses radius
			if (method == 1)
			{
				do
				{
					System.out.println("Enter the length of the Radius of your shape: ");
					isDouble = input.hasNextDouble();

					if (isDouble)
					{
						radius = input.nextDouble();
						if (radius > 0)
						{
							break;

						}
						else
						{
							System.out.println("Not a valid radius length.");

						}

					}
					else
					{
						input.next(); // Clears input
						System.out.println("Not a valid radius length.");
					}
				}
				while (true);

				System.out.printf("%-10s %-20s %-20s %n", "# of sides", "Length of Radius",
						"Area of Polygon");
				for (int i = 1; i < 9; i++)
				{
					System.out.printf("%-10.0f %-20.0f %-20.2f %n", sides, radius,
							Polygon.getAreaR(radius, sides));
					sides++;
				}
			}
			else
			// Uses side length
			{

				do
				{
					System.out.println("Enter the length of a side of your shape: ");
					isDouble = input.hasNextDouble();

					if (isDouble)
					{
						sideLength = input.nextDouble();
						if (sideLength > 0)
						{
							break;

						}
						else
						{
							System.out.println("Not a valid radius length.");

						}

					}
					else
					{
						input.next(); // Clears input
						System.out.println("Not a valid radius length.");
					}
				}
				while (true);
				System.out.printf("%-10s %-20s %-20s %n", "# of sides", "Length of Side",
						"Area of Polygon");
				for (int i = 1; i < 9; i++)
				{
					System.out.printf("%-10.0f %-20.0f %-20.2f %n", sides, sideLength,
							Polygon.getAreaS(sideLength, sides));
					sides++;
				}
			}
			do
			{

				System.out
						.println("Would you like to calculate the area of another polygon? 1(Yes) or 2(No) ");

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
