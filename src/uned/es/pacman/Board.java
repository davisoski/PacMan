package uned.es.pacman;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import uned.es.pacman.controller.TecladoController;

/**
 * 
 * @author david
 * 
 */
@SuppressWarnings("serial")
public class Board extends JPanel {

	private Image pacman;
	private Image blinky, pinky, inky, clyde;
	// Cuando se come uno de los puntos grandes, los fantamas se vuelven azules
	private Image blinky_blue, pinky_blue, inky_blue, clyde_blue;

	TecladoController entradasTeclado;

	int xPacman = 0;
	int yPacman = 0;

	private Timer timer = new Timer();

	public Board() {

		// Cargo las imagenes de los dibujos
		loadImages();

		// Activo el controlador para el teclado
		addKeyListener();

		// Activo el doble buffer
		setDoubleBuffered(true);

		// Aniado el controlador para el sonido
		// sonido();

	}

	private void addKeyListener() {
		entradasTeclado = new TecladoController();
		this.addKeyListener(entradasTeclado);
		setFocusable(true);

	}

	private void sonido() {
		// Open an input stream to the audio file.
		InputStream in = null;
		try {
			in = new FileInputStream("sonidos/gameover.wav");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Create an AudioStream object from the input stream.
		AudioStream as = null;
		try {
			as = new AudioStream(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Use the static class member "player" from class AudioPlayer to play
		// clip.
		AudioPlayer.player.start(as);
		// Similarly, to stop the audio.
		// AudioPlayer.player.stop(as);

	}

	/**
	 * Leo los ficheros con las imagenes de los elementos que pululan por el
	 * laberinto
	 */
	private void loadImages() {
		pacman = new ImageIcon("images/pacman.png").getImage();
		blinky = new ImageIcon("images/blinky.png").getImage();
		pinky = new ImageIcon("images/pinky.png").getImage();
		inky = new ImageIcon("images/inky.png").getImage();
		clyde = new ImageIcon("images/clyde.png").getImage();
		blinky_blue = new ImageIcon("images/blinky_blue.png").getImage();
		pinky_blue = new ImageIcon("images/pinky_blue.png").getImage();
		inky_blue = new ImageIcon("images/inky_blue.png").getImage();
		clyde_blue = new ImageIcon("images/clyde_blue.png").getImage();
	}

	/**
	 * Este metodo se dispara siempre que se minimiza, maximiza, se cierra, se
	 * abre la ventana, etc...
	 */
	@Override
	public void paint(Graphics g) {
		System.out.println("paint");
		super.paint(g);

		Graphics2D g2d = (Graphics2D) g;

		drawPacman(g2d);
	}

	private void drawPacman(Graphics2D g2d) {
		System.out.println("drawPacman");
		g2d.drawImage(pacman, xPacman, yPacman, this);

		g2d.drawImage(blinky, 0, 50, this);
		g2d.drawImage(pinky, 0, 100, this);
		g2d.drawImage(inky, 0, 150, this);
		g2d.drawImage(clyde, 0, 200, this);

	}

	public void moveBall() {
		System.out.println("moveBall");

		xPacman = xPacman + 10;
		yPacman = yPacman + 10;
	}

}
