/**
 * 
 */
package uned.es.pacman;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * @author DAVID HERNANDEZ GUTIERREZ - 45.438.268-C
 *
 */
public class PacMan extends JFrame {

	/**
	 * Constructor
	 */
	public PacMan() {
		System.out.println("PacMan Constructor Inicio");

		add(new Board());
		this.setTitle("Pacman - 45.438.268-C");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(new Dimension(500, 500));
		this.setLocationRelativeTo(null);
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(new GamePanel());
		this.setVisible(true);
		System.out.println("PacMan Constructor Fin");
	}

	public class GamePanel extends JPanel {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				new PacMan();
			}
		});
	}

}
