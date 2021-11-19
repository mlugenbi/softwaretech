package exercise2;

import java.util.Random;

public class Bet_More_Game {
	
	
	public static int pick_card() {
		
		Random r = new Random();
		return r.nextInt(100) + 1;
	}

}
