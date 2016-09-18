package grafik;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class MeinErstesFensterMitFarben extends JFrame {

	/**
	 * Konstruktor
	 */
	public MeinErstesFensterMitFarben() {
		this.setSize(200, 200);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		for (int x = 0; x < 256; x++) { // Rot-Ton
			for (int y = 0; y < 256; y++) { // Grün-Ton
				Color c = new Color(x, y, 0); // Neues Color-Objekt mit
												// jeweiligen Tönen
				g.setColor(c); // Color setzen
				g.drawRect(x, y, 1, 1); // Zeichnen
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MeinErstesFensterMitFarben f = new MeinErstesFensterMitFarben();
	}

}
