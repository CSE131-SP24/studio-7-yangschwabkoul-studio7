package studio7;

public class HockeyPlayer {

	private String name;
	private int jersey;
	private String hand;
	private String shoot;
	private int[] goals;
	private int[] assists;
	private int[] points;
	
	public HockeyPlayer(String initName, int initJersey, String initHand, String initShoot, int[] initGoals, int[] initAssists, int[] initPoints){
		name = initName;
		jersey = initJersey;	
		hand = initHand;
		shoot = initShoot;
		goals = initGoals;
		assists = initAssists;
		points = initPoints;
	}

	public void game() {
		int totalG = 0;
		int totalA = 0;
		int totalP = 0;
		for(int i=0; i<goals.length; i++) {
			int gameG = (int)(Math.random()*5);
			System.out.println(gameG + " goals this game.");
			int gameA = (int)(Math.random()*5);
			System.out.println(gameA + " assists this game.");
			int gameP = gameG + gameA;
			System.out.println(gameP + " points this game.");
			
			totalG += gameG;
			totalA += gameA;
			totalP += gameP;
		}
		System.out.println(name + " scored " + totalG + " goals total.");
		System.out.println(name + " scored " + totalA + " assists total.");
		System.out.println(name + " scored " + totalP + " points total.");
	}

	public static void main(String[] args) {
		int[] goals = {0,0,0,0,0};
		int[] assists = {0,0,0,0,0};
		int[] points = {0,0,0,0,0};
		HockeyPlayer h1 = new HockeyPlayer("Arnav", 4, "left", "right", goals, assists, points);
		
		h1.game();
	}
}