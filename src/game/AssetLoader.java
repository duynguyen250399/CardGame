package game;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import entities.Deck;

public class AssetLoader {
	public static Map<String, BufferedImage> loadCardAsset(){
		Map<String, BufferedImage> images = new HashMap<>();
		
		try {
			for (int i = 0; i < Deck.CARD_LABELS.length; i++) {
				for (int j = 0; j < Deck.CARD_SUITS.length; j++) {
					String path = "/asset/" 
								+ Deck.CARD_LABELS[i] + "_"
								+ Deck.CARD_SUITS[j].toLowerCase()
								+ ".png";
					BufferedImage cardImg = ImageIO.read(AssetLoader.class.getResource(path));
					images.put(Deck.CARD_LABELS[i] + "_" + Deck.CARD_SUITS[j], cardImg);
				}
			}
		}
		catch(IOException ex) {
			System.err.println("Error while loading image!");
		}
		
		
		return images;
	}
}
