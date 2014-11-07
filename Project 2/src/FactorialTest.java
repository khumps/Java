import java.math.BigInteger;
import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] arrgs)
	{
		
		boolean idiot;
		boolean allowed;
		int start = 0;
	Scanner input = new Scanner(System.in);
	do{
		

		System.out.println("Enter a number to get the factorial for: ");

		if(input.hasNextInt())
			start = input.nextInt();
		if(start > 0)
		{
			break;
		
		}
		else
		{
			input.next();
			System.out.println("Cant find a factorial for that. Either I am incompotent, or you are an idiot.");
		}
		}while(true);
		
		BigInteger factorial = LoopMethods.factorial(start,true);
		System.out.println(start + "! = " + factorial);
		LoopMethods.printArea(3,6,4,7);

}
}
