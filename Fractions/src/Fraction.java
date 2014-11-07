/*
 * Performs simple fraction equations
 */
public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
		
	}
	
	public Fraction(int numerator)
	{
		this.numerator = numerator;
		this.denominator = 1;
	}
	
	public String toString()
	{
		Fraction newFraction = new Fraction(this.numerator, this.denominator);
		int gcd = gcd(this.numerator, this.denominator);
		int newNumerator = this.numerator / gcd;
		int newDenominator = this.denominator / gcd;
		String str = newNumerator + "/" + newDenominator;
		return str;
	}
	
	
	
	public Fraction addFractions(Fraction fraction)
	{
		int newNumerator;
		int newDenominator;
		int top1 = this.numerator;
		int top2 = fraction.numerator;
		int bottom1 = this.denominator;
		int bottom2 = fraction.denominator;
		if(bottom1 == bottom2)
		{
			newNumerator = top1 + top2;
			newDenominator = bottom1;
		}
		else
		{
		newNumerator = (top1 * bottom2) + (top2 * bottom1);
		newDenominator = bottom1 * bottom2;
		}
		Fraction newFraction =  new Fraction(newNumerator, newDenominator);
		return newFraction;
		
	}
	
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
		
		
		Fraction newFraction =  new Fraction(newNumerator, newDenominator);
		return newFraction;
	}
	
	public Fraction multiplyFractions(Fraction fraction)
	{
		int top1 = this.numerator;
		int top2 = fraction.numerator;
		int bottom1 = this.denominator;
		int bottom2 = fraction.denominator;
		int newNumerator = top1 * top2;
		int newDenominator = bottom1 * bottom2;
		Fraction newFraction =  new Fraction(newNumerator, newDenominator);
		return newFraction;
		
	}
	
	public Fraction divideFractions(Fraction fraction)
	{
		int top1 = this.numerator;
		int top2 = fraction.numerator;
		int bottom1 = this.denominator;
		int bottom2 = fraction.denominator;
		int newNumerator = top1 * bottom2;
		int newDenominator = bottom1 * top2;
		Fraction newFraction =  new Fraction(newNumerator, newDenominator);
		return newFraction;
		
	}
	
	
	public double toDecimal()
	{
		return (double)this.numerator / this.denominator;
	}
	
	public Fraction recipricol()
	{
		Fraction recipricol = new Fraction(this.denominator, this.numerator); //old fraction flipped
		return recipricol;
	}
	

	public static int gcd(int a, int b) //testing to simplify fractions but was having problems so it isnt implemented
	{
		return b == 0 ? a:gcd(b, a%b);
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
}