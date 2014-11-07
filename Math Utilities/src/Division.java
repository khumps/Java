import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		
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
}
