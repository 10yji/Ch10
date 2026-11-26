import java.util.Random;

public class Fraction {
    // instance variables (attributes, fields)
    private int numerator, denominator;

    // constructor
    public static Fraction randomF() { // default
		Random random = new Random();
        int n = random.nextInt(9)+1;
        int d = random.nextInt(9)+1;
        Fraction c = new Fraction(n,d);
        return c;
        
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
    
    public static Fraction add(Fraction a, Fraction b){
		int n = a.numerator*b.denominator+b.numerator*a.denominator;
		int d = a.denominator*b.denominator;
		Fraction c = new Fraction(n, d);
		c.reduce();
		return c;
	}
    
    public static Fraction subtract(Fraction a, Fraction b){
		int n = a.numerator*b.denominator-b.numerator*a.denominator;
		int d = a.denominator*b.denominator;
		Fraction c = new Fraction(n, d);
		c.reduce();
		return c;
	}
    
    public static Fraction mult(Fraction a, Fraction b){
		int n = a.numerator*b.numerator;
		int d = a.denominator*b.denominator; 
		Fraction c = new Fraction(n ,d);
		c.reduce();
		return c;
}

    public static Fraction divide(Fraction a, Fraction b){
		int n = a.numerator*b.denominator;
		int d = a.denominator*b.numerator; 
		Fraction c = new Fraction(n ,d);
		c.reduce();
		return c;
}

	public static int GCF(int a, int b){
		if (a<0){
			a*=-1;
		}
		if (b<0){
			b*=-1;
		}
		while (a!=b){
			while (a>b){
				a -= b;
			} while (b>a){
				b -= a;
			}
		} return a;
				
}

	public void reduce(){
		int gcf = GCF(numerator, denominator);
		numerator = numerator/gcf;
		denominator = denominator/gcf;
}
}
