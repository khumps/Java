/*
 * Represents a mathematical linear equation
 * in slope intercept form (y=mx+b).
 * 
 * Updated 9/16/2014
 */

public class LinearEquation 
{
	private double slope;
	private double yInt;
	
	/*
	 * Constructor to build a LinearEquation object
	 * based on a slope and y-intercept
	 * 
	 * Parameters:
	 * 	double slope = the slope of the line
	 * 	double yIntercept = the y-intercept of the line
	 */
	public LinearEquation(double slope, double yIntercept)
	{
		this.slope = slope;
		this.yInt = yIntercept;
	}
	
	/*
	 * Constructor based on two ordered pairs
	 * 
	 * Parameters (all double):
	 * 	x1 = the x coordinate of the first point
	 * 	y1 = the y coord of the 1st point
	 * 	x2 = the x coord of the 2nd point
	 * 	y2 = the y coord of the 2nd point
	 */
	public LinearEquation(double x1, double y1, double x2, double y2){
		slope = (y2 - y1) / (x2 - x1);
		yInt = y1 - slope * x1;
	}
	
	/*
	 * default constructor (ctor) sets the default
	 * line to y = x
	 */
	public LinearEquation(){
		slope = 1;
		yInt = 0;
	}
	
	/*
	 * Gives a String representation of a LinearEquation
	 * object in the form "y=mx+b"
	 */
	public String toString(){
		String str = "y = ";
		str = str + slope + "x + ";
		str += yInt;
		return str;
	}
	
	/*
	 * Calculates a y-value based on a given x-value
	 * 
	 * Parameter:
	 * 	double x = the value of the x coordinate
	 * 
	 * Returns the value of the y-coordinate
	 */
	public double getY(double x){
//		double y = slope * x + yInt;
//		return y;
		return slope * x + yInt;
	}
	
	/*
	 * Calculates the x-value of an ordered pair on the
	 * line given the y-value
	 * 
	 * Parameter:
	 * 	double y = the y-coordinate
	 * 
	 *  Returns the value of the x-coordinate
	 */
	public double getX(double y){
		return (y - yInt) / slope;
	}
	
	/*
	 * Finds the inverse of this LinearEquation object
	 * 
	 * Returns a LinearEquation object containing the inverse equation
	 */
	public LinearEquation inverse(){
		double newSlope = 1 / this.slope;
		double newYInt = -this.yInt / this.slope;
		LinearEquation inv = new LinearEquation(newSlope, newYInt);
		return inv;
		// return new LinearEquation(1/slope, -yInt/slope);
	}
	
	/*
	 * Finds the composition of 2 linear equation functions, f(g(x)).
	 * This object is treated as the f(x) and the formal parameter is
	 * the g(x).
	 * 
	 * Parameter:
	 * 	LinearEquation g = the 'inner' function of the composition
	 * 
	 * Returns a LinearEquation object containing the composition equation
	 */
}








