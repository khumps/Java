/*
 * Constructor and methods to solve linear equation problems
 * 
 *Written By Kevin Humphreys
 */

public class LinearEquation {
	private double slope;
	private double yInt;

	public LinearEquation()
	{
		
	}
	public LinearEquation(double slope, double yInt)
	{
		this.slope = slope;
		this.yInt = yInt;
	}
	
	public String toString()
	{
		String str = "y = ";
		str = str + slope + "x + ";
		str += yInt;
		return str;
	}

	/*
	 * slope = slope of the line yInt = Y-Intercept
	 */

	public double getX(double y, double slope, double yInt)
	// Solves for X given (Y= Slope * X + yInt)

	{
		double x = (y - yInt) / slope;
		return x;
	}

	public double getY(double x, double slope, double yInt)
	// Solves for Y given (Y= Slope * X + yInt)
	{
		double y = (slope * x) - yInt;
		return y;
	}

	public double getSlope(double x1, double y1, double x2, double y2)
	// Solves the slope given two points on the line (x1,y1) (x2,y2)
	{
		double slope = (y2 - y1) / (x2 - x1);
		return slope;
	}

	public double getSlope(double y, double x, double yInt)
	// solves for two points given one point and the Y-Intercept
	{
		double slope = (y - yInt) / x;
		return slope;
	}

	public double yInt(double y, double slope, double x) {
		double yInt = y - (slope * x);

		return yInt;
	}
	
	public LinearEquation getInverse(double slope, double yInt)
	{
		double newSlope = 1 / slope;
		double newYInt = -yInt / slope;
		LinearEquation inv = new LinearEquation(newSlope, newYInt);
		return inv;
	}
	//public LinearEquation getComp()
	{
		
	}
}

/*
        ____________
       /\  ________ \
      /  \ \______/\ \
     / /\ \ \  / /\ \ \
    / / /\ \ \/ / /\ \ \
   / / /__\ \ \/_/__\_\ \__________
  / /_/____\ \__________  ________ \
  \ \ \____/ / ________/\ \______/\ \
   \ \ \  / / /\ \  / /\ \ \  / /\ \ \
    \ \ \/ / /\ \ \/ / /\ \ \/ / /\ \ \
     \ \/ / /__\_\/ / /__\ \ \/_/__\_\ \
      \  /_/______\/_/____\ \___________\
      /  \ \______/\ \____/ / ________  /
     / /\ \ \  / /\ \ \  / / /\ \  / / /
    / / /\ \ \/ / /\ \ \/ / /\ \ \/ / /
   / / /__\ \ \/_/__\_\/ / /__\_\/ / /
  / /_/____\ \_________\/ /______\/ /
  \ \ \____/ / ________  __________/
   \ \ \  / / /\ \  / / /
    \ \ \/ / /\ \ \/ / /
     \ \/ / /__\_\/ / /
      \  / /______\/ /
       \/___________/
       */
