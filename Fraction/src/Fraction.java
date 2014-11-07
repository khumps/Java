/*
 * Performs simple fraction equations and simplifies the result (broken)
 */
public class Fraction {

	private int numerator;
	private int denominator;
	
	/*
	 * Creates a new Fraction numerator/denominator
	 */
	public Fraction(int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
		
	}
	
	/*
	 * Creates a new Fraction numerator/1
	 */
	public Fraction(int numerator)
	{
		this.numerator = numerator;
		this.denominator = 1;
	}
	
	/*
	 * Adds two Fractions and simplifies
	 */
	public Fraction addFractions(Fraction fraction)
	{
		int newNumerator;
		int newDenominator;
		int top1 = this.numerator;
		int top2 = fraction.numerator;
		int bottom1 = this.denominator;
		int bottom2 = fraction.denominator;
		newNumerator = (top1 * bottom2) + (top2 * bottom1);
		newDenominator = bottom1 * bottom2;
		int gcd = gcd(newNumerator, newDenominator);
		newNumerator /= gcd;
		newDenominator /= gcd;
		Fraction newFraction =  new Fraction(newNumerator, newDenominator);
		return newFraction;
	}
	
	/*
	 * Subtracts two Fractions and Simplifies
	 */
	public Fraction subtractFractions(Fraction fraction)
	{
		int newNumerator;
		int newDenominator;
		int top1 = this.numerator;
		int top2 = fraction.numerator;
		int bottom1 = this.denominator;
		int bottom2 = fraction.denominator;
		newNumerator = (top1 * bottom2) - (top2 * bottom1);
		newDenominator = bottom1 * bottom2;
		int gcd = gcd(newNumerator, newDenominator);
		newNumerator /= gcd;
		newDenominator /= gcd;
		Fraction newFraction =  new Fraction(newNumerator, newDenominator);
		return newFraction;
	}
	
	/*
	 * Multiplies two Fractions and simplifies
	 */
	public Fraction multiplyFractions(Fraction fraction)
	{
		int top1 = this.numerator;
		int top2 = fraction.numerator;
		int bottom1 = this.denominator;
		int bottom2 = fraction.denominator;
		int newNumerator = top1 * top2;
		int newDenominator = bottom1 * bottom2;
		int gcd = gcd(newNumerator, newDenominator);
		newNumerator /= gcd;
		newDenominator /= gcd;
		Fraction newFraction =  new Fraction(newNumerator, newDenominator);
		return newFraction;
		
	}
	
	/*
	 * Divides two Fractions and simplifies
	 */
	public Fraction divideFractions(Fraction fraction)
	{
		int top1 = this.numerator;
		int top2 = fraction.numerator;
		int bottom1 = this.denominator;
		int bottom2 = fraction.denominator;
		int newNumerator = top1 * bottom2;
		int newDenominator = bottom1 * top2;
		int gcd = gcd(newNumerator, newDenominator);
		newNumerator /= gcd;
		newDenominator /= gcd;
		Fraction newFraction =  new Fraction(newNumerator, newDenominator);
		return newFraction;
		
	}
	
	/*
	 * Converts a Fraction to a decimal
	 */
	public double toDecimal()
	{
		return (double)this.numerator / this.denominator;
	}
	
	/*
	 * Flips the Fraction
	 */
	public Fraction recipricol()
	{
		Fraction recipricol = new Fraction(this.denominator, this.numerator);
		return recipricol;
	}
	/**
	 * @return the numerator
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * @return the denominator
	 */
	public int getDenominator() {
		return denominator;
	}
	
	public static int gcd(int a, int b) //Returns the GCD of two Int values
	{
		return b == 0 ? a:gcd(b, a%b);
	}

	/*
	 * Turns the Fraction into a String
	 */
	public String toString()
	{
		return denominator != 1 ? (numerator + "/" + denominator): ("" + numerator + "");
	}
}