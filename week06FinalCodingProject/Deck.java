package week06FinalCodingProject;

import java.util.*;

public class Deck {
	
	List<String> Deck = new ArrayList<String>();
	String[] suits = { "Spades", "Hearts", "Clubs", "Diamonds" };
	String[] number = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

	public void initDeck() {
		for (int i = 0; i < suits.length; i++) {

			for (int j = 0; j < number.length; j++) {
				Deck.add(number[j] + " of " + suits[i]);

			}

		}

	}

	public void shuffleDeck() {
		Collections.shuffle(Deck);
		// System.out.println(Deck);
	}

	public List<String> dealDeck(int numberOfPlayers, int PlayerNumber) {

		List<String> partDeck = new ArrayList<String>();
		for (int i = (Deck.size() - (Deck.size() / PlayerNumber)); i < Deck.size()
				/ (numberOfPlayers / PlayerNumber); i++) {

			partDeck.add(Deck.get(i));

		}
		return partDeck;

	}
}
