import java.util.Scanner;
public class PrimeFactoring {
	
	public static void primeFactor(long toFactor)
	{
		for(int factor = 2; toFactor > 1; factor ++)
		{
			while(toFactor % factor == 0)
			{
				System.out.println(factor);
				toFactor /= factor;
			}
		}
	}

	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		boolean again;
		int whynot = 0;
		
		do
		{
		System.out.println("Enter a number to factor: ");
		long number = input.nextLong();
		primeFactor(number);
		System.out.println("Would you like to factor another number? 1(Yes) or 2(No)?");
		whynot = input.nextInt();
		if(whynot == 1)
			again = true;
		
		else
		break;
		}while(again = true);
	}
}
