/*
 * 
 */
public class Polygon
{
	static boolean debug = false;


	public static double getAngle(double sides)// returns the measure of an
												// interior angle of a regular
												// polygon
	{
		if (debug)
			System.out.println("getAngle = " + Math.toRadians((((sides - 2) / sides) * 180) / 2));
		return Math.toRadians((((sides - 2) / sides) * 180) / 2);

	}


	/*
	 * Returns the apothem of a polygon given a radius and number of sides
	 */
	public static double getApothemR(double radius, double sides)
	{
		double angle = getAngle(sides);
		if (debug)
			System.out.println("getApothem Angle = " + angle);
		if (debug)
			System.out.println("getApothem Math.sin(angle)= " + Math.sin(angle));
		if (debug)
			System.out.println("getApothem returns " + (radius * (Math.sin((angle)))));
		return (radius * Math.sin(angle));
	}


	/*
	 * Returns the length of a side for a polygon given the radius and number of
	 * sides
	 */
	public static double getSideR(double radius, double sides)
	{
		double angle = getAngle(sides);
		if (debug)
			System.out.println("getSideR radius = " + radius);
		if (debug)
			System.out.println("getSideR sides = " + sides);
		if (debug)
			System.out.println("getSideR angle is " + angle);
		if (debug)
			System.out.println("getSideR Math.cos(angle)= " + Math.cos(angle));
		if (debug)
			System.out.println("getSideR returns " + (radius * Math.cos(angle)));
		return ((radius * Math.cos(angle)) * 2);
	}


	/*
	 * returns the perimeter of a polygon with the formula sideLength * sides
	 */
	public static double getPerimeter(double sideLength, double sides)
	{
		if (debug)
			System.out.println("getPerimeter returns " + sideLength * sides);
		return sideLength * sides;

	}


	/*
	 * gets the area of a polygon given the radius length and the number of
	 * sides
	 */
	public static double getAreaR(double radius, double sides)
	{
		double apothem = Polygon.getApothemR(radius, sides); // gets the apothem
		if (debug)
			System.out.println("getAreaR apothem = " + apothem);
		double sideLength = Polygon.getSideR(radius, sides); // gets the length
																// of a side
		if (debug)
			System.out.println("getAreaR sideLength = " + sideLength);
		double perimeter = Polygon.getPerimeter(sideLength, sides); // gets the
																	// perimeter
		if (debug)
			System.out.println("getAreaR perimeter = " + perimeter);
		return (apothem * perimeter) * 0.5; // uses the formula area= 1/2AP to
											// get the area of the polygon
	}


	/*
	 * gets the area of a polygon given the length of a side and the number of
	 * sides
	 */
	public static double getAreaS(double sideLength, double sides)
	{
		double apothem = (sideLength / 2) * Math.tan(getAngle(sides));
		if (debug)
			System.out.println("getAreaS sides = " + sideLength);
		if (debug)
			System.out.println("getAreaS Apothem = " + apothem);
		return 0.5 * apothem * getPerimeter(sideLength, sides);

	}


	public static void setDebug(boolean debug)
	{
		Polygon.debug = debug;
	}

}
