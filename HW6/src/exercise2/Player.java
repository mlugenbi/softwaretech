package exercise2;

public class Player {
	
	
	public boolean isKI = false;
	public int cardNumber;
	
	public int Play() {
		
		return Bet_More_Game.pick_card();
	}

}
