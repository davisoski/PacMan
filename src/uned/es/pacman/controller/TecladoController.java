package uned.es.pacman.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Controlador para detectar las entradas desde el teclado
 * 
 * @author david
 * 
 */
public class TecladoController implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("TecladoController.keyTyped");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("TecladoController.keyPressed");

		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT) {
			System.out.println("VK_LEFT");
		}
		if (key == KeyEvent.VK_RIGHT) {
			System.out.println("VK_RIGHT");
		}
		if (key == KeyEvent.VK_UP) {
			System.out.println("VK_UP");
		}
		if (key == KeyEvent.VK_DOWN) {
			System.out.println("VK_DOWN");
		}

		switch (key) {
		case 32:
			System.out.println("TAB.PAUSA");
			break;
		}

		System.out.println("TecladoController.keyPressed: " + key);

	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("TecladoController.keyReleased");
	}
	
	

}
