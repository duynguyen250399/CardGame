package entities;

import java.awt.image.BufferedImage;

import game.AssetLoader;

public class Card {
	private Suit suit;
	private int rank;
	private String label;
	private boolean isFaceUp;
	private BufferedImage image;
	
	public Card(Suit suit, String label) {
		this.suit = suit;
		this.label = label;
		this.rank = this.suit.getRank() + CardRank.getCardRank(this.label);
		this.isFaceUp = false;		
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public boolean isFaceUp() {
		return isFaceUp;
	}

	public void setFaceUp(boolean isFaceUp) {
		this.isFaceUp = isFaceUp;
	}
	
	public BufferedImage getImage() {
		return image;
	}	

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	@Override
	public String toString() {
		String details = this.label + " - " + this.suit.getName()
						+ " - rank: " + this.rank 
						+ " - isFaceUp: " + this.isFaceUp;
		
		return details;
	}
}
