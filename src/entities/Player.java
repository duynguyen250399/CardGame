package entities;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> onHandCards;
	private boolean isWinner;
	
	public final static int TOTAL_CARD = 13;
	
	public Player() {
		onHandCards = new ArrayList<>();
		isWinner = false;
	}
	
	public void throwCards(int numOfCards, List<Card> takingCards) {
		for(Card c : takingCards) {
			this.onHandCards.remove(c);
		}
	}

	public List<Card> getOnHandCards() {
		return onHandCards;
	}

	public boolean isWinner() {
		return isWinner;
	}

	public void setWinner(boolean isWinner) {
		this.isWinner = isWinner;
	}
	
	public void printCardsOnHand() {
		if(this.onHandCards.isEmpty()) {
			System.out.println("Hahaha I win :))");
		}
		else {
			for(Card c : onHandCards) {
				System.out.println(c);
			}
		}
	}
}
