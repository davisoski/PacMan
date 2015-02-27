package uned.es.pacman.model;

import java.awt.event.KeyEvent;

/**
 * 
 * @author david
 * 
 */

public class PacMan implements Caracter {

	// Posicion eje x
	private int x;
	// Posicion eje y
	private int y;

	private int dx;
	private int dy;

	// Es visible en pantalla o no
	private boolean visible;

	public void move() {
		System.out.println("move");
		x += dx;
		y += dy;
	}

	@Override
	public void moveUp() {
		System.out.println("moveUp()");
	}

	@Override
	public void moveDown() {
		System.out.println("moveDown()");
	}

	@Override
	public void moveLeft() {
		System.out.println("moveLeft()");
	}

	@Override
	public void moveRight() {
		System.out.println("moveRight()");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public int getDx() {
		return dx;
	}

	public void setDx(int dx) {
		this.dx = dx;
	}

	public int getDy() {
		return dy;
	}

	public void setDy(int dy) {
		this.dy = dy;
	}

	public void KeyPressed(KeyEvent e) {
		System.out.println("practica.pacman.KeyPressed");
		int keycode = e.getKeyCode();

		if (keycode == KeyEvent.VK_LEFT) {
			System.out.println("LEFT");
			dx = -1;
		}
		if (keycode == KeyEvent.VK_RIGHT) {
			dx = 1;
			System.out.println("RIGHT");
		}
		if (keycode == KeyEvent.VK_UP) {
			dy = -1;
			System.out.println("UP");
		}
		if (keycode == KeyEvent.VK_DOWN) {
			dy = 1;
			System.out.println("DOWN");
		}

		switch (keycode) {
		case 32:
			System.out.println("TAB.PAUSA");
			break;
		}
	}

	public void KeyReleased(KeyEvent e) {
		System.out.println("practica.pacman.keyReleased");
		int keycode = e.getKeyCode();

		if (keycode == KeyEvent.VK_LEFT) {
			System.out.println("LEFT");
			dx = 0;
		}
		if (keycode == KeyEvent.VK_RIGHT) {
			dx = 0;
			System.out.println("RIGHT");
		}
		if (keycode == KeyEvent.VK_UP) {
			dy = 0;
			System.out.println("UP");
		}
		if (keycode == KeyEvent.VK_DOWN) {
			dy = 0;
			System.out.println("DOWN");
		}

		switch (keycode) {
		case 32:
			System.out.println("TAB.PAUSA");
			break;
		}
	}

}
