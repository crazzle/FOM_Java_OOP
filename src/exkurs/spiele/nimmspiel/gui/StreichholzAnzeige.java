package exkurs.spiele.nimmspiel.gui;

import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Zeigt die vorhanden Streichhoelzer an
 * 
 * @author Mark Keinhoerster
 * 
 */
public class StreichholzAnzeige extends JPanel {

	// aktuelle Anzahl der Streichhoelzer
	private Integer anzahl = 0;

	// Startkoordination fuer das erste Streichholz
	int x = 10;
	int y = 10;

	// Abstand zwischen den Hoelzern (minus der x-Koordinate beim Zeichnen)
	int gap = 40;

	// Breite des Streichholzes
	int width = 20;
	int height = 75;

	/**
	 * Konstruktor
	 * 
	 * @param anzahl
	 */
	public StreichholzAnzeige(Integer anzahl) {
		this.anzahl = anzahl;
	}

	/**
	 * Setzt die aktuelle Anzahl der Streichhoelzer und zeichnet das Feld neu
	 * 
	 * @param aktuelleAnzahl
	 */
	public void setAktuelleAnzahl(Integer aktuelleAnzahl) {
		this.anzahl = aktuelleAnzahl;
		repaint();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// Zeichnet die Anzahl an Streichhoelzern
		int x = this.x;
		for (int i = 0; i < anzahl; i++) {
			g.fillRect(x, y, width, height);
			x += gap;
		}
	}
}
