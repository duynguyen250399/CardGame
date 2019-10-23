package game;

import javax.swing.JFrame;

public class GameScreen extends JFrame{
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	
	public GameScreen() {
		this.setTitle("Card Game v1.0");
		this.setSize(WIDTH, HEIGHT);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
}
