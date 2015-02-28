package uned.es.game.maze;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Tablero extends JPanel implements ActionListener {

	private Timer timer;

	private Map m;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Tablero() {

		m = new Map();

		
		// Activo el doble buffer
		setDoubleBuffered(true);
		timer = new Timer(25, this);
		// timer.start();
	}

	public void actionPerformed(ActionEvent arg0) {
		repaint();
	}

	/**
	 * Este metodo se activa cada vez que se pinta la pantalla, se minimiza, se
	 * cambia de tamanio, etc..
	 * 
	 * 0 Para una celda vacía. 1 Para un punto pequeño. 2 Para un punto grande.
	 * 3 Para la pared. “
	 */
	public void paint(Graphics g) {
		super.paint(g);
		if (m != null) {
			for (int y = 0; y < 27; y++) {
				for (int x = 0; x < 29; x++) {

					if (m.getMap(x, y).equals("0")) {
						g.drawImage(m.getCeldaVacia(), x * 16, y * 16, null);
					}
					if (m.getMap(x, y).equals("1")) {
						g.drawImage(m.getDot(), x * 16, y * 16, null);
					}
					if (m.getMap(x, y).equals("2")) {
						g.drawImage(m.getPowerPellet(), x * 16, y * 16, null);
					}
					if (m.getMap(x, y).equals("3")) {
						g.drawImage(m.getPared(), x * 16, y * 16, null);
					}
				}
			}
		} else {
			System.out.println("m == null");
		}
	}
}
