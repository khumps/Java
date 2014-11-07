import java.math.BigInteger;


public class LoopMethods {

	public static BigInteger factorial(int start, boolean print)
	{
		final int starter = start;
		String str = "" + start;
		BigInteger factorial = new BigInteger(str);
		BigInteger operator = new BigInteger(str);
		
		while(start > 1)
		{
			operator = operator.subtract(BigInteger.ONE);
			start = --start;
			factorial = factorial.multiply(operator);	
		}
		if(print == true)
		System.out.println(starter + "! = " + factorial);
		
		return factorial;
	}
	
	public static void printArea(int length, int width)
	{
		System.out.printf("%-10s %-10s %-10s %n", "length", "width", "area");
		System.out.println("------------------------------");
		System.out.printf("%-10s %-10s %-10s %n", length, width, (length * width));
		
/*		int minWidth, maxWidth, minlength, maxlength;
		System.out.printf("%-10s %-10s %-10s %n", "width", "length", "area");
		System.out.println("------------------------------");
		for(int i = minlength; i <(maxlength + 1); i++)
		{
			
		}*/
	}
	
	public static void printArea(int minWidth, int maxWidth,  int minLength, int maxLength)
	{
		int startMinWidth = minWidth;
		int startMinLength = minLength;
		System.out.printf("%-10s %-10s %-10s %n", "length", "width", "area");
		System.out.println("------------------------------");
		for(;minLength < maxLength + 1; minLength++)
		{
			for(;minWidth < maxWidth + 1; minWidth++)
			{
				System.out.printf("%-10s %-10s %-10s %n", minLength, minWidth, (minLength * minWidth));
				System.out.println("------------------------------");
			}
			minWidth  = startMinWidth;
		}
	}
}
