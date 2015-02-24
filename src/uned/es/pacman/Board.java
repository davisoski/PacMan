package uned.es.pacman;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Board extends JPanel{
	
	public void paint(Graphics g) {
		
		super.paint(g);
		
		System.out.println("Board.paint");
		
	}

	public Board() {
		System.out.println("Board.constructor"); 
	}

}
