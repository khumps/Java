public class FractionTest {

	public static void main(String[] args) {
		Fraction fraction1= new Fraction(7,9);
		Fraction fraction2 = new Fraction(5,3);
		Fraction fraction3 = new Fraction(34,7);
		Fraction fraction4= new Fraction(6,9);
		
		System.out.println(fraction1 + " + " + fraction2 + " = " + fraction1.addFractions(fraction2));
		System.out.println(fraction1 + " + " + fraction1 + " = " + fraction1.addFractions(fraction1));
		System.out.println(fraction1 + " + " + fraction3 + " = " + fraction1.addFractions(fraction3));
		System.out.println(fraction1 + " - " + fraction2 + " = " + fraction1.subtractFractions(fraction2));
		System.out.println(fraction1 + " * " + fraction2 + " = " + fraction1.multiplyFractions(fraction2));
		System.out.println(fraction1 + " * " + fraction3 + " = " + fraction1.multiplyFractions(fraction3));
		System.out.println(fraction1 + " / " + fraction2 + " = " + fraction1.divideFractions(fraction2));
		System.out.println(fraction1 + " / " + fraction1 + " = " + fraction1.divideFractions(fraction2));
		System.out.println(fraction1 + " / " + fraction2 + " = " + fraction1.divideFractions(fraction3));
		System.out.println(fraction1 + " in decimal form is " + fraction1.toDecimal());
		System.out.println(fraction1 + "'s recipricol is " + fraction1.recipricol());
}
}