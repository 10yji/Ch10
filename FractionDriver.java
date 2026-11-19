public class FractionDriver {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(1, 2);
        Fraction f3 = new Fraction(2, 3);
        Fraction f4 = new Fraction(2, 4);
		
		System.out.println(Fraction.mult(f2, f3));
    }
}
