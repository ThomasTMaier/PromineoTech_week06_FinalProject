package week06FinalCodingProject;

import java.util.Scanner;
import java.util.Timer;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Creating the deck	
		Deck o = new Deck();
		int Tie = 0;
		o.initDeck();
		o.shuffleDeck();
	//These make the game feel more natural	
		Scanner Scan = new Scanner(System.in);
		Timer Delay = new Timer();
	// Creating the number of players
		Player player1 = new Player(o.dealDeck(2, 1), 0);
		Player player2 = new Player(o.dealDeck(2, 2), 0);
		// System.out.println("Player 1 " + player1.Hand);
		// System.out.println("Player 2 " + player2.Hand);
	//Passes the card through to begin the game. 
		Card Player1TopCard = new Card(player1.Hand.get(0), 0);
		Card Player2TopCard = new Card(player2.Hand.get(0), 0);
		
	// Game begins	
		System.out.println("Press Enter to Begin the Game of War!");
		Scan.nextLine();
		System.out.println("Dealing Deck...");
	//Waiting to make it feel more natural
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Press Enter to Play a Card!");
		Scan.nextLine();
		
	//Code to actually play the game as long as both players have cards	
		while (!(player1.Hand.isEmpty()) && !(player2.Hand.isEmpty())) {
	//Setting Values 		
			Player1TopCard.SetCardValue(player1.Hand.get(0));
			Player2TopCard.SetCardValue(player2.Hand.get(0));
			Player1TopCard.SetCard(player1.Hand.get(0));
			Player2TopCard.SetCard(player2.Hand.get(0));
	//Determining who wins
			if (Player1TopCard.GetValue() > Player2TopCard.GetValue()) {
				System.out.println("Player 1's Card: " + Player1TopCard.describe());
				System.out.println("Player 2's Card: " + Player2TopCard.describe());
				System.out.println("Point for Player 1");
				player1.Points += 1;
	//Adds cards back into the winners hand, Makes the games run on for a *LONG* time
				// player1.Hand.add(player1.Hand.get(0));
				// player1.Hand.add(player2.Hand.get(0));
			} else if (Player1TopCard.GetValue() < Player2TopCard.GetValue()) {
				System.out.println("Player 1's Card: " + Player1TopCard.describe());
				System.out.println("Player 2's Card: " + Player2TopCard.describe());
				System.out.println("Point of Player 2");
				player2.Points += 1;
				// player2.Hand.add(player1.Hand.get(0));
				// player2.Hand.add(player2.Hand.get(0));
			} else {
				System.out.println("Player 1's Card: " + Player1TopCard.describe());
				System.out.println("Player 2's Card: " + Player2TopCard.describe());
				System.out.println("Tie");
				Tie += 1;
				// player1.Hand.add(player1.Hand.get(0));
				// player2.Hand.add(player2.Hand.get(0));
			}
		//removing the top cards so the game continues and can end	

			player1.Hand.remove(0);
			player2.Hand.remove(0);
			System.out.println("Press Enter");
			Scan.nextLine();

		}
		
	//Game over screen
		System.out.println("Game Over!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Calculating Points...");
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	// Points are done at the end so unless you're tally-ing the score there is some suspense for the end. 	
		System.out.println("Player 1's Points: " + player1.Points + " Player 2's Points: " + player2.Points + " Number of Ties: " + Tie);
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(player1.Points>player2.Points) {
			System.out.println("Player 1 Wins");
		}else if(player1.Points< player2.Points) {
			System.out.println("Player 2 Wins");
		}else {
			System.out.println("TIE");
		}
	}

}
