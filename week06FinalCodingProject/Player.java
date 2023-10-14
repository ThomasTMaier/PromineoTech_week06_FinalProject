package week06FinalCodingProject;

import java.util.*;

public class Player {
	static Deck Deck = new Deck();
	int numberOfPlayers = 2;
	List<String> Hand;
	int Points;

	public Player(List<String> Hand, int Points) {
		this.Hand = Hand;
		this.Points = Points;
	}

}
