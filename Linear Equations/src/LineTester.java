/* 
 * Tests the functionalities of the
 * LinearEquation class
 * 
 * Updated 9/16/2014
 */

public class LineTester {

	public static void main(String[] args) {
		double x = 5, y = 7;
		LinearEquation a = new LinearEquation(x,y);
		LinearEquation b = new LinearEquation(0,0,2,1);
		LinearEquation c = new LinearEquation();
		
		System.out.println(a.toString());
		System.out.println(b);
		System.out.println(c);
		double testVal = 42;
		double result = a.getY(testVal);
		System.out.println("When x = " + testVal + " in " + a +
				", y = " + result);

		LinearEquation d = a.inverse();
		System.out.println(d + " is the inverse of " + a);
		testVal = result;
		result = d.getY(testVal);
		System.out.println("When x = " + testVal + " in " + d +
				", y = " + result);
	}

}







