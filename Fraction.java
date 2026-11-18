public class Fraction {
    // instance variables (attributes, fields)
    private int numerator, denominator;

    // constructor
    public Fraction() { // default
        numerator = 1;
        denominator = 1;
    }

    public Fraction(int n, int d) { // parameterized constructor
        setNumerator(n);
        setDenominator(d);
        }

    public Fraction(String s) {
        int a = s.indexOf("/");
        if (Integer.parseInt(s.substring(a + 1)) != 0) {
            numerator = Integer.parseInt(s.substring(0, a));
            denominator = Integer.parseInt(s.substring(a + 1));
        } else {
            denominator = 1;
            System.out.println("Error: denominator can't be 0");
        }
    }

    public Fraction(Fraction f) {
        numerator = f.numerator;
        denominator = f.denominator;
    }

    // behaviour method (accessor, mutator, helper)

    // accessors
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public double toDouble() {
        return (double) numerator / denominator;
    }

    // mutator methods
    public void setNumerator(int n) {
        numerator = n;
    }

    public void setDenominator(int d) {
        if (d != 0)
            denominator = d;
        else {
            denominator = 1;
            System.out.println("Error: denominator can't be 0");
        }
    }
}
