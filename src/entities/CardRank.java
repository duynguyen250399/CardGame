package entities;

import java.util.Map;

public class CardRank {

	public static int getCardRank(String cardLabel) {
		switch (cardLabel) {
		case "3":
			return 0;
		case "4":
			return 4;
		case "5":
			return 8;
		case "6":
			return 12;
		case "7":
			return 16;
		case "8":
			return 20;
		case "9":
			return 24;
		case "10":
			return 28;
		case "J":
			return 32;
		case "Q":
			return 36;
		case "K":
			return 40;
		case "A":
			return 44;
		case "2":
			return 48;
		default:
			return -1;

		}
	}
}
