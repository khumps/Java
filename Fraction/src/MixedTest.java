public class MixedTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction fraction = new Fraction(10,6);
		MixedNumber mixed = new MixedNumber(1,3,4);
		MixedNumber mixed2 = new MixedNumber(756,3453);
		MixedNumber mixed3 = new MixedNumber(342);
		MixedNumber mixed4 = new MixedNumber(fraction);
		System.out.println(mixed.multiplyMixed(mixed4).toString());
		System.out.println(mixed.divideMixed(mixed4).toString());
		System.out.println(mixed.subtractMixed(mixed4).toString());
		System.out.println(mixed.addMixed(mixed4).toString());
		System.out.println(mixed2.multiplyMixed(mixed3).toString());
		System.out.println(mixed4.divideMixed(mixed3).toString());
		System.out.println(mixed2.subtractMixed(mixed3).toString());
		System.out.println(mixed3.addMixed(mixed2).toString());
		System.out.println(mixed4.toString());
		System.out.println(mixed4.toDecimal());
		System.out.println(mixed4.recipricol());
	}

}
