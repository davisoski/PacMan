package uned.es.game.maze;

import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.ImageIcon;

public class Map {

	private static final String ruta = "C://google-drive//eclipse-proyectos//Maze//images//uned//";
	private Scanner m;

	private String Map[] = new String[29];


	private Image celdaVacia,celdaAbierta, pared, dot, powerPellet;

	public Map() {

		System.out.println("Map()");


		ImageIcon  img = new ImageIcon(ruta + "celda-vacia.png");
		celdaVacia = img.getImage();
		img = new ImageIcon(ruta + "celda-abierta.png");
		celdaAbierta = img.getImage();
		img = new ImageIcon(ruta + "pared.png");
		pared = img.getImage();

		// Puntos y Power Pellets (Punto grande)
		img = new ImageIcon(ruta + "punto.png");
		dot = img.getImage();
		img = new ImageIcon(ruta + "power-pellet.png");
		powerPellet = img.getImage();


		openFile();
		readFile();
		closeFile();

	}

	

	public void openFile() {
		try {
			m = new Scanner(
					new File(
							"C://google-drive//eclipse-proyectos//Maze//src//resources//mapa.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("error cargando el mapa");
		}
		System.out.println("Mapa Cargado");
	}

	public void readFile() {

		System.out.println("readFile()");
		while (m.hasNext()) {

			for (int i = 0; i < 29; i++) {
				Map[i] = m.next();
			}
		}
	}

	public void closeFile() {
		m.close();
	}

	public Image getPowerPellet() {
		return powerPellet;
	}
	
	public Image getCeldaVacia() {
		return celdaVacia;
	}

	public Image getPared() {
		return pared;
	}

	public Image getDot() {
		return dot;
	}
	public Image getCeldaAbierta() {
		return celdaAbierta;
	}


	public String getMap(int x, int y) {
		String index = Map[y].substring(x, x + 1);
		return index;
	}

}
