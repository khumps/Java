/*
 * Find the slope of a line given 2 points on the line
 */
public class FindSlope {
	double x1;
	double x2;
	double y1;
	double y2;
	
	public double FindSlope(double x1, double y1, double x2, double y2)
	
	{
		double slope;
		
		slope = (y2-y1) / (x2-x1);
		
		return slope;
		

	}
	
}
