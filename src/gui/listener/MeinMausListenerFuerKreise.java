package gui.listener;

import gui.elemente.Kreis;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Maus-Listener zum Zeichnen für Kreise
 * 
 * Kann im übertragenen Sinne als "Pinsel" gedacht werden der Kreise zeichnen
 * kann
 * 
 * @author keinmark
 * 
 */
public class MeinMausListenerFuerKreise extends BasicGrafikEditorMouseListener
		implements MouseListener, MouseMotionListener {

	// Kreis der bei MousePressed initialisiert
	// und der Liste von Grafikobjekten hinzugefügt wird
	Kreis k;
	int radius;

	@Override
	public void mouseClicked(MouseEvent arg0) {
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	/**
	 * Setzen von Koordinate und Radius des Kreises beim Druecken der Maus
	 */
	@Override
	public void mousePressed(MouseEvent event) {
		radius = 10;

		// Koordinaten des Mauszeigers
		int x = event.getX();
		int y = event.getY();

		// Initialisieren der Linie
		k = new Kreis();

		// Setzen von Start und Ende auf die aktuellen Koordinaten
		k.setMitte(x - radius / 2, y - radius / 2);
		k.setRadius(radius);

		// Linie der Liste mit GrafikObjeken hinzufügen
		super.panel.addGrafikObjekt(k);

		// Repaint aufrufen damit die Linie gezeichnet wird
		// indem die Liste mit GrafikObjekten durch-iteriert wird
		super.panel.repaint();

	}

	/**
	 * Setzen von Koordinate und Radius des Kreises beim Loslassen der Maus
	 */
	@Override
	public void mouseReleased(MouseEvent event) {
		// Koordinaten des Mauszeigers
		int x = event.getX();
		int y = event.getY();

		// Aktuelle Koordinaten holen
		int aktX = k.getMitteX();
		int aktY = k.getMitteY();

		// Differenz berechnen für Länge des Radius
		int diffX = x - aktX;
		int diffY = y - aktY;

		// Neuer Radius
		// Berechnung der Distanz vom Mittelpunkt zum aktuellen Punkt
		radius = (int) Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));

		// Radius
		k.setRadius(radius);

		// Repaint aufrufen damit die Linie neu gezeichnet wird
		// indem die Liste mit GrafikObjekten durch-iteriert wird
		super.panel.repaint();
	}

	/**
	 * Setzen von Koordinate und Radius des Kreises beim Ziehen der Maus
	 */
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// Koordinaten des Mauszeigers
		int x = arg0.getX();
		int y = arg0.getY();

		// Aktuelle Koordinaten holen
		int aktX = k.getMitteX();
		int aktY = k.getMitteY();

		// Differenz berechnen für Länge des Radius
		int diffX = x - aktX;
		int diffY = y - aktY;

		// Neuer Radius
		// Berechnung der Distanz vom Mittelpunkt zum aktuellen Punkt
		radius = (int) Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));

		// Radius setzen
		k.setRadius(radius);

		// Repaint aufrufen damit die Linie neu gezeichnet wird
		// indem die Liste mit GrafikObjekten durch-iteriert wird
		super.panel.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
	}

}
