package gui.listener;

import gui.elemente.Punkt;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Maus-Listener zum Zeichnen für Linien
 * 
 * Kann im übertragenen Sinne als "Pinsel" gedacht werden der Linien zeichnen
 * kann
 * 
 * @author keinmark
 * 
 */
public class MeinMausListenerFuerPunkte extends BasicGrafikEditorMouseListener
	implements MouseListener, MouseMotionListener {

    // Linie die bei MousePressed initialisiert
    // und der Liste von Grafikobjekten hinzugefügt wird
    Punkt p;

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
     * Initiliasiert eine neue Linie und fügt sie der Liste "zuZeichnen" hinzu
     */
    @Override
    public void mousePressed(MouseEvent event) {
	// Koordinaten des Mauszeigers
	int x = event.getX();
	int y = event.getY();

	// Initialisieren der Linie
	p = new Punkt();

	// Setzen von Start und Ende auf die aktuellen Koordinaten
	p.setLocation(x, y);

	// Linie der Liste mit GrafikObjeken hinzufügen
	super.panel.addGrafikObjekt(p);

	// Repaint aufrufen damit die Linie gezeichnet wird
	// indem die Liste mit GrafikObjekten durch-iteriert wird
	super.panel.repaint();

    }

    /**
     * Setzen der Koordinaten des Linienendes
     */
    @Override
    public void mouseReleased(MouseEvent event) {
	// Koordinaten des Mauszeigers
	int x = event.getX();
	int y = event.getY();

	// Ende der Linie setzen
	p.setLocation(x, y);

	// Repaint aufrufen damit die Linie neu gezeichnet wird
	// indem die Liste mit GrafikObjekten durch-iteriert wird
	super.panel.repaint();
    }

    /**
     * Setzen der Koordinaten des Linienendes während des Ziehens der Maus
     */
    @Override
    public void mouseDragged(MouseEvent arg0) {
	// Koordinaten des Mauszeigers
	int x = arg0.getX();
	int y = arg0.getY();

	// Ende der Linie setzen
	p.setLocation(x, y);

	// Repaint aufrufen damit die Linie neu gezeichnet wird
	// indem die Liste mit GrafikObjekten durch-iteriert wird
	super.panel.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent arg0) {
    }

}
