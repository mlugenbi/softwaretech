package exercise2;
import java.util.Scanner;

public class Game_Chair {
	
	
public static void main(String[] args) {
		
		Player computer = new Player();
		computer.isKI = true;
		Player player_2 = new Player();
		
		computer.cardNumber = Game_Chair.Start(computer);
		System.out.println("You may re-shuffle four times");
		player_2.cardNumber = Game_Chair.Start(player_2);
		
		Player Winner = Game_Chair.FindWinner(computer, player_2);
		
		if(Winner.isKI) {
			System.out.println("Computer wins.");
		}else {
			System.out.println("Player 2 wins.");
		}
		
		System.out.println("The numbers were: ");
		System.out.println("Computer: " + computer.cardNumber);
		System.out.println("Player 2: " + player_2.cardNumber);
		

	}
	
	public static int Start(Player p) {
		
		if(p.isKI) {
			
			return p.Play();
			
		}
		
		int shuffleAmount = 0;
		boolean newCard = false;
		int player_2_number;
		Scanner scanner = new Scanner(System.in);
		do {
			
			newCard = false;
			player_2_number = p.Play();
			shuffleAmount++;
			if(shuffleAmount == 5) {
				System.out.println("The number is " + player_2_number + ". You cannot shuffle again.");
			}else {
				System.out.println("The number is " + player_2_number + ". Enter 'y' to receive a new card. Otherwise, enter any button");
				String s = scanner.next();
	            if(s.equals("y")) {
	            	
	            	newCard = true;
	            }
				
			}
			
			
			
			
			
		}while(shuffleAmount < 5 && newCard);
		
		scanner.close();
		
		
		return player_2_number;
	}
	
	public static Player FindWinner(Player p1, Player p2) {
		
		if(p1.cardNumber <= p2.cardNumber) {
			
			return p2;
		}else {
			return p1;
		}
	}

}
	