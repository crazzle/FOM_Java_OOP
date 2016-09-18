package gui.listener;

import gui.MeinGrafikEditorPanel;

import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Superklasse für die Maus-Listener unseres Grafikeditors
 * 
 * @author keinmark
 * 
 */
public abstract class BasicGrafikEditorMouseListener implements MouseListener,
		MouseMotionListener {
	protected MeinGrafikEditorPanel panel;

	/**
	 * Setzt das Panel, auf dem wir malen wollen
	 * 
	 * @param panel
	 */
	public void setPanel(MeinGrafikEditorPanel panel) {
		this.panel = panel;
	}

}
