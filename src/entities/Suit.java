package entities;

public class Suit {
	private String name;
	private int rank;
	
	private final String[] SUITS = {
			"SPADE", "CLOVER", "DIAMOND", "HEART"
	};
	
	public Suit(String name) {
		this.name = name;
		
		switch(this.name) {
		case "SPADE":
			this.rank = 0;
			break;
		case "CLOVER":
			this.rank = 1;
			break;
		case "DIAMOND":
			this.rank = 2;
			break;
		case "HEART":
			this.rank = 3;
			break;
		}
	}
	
	
	public String getName() {
		return name;
	}

	public int getRank() {
		return rank;
	}

	
}
