package game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JPanel;

import entities.Card;
import entities.Deck;
import entities.Player;

public class GameBoard extends JPanel{
	
	private List<Player> players;
	private Deck deck;
	private Map<String, BufferedImage> cardImages;
	
	public GameBoard(int numOfPlayer) {		
		this.setSize(800, 600);
		
		cardImages = AssetLoader.loadCardAsset();
		
		deck = new Deck();
		deck.generateCards();
		deck.setCardImages(cardImages);
		deck.shuffle();		
		
		players = new ArrayList<Player>();
		
		for (int i = 0; i < numOfPlayer; i++) {
			players.add(new Player());
		}
		
		if(!players.isEmpty()) {
			deck.distribute(players);
		}
		
	
	}
	
	@Override
	public void paint(Graphics g) {
		Player p = this.players.get(0);
		List<Card> playerCards = p.getOnHandCards();
		int offset = 203;
		int y = 600 - 84 - 50;
		
		g.drawImage(playerCards.get(0).getImage(), offset, y, 62, 84, null);
		
		for(int i = 1; i < playerCards.size(); i++) {
			BufferedImage img = playerCards.get(i).getImage();
			g.drawImage(img, 31 * i + offset, y, 62, 84, null);
		}
	}
	
}
