package studio7;

public class Die {

	private int sides;
	
	public Die(int initSides){
		sides = initSides;
	}
	
	public int roll() {
		return (int)(Math.random()*sides) + 1;
	}
	
	public static void main(String[] args) {
		Die d1 = new Die(6);
		
		for(int i=0; i<20;i++) {
			System.out.println(d1.roll());
		}
	}

}
