package uned.es.pacman;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class PacMan extends JFrame {

	private static final long serialVersionUID = 1L;

	// Constructor
	public PacMan() {

		Board board = new Board();

		// Realmente el codigo seria jFrame.add(board), pero al extender de
		// JFrame llamo a los metodos directamente
		add(board);
		this.setTitle("Pacman");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Centramos y fijamos el tamanio
		setResizable(false);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(screenSize.width / 2 - getWidth() / 2, screenSize.height
				/ 5 - getHeight() / 5);
		setLocationRelativeTo(null);
		setVisible(true); // Para acabar, hacer visible la ventana.

		// board.moveBall();
		// board.repaint();

	}

	public static void main(String args[]) throws InterruptedException {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new PacMan();
			}
		});
	}
}