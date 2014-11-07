/*
 * Constructor and Methods for simple math with two double values.
 */
public class Math {
	
	private double numberOne;
	private double numberTwo;

	public Math(){
	}


	public double add(double numberOne, double numberTwo){
		double answer = numberOne + numberTwo;
		return answer;
	}
	
	public double sub(double numberOne, double numberTwo){
		double answer = numberOne - numberTwo;
		return answer;
	}
	
	public double mult(double numberOne, double numberTwo){
		double answer = numberOne * numberTwo;
		return answer;
	}
	
	public double div(double numberOne, double numberTwo){
		double answer = numberOne / numberTwo;
		return answer;
	}
	
	public double divR(double numberOne, double numberTwo){
		double remainder = numberOne % numberTwo;
		return remainder;
	}
}