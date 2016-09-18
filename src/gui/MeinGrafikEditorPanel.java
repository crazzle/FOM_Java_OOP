package gui;

import gui.elemente.GrafikObjekt;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

/**
 * Unsere Leinwand die die ihr hinzugefuegten Grafikobjekte anzeigt
 * 
 * @author keinmark
 * 
 */
public class MeinGrafikEditorPanel extends JPanel {

	/**
	 * Liste die alle zu zeichnenden Grafikobjekte enthält
	 */
	ArrayList<GrafikObjekt> zuZeichnen = new ArrayList<GrafikObjekt>();

	/**
	 * Fügt unserer Liste eine GrafikObjekt hinzu
	 * 
	 * @param objekt
	 */
	public void addGrafikObjekt(GrafikObjekt objekt) {
		this.zuZeichnen.add(objekt);
	}

	/**
	 * Die Methode Paint zeichnet alle Grafikobjekte in der Liste "zuZeichnen"
	 */
	@Override
	public void paint(Graphics g) {
		// Aufruf von super.paint(g) löscht bei einem Repaint das bisher
		// gezeichnete
		super.paint(g);

		// Zeichnen der Grafikobjekte in der Liste
		for (GrafikObjekt objekt : zuZeichnen) {
			objekt.draw(g);
		}
	}
}
