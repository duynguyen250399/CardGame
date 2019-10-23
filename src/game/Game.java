package game;

import java.util.ArrayList;
import java.util.List;

import entities.Deck;
import entities.Player;

public class Game {
	public static void main(String[] args) {
		List<Player> players = new ArrayList<>();
		Deck deck = new Deck();
		deck.generateCards();
		deck.shuffle();	
		
		//deck.printCards();
		
		Player player1 = new Player();
		Player player2 = new Player();
		players.add(player1);
		players.add(player2);
		
		deck.distribute(players);
		
		for(int i = 0; i < players.size(); i++) {
			System.out.println("Player " + i + " cards: ");
			players.get(i).printCardsOnHand();
		}
	}
}
