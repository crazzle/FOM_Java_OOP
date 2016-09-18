package gui.elemente;

import java.awt.Graphics;

/**
 * Linie, die das Interface GrafikObjekt implementiert
 * 
 * @author keinmark
 * 
 */
public class Linie implements GrafikObjekt {

	// Anfangspunkt der Linie
	private int startX = 0;
	private int endeX = 0;

	// Endpunkt der Linie
	private int startY = 0;
	private int endeY = 0;

	/**
	 * Anfangspunkt setzen
	 * 
	 * @param x
	 * @param y
	 */
	public void setStart(int x, int y) {
		startX = x;
		startY = y;
	}

	/**
	 * Endpunkt setzen
	 * 
	 * @param x
	 * @param y
	 */
	public void setEnde(int x, int y) {
		endeX = x;
		endeY = y;
	}

	/**
	 * Zeichnen der Linie
	 */
	@Override
	public void draw(Graphics g) {
		g.drawLine(startX, startY, endeX, endeY);
	}

}
