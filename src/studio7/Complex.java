package studio7;

public class Complex {

	private int a;
	private int b;
	
	public Complex(int initA, int initB){
		a = initA;
		b = initB;	
	}
	
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public void add(Complex comp) {
		int aNow = a + comp.getA();
		int bNow = b + comp.getB();
		System.out.println(aNow + " + " + bNow + "i");
	}

	public void multiply(Complex comp) {
		int aNow = a*comp.getA() - b*comp.getB();
		int bNow = a*comp.getB() + b*comp.getA();
		System.out.println(aNow + " + " + bNow + "i");
	}
	
	public static void main(String[] args) {
		Complex c1 = new Complex(2,5);
		Complex c2 = new Complex(10,3);
		
		c1.add(c2);
		c1.multiply(c2);
	}

}