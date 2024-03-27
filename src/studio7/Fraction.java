package studio7;

public class Fraction {
	private double numerator;
	private double denominator;
	
	
	public Fraction(double n, double d) {
		numerator = n;
		denominator = d;
	}
	
	public double multiplyFraction(Fraction other) {
		double newNumerator = get.fac1 * this
	}
	
	
	public double getNumerator() {
		return numerator;
	}

	public void setNumerator(double numerator) {
		this.numerator = numerator;
	}

	public double getDenominator() {
		return denominator;
	}

	public void setDenominator(double denominator) {
		this.denominator = denominator;
	}

	public static void main(String[] args) {
		Fraction frac1 = new Fraction(1,2);
		Fraction frac2 = new Fraction(3,5);
		frac1.multiplyFraction(frac2);
	}

}
