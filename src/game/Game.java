package game;

import entities.Deck;

public class Game {
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.generateCards();
		
		deck.printCards();
		
		deck.shuffle();
		System.out.println("--------------------------");
		deck.printCards();
	}
}
