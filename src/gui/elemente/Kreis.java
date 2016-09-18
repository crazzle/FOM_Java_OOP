package gui.elemente;

import java.awt.Graphics;

/**
 * Kreis, der das Interface GrafikObjekt implementiert
 * 
 * @author keinmark
 * 
 */
public class Kreis implements GrafikObjekt {

    // Anfangspunkt der Linie
    private int mitteX = 0;
    private int mitteY = 0;

    // Radius
    private int radius = 0;

    /**
     * Anfangspunkt setzen
     * 
     * @param x
     * @param y
     */
    public void setMitte(int x, int y) {
	mitteX = x;
	mitteY = y;
    }

    /**
     * Radius setzen
     * 
     * @param x
     */
    public void setRadius(int x) {
	radius = x;
    }

    /**
     * Gibt mitteX zurück
     * 
     * @return
     */
    public int getMitteX() {
	return mitteX;
    }

    /**
     * Gibt mitteY zurück
     * 
     * @return
     */
    public int getMitteY() {
	return mitteY;
    }

    /**
     * Zeichnen des Kreises
     */
    @Override
    public void draw(Graphics g) {
	g.drawOval(mitteX, mitteY, radius, radius);
    }

}
