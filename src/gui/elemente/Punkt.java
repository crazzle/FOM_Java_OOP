package gui.elemente;

import java.awt.Graphics;

/**
 * Kreis, der das Interface GrafikObjekt implementiert
 * 
 * @author keinmark
 * 
 */
public class Punkt implements GrafikObjekt {

    // x koordinate
    private int x = 0;
    private int y = 0;
    private final int size = 8;

    /**
     * Anfangspunkt setzen
     * 
     * @param x
     * @param y
     */
    public void setLocation(int x, int y) {
	this.x = x;
	this.y = y;
    }

    /**
     * Zeichnen des Kreises
     */
    @Override
    public void draw(Graphics g) {
	g.fillOval(x, y, size, size);
    }
}
