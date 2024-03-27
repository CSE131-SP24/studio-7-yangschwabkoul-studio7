package studio7;

public class Rectangle {

	private int length;
	private int width;
	
	public Rectangle(int initLength, int initWidth){
		length = initLength;
		width = initWidth;	
	}
	
	public int area() {
		return length * width;
	}
	
	public int perimeter() {
		return 2*length + 2*width;
	}
	
	public boolean square() {
		if(length == width) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean rectAreaSmaller(Rectangle rect) {
		if(rect.area() > this.area()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5,10);
		Rectangle r2 = new Rectangle(10,20);
		
		System.out.println(r1.rectAreaSmaller(r2));
	}

}
