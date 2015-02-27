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
	
	private KeyEvent keyEvent;
	
	

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("TecladoController.keyTyped");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("TecladoController.keyPressed");

		int keyCode = e.getKeyCode();
		keyEvent = e;

		if (keyCode == KeyEvent.VK_LEFT) {
			System.out.println("VK_LEFT");
		}
		if (keyCode == KeyEvent.VK_RIGHT) {
			System.out.println("VK_RIGHT");
		}
		if (keyCode == KeyEvent.VK_UP) {
			System.out.println("VK_UP");
		}
		if (keyCode == KeyEvent.VK_DOWN) {
			System.out.println("VK_DOWN");
		}

		switch (keyCode) {
		case 32:
			System.out.println("TAB.PAUSA");
			break;
		}

		System.out.println("TecladoController.keyPressed: " + keyCode);
		
	

	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("TecladoController.keyReleased");
	}

	public KeyEvent getKeyEvent() {
		return keyEvent;
	}
	

}
