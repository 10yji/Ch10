public class FractionDriver {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(1, 2);
        Fraction f3 = new Fraction("101/100");
		
		System.out.println(f3);
		System.out.println(f2.toDouble());
        System.out.println(f2.getNumerator() + "/" + f2.getDenominator());
    }
}
