package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int initNum, int initDen){
		numerator = initNum;
		denominator = initDen;
	}
	
	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}
	
	public void sum(Fraction frac) {
		int num = numerator + frac.getNumerator();
		int den = denominator + frac.getDenominator();
		System.out.println(num + "/" + den);
	}
	
	public void multiply(Fraction frac) {
		int num = numerator * frac.getNumerator();
		int den = denominator * frac.getDenominator();
		System.out.println(num + "/" + den);
	}
	
	public void reciprocal() {
		int num = denominator;
		int den = numerator;
		System.out.println(num + "/" + den);
	}
	
	public void simplify() {
		int gcd = gcd(numerator, denominator);
		int num = numerator/gcd;
		int den = denominator/gcd;
		System.out.println(num + "/" + den);
	}
	
	public static int gcd(int p, int q) {
		if(q==0) {
			return p;
		}
		else {
			return gcd(q,p % q);
		}
	}
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(2,3);
		Fraction f2 = new Fraction(8,16);
		
		f1.multiply(f2);
		f2.simplify();
	}

}
