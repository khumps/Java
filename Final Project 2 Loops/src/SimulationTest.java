/*
 * Tests the simulation methods in LoopExamples class
 */

import java.util.Scanner;

public class SimulationTest
{

	public static void main(String[] args)
	{
		boolean again = true;
		boolean isDouble;
		double velocity;
		Scanner input = new Scanner(System.in);
		while (again)
		{
			do
			{
				System.out.println("Enter the velocity of the projectile: ");
				isDouble = input.hasNextDouble();

				if (isDouble)
				{
					velocity = input.nextDouble();
					break;
				}
				else
				{
					input.next(); // Clears input
					System.out.println("Not a valid velocity.");
				}
			}
			while (true);

			LoopExamples.simulation(velocity);

			do
			{

				System.out
						.println("Would you like to calculate the trajectory of another projectile? 1(Yes) or 2(No) ");
				input.hasNextInt();
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
