package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class Deck {
	
	public static final int MAX_CARD = 52;
	private static Stack<Card> cards;
	
	private final String[] CARD_LABELS = {
			"3", "4", "5", "6", "7",
			"8", "9", "10", "J", "Q",
			"K", "A", "2"
	};
	
	private final String[] CARD_SUITS = {
			"SPADE", "CLOVER", "DIAMOND", "HEART"
	};
	
	public Deck() {
		this.cards = new Stack<>();
	}
	
	public void generateCards() {
		if(!cards.isEmpty()) {
			cards.clear();
		}
		
		for (int i = 0; i < CARD_LABELS.length; i++) {
			for(int j = 0; j < CARD_SUITS.length; j++) {
				Suit suit = new Suit(CARD_SUITS[j]);
				String cardLabel = CARD_LABELS[i];
				Card card = new Card(suit, cardLabel);
				cards.push(card);
			}
		}
	}
	
	public void shuffle() {
		Random random = new Random();
		for (int i = 0; i < cards.size(); i++) {
			int index = random.nextInt(cards.size()); 
			Card temp = cards.get(i);
			cards.set(i, cards.get(index));
			cards.set(index, temp);
		}
	}
	
	public void distribute(List<Player> players) {
		int distributingTurn = 13;
		int currentTurn = 0;
		while(currentTurn < distributingTurn) {
			for(int i = 0; i < players.size(); i++) {
				Player player = players.get(i);
				player.getOnHandCards().add(cards.pop());
			}
			currentTurn++;
		}
		
	}
	
	public void printCards() {
		if(cards.isEmpty()) {
			return;
		}
		for(Card c : cards) {
			System.out.println(c);
		}
	}
}
