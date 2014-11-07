import java.util.Scanner;

public class Addition{


public static void main(String[] args) {
	
	System.out.print("Enter an  integer: ");
	Scanner numbers = new Scanner(System.in);
	int a = numbers.nextInt();

	System.out.print("Enter another integer: ");
	int b = numbers.nextInt();
	int c = a + b;
	
	System.out.println(a + " + " + b + " is " + c);

}

}
