/*
 * Testing LinearEquation()
 * 
 * Written By Kevin Humphreys
 */
public class LineTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x, y, yInt, slope;
		x = 2;
		y = 3;
		yInt = 4;
		slope = 2;
		LinearEquation a = new LinearEquation();
		LinearEquation b = new LinearEquation(slope, yInt);
		

		System.out.println(x);
		x = a.getX(y, yInt, slope);
		System.out.println(x);
		System.out.println(b);
		System.out.println(b.getInverse(slope,yInt));
	}

}
