package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	
	public static final int MAX_CARD = 52;
	private static List<Card> cards;
	
	private final String[] CARD_LABELS = {
			"3", "4", "5", "6", "7",
			"8", "9", "10", "J", "Q",
			"K", "A", "2"
	};
	
	private final String[] CARD_SUITS = {
			"SPADE", "CLOVER", "DIAMOND", "HEART"
	};
	
	public Deck() {
		this.cards = new ArrayList<>();
	}
	
	public void generateCards() {
		for (int i = 0; i < CARD_LABELS.length; i++) {
			for(int j = 0; j < CARD_SUITS.length; j++) {
				Suit suit = new Suit(CARD_SUITS[j]);
				String cardLabel = CARD_LABELS[i];
				Card card = new Card(suit, cardLabel);
				cards.add(card);
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
	
	public void printCards() {
		if(cards.isEmpty()) {
			return;
		}
		for(Card c : cards) {
			System.out.println(c);
		}
	}
}
