package gui;

import gui.listener.MeinMausListenerFuerKreise;
import gui.listener.MeinMausListenerFuerLinien;
import gui.listener.MeinMausListenerFuerPunkte;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Ein Grafikeditor, der Linien und Kreise zeichnen kann
 * 
 * @author keinmark
 * 
 */
public class MeineGui extends JFrame {
	// Buttons
	JButton b1;
	JButton b2;
	JButton b3;

	// Panel fuer die Buttons
	JPanel buttons;

	// Die Leinwand auf der gemalt wird
	MeinGrafikEditorPanel leinwand;

	/**
	 * Konstruktor
	 */
	public MeineGui() {
		// Das Fenster initialisieren
		super("Meine erste GUI");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setLocation(300, 300);
		this.setLayout(new BorderLayout());

		/*
		 * Button-Panel initialisieren
		 */
		buttons = new JPanel();
		buttons.setLayout(new GridLayout(3, 1));

		/*
		 * Buttons
		 */
		b1 = new JButton("Kreis");
		// ActionListener "ListenerSwitchingKreisActionListener" bei b1
		// registrieren
		b1.addActionListener(new ListenerSwitchingKreisActionListener());

		b2 = new JButton("Linie");
		// ActionListener "ListenerSwitchingLinienActionListener" bei b2
		// registrieren
		b2.addActionListener(new ListenerSwitchingLinienActionListener());

		b3 = new JButton("Punkt");
		// ActionListener "ListenerSwitchingLinienActionListener" bei b2
		// registrieren
		b3.addActionListener(new ListenerSwitchingPunktActionListener());

		// Buttons dem button-panel hinzufuegen
		buttons.add(b1);
		buttons.add(b2);
		buttons.add(b3);

		// Leinwand initialisieren
		leinwand = new MeinGrafikEditorPanel();
		leinwand.setBackground(Color.WHITE);

		// Buttons und Leinwand der content-pane hinzufuegen
		this.getContentPane().add(buttons, BorderLayout.WEST);
		this.getContentPane().add(leinwand, BorderLayout.CENTER);

		// Fenster sichtbar machen
		this.setVisible(true);
	}

	/**
	 * Actions-Listener, der bei Klick auf den "Kreis"-Button alle
	 * ActionListener vom JPanel "leinwand" entfernt und den
	 * "MeinMausListenerFuerKreise" registriert.
	 * 
	 * @author keinmark
	 * 
	 */
	class ListenerSwitchingKreisActionListener implements ActionListener {

		/**
		 * Methode wird aufgerufen wenn auf "Kreis" geklickt wird
		 */
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// Bereits registrierte Listener entfernen
			removeOldListener();

			// Listener
			MeinMausListenerFuerKreise meinMausListenerFuerKreise = new MeinMausListenerFuerKreise();
			meinMausListenerFuerKreise.setPanel(MeineGui.this.leinwand);

			// Hinzufuegen
			MeineGui.this.leinwand.addMouseListener(meinMausListenerFuerKreise);
			MeineGui.this.leinwand
					.addMouseMotionListener(meinMausListenerFuerKreise);
		}

		/**
		 * Methode zum entfernen der Listener, die aktuell bei der Leinwand
		 * registriert sind
		 * 
		 * Diese Methode ist doppelt, wohin könnte man sie auslagern, damit sie
		 * nur noch einmal vorhanden ist?
		 */
		private void removeOldListener() {
			for (MouseListener l : MeineGui.this.leinwand.getMouseListeners()) {
				MeineGui.this.leinwand.removeMouseListener(l);
			}

			for (MouseMotionListener l : MeineGui.this.leinwand
					.getMouseMotionListeners()) {
				MeineGui.this.leinwand.removeMouseMotionListener(l);
			}
		}
	}

	/**
	 * Actions-Listener, der bei Klick auf den "Linie"-Button alle
	 * ActionListener vom JPanel "leinwand" entfernt und den
	 * "MeinMausListenerFuerLinien" registriert.
	 * 
	 * @author keinmark
	 * 
	 */
	class ListenerSwitchingLinienActionListener implements ActionListener {

		/**
		 * Methode wird aufgerufen wenn auf "Linie" geklickt wird
		 */
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// Bereits registrierte Listener entfernen
			removeOldListener();

			// Listener
			MeinMausListenerFuerLinien meinMausListenerFuerLinien = new MeinMausListenerFuerLinien();
			meinMausListenerFuerLinien.setPanel(MeineGui.this.leinwand);

			// Hinzufuegen
			MeineGui.this.leinwand.addMouseListener(meinMausListenerFuerLinien);
			MeineGui.this.leinwand
					.addMouseMotionListener(meinMausListenerFuerLinien);
		}

		/**
		 * Methode zum entfernen der Listener, die aktuell bei der Leinwand
		 * registriert sind
		 * 
		 * Diese Methode ist doppelt, wohin könnte man sie auslagern, damit sie
		 * nur noch einmal vorhanden ist?
		 */
		private void removeOldListener() {
			for (MouseListener l : MeineGui.this.leinwand.getMouseListeners()) {
				MeineGui.this.leinwand.removeMouseListener(l);
			}

			for (MouseMotionListener l : MeineGui.this.leinwand
					.getMouseMotionListeners()) {
				MeineGui.this.leinwand.removeMouseMotionListener(l);
			}
		}
	}

	/**
	 * Actions-Listener, der bei Klick auf den "Kreis"-Button alle
	 * ActionListener vom JPanel "leinwand" entfernt und den
	 * "MeinMausListenerFuerKreise" registriert.
	 * 
	 * @author keinmark
	 * 
	 */
	class ListenerSwitchingPunktActionListener implements ActionListener {

		/**
		 * Methode wird aufgerufen wenn auf "Kreis" geklickt wird
		 */
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// Bereits registrierte Listener entfernen
			removeOldListener();

			// Listener
			MeinMausListenerFuerPunkte meinMausListenerFuerPunkte = new MeinMausListenerFuerPunkte();
			meinMausListenerFuerPunkte.setPanel(MeineGui.this.leinwand);

			// Hinzufuegen
			MeineGui.this.leinwand.addMouseListener(meinMausListenerFuerPunkte);
			MeineGui.this.leinwand
					.addMouseMotionListener(meinMausListenerFuerPunkte);
		}

		/**
		 * Methode zum entfernen der Listener, die aktuell bei der Leinwand
		 * registriert sind
		 * 
		 * Diese Methode ist doppelt, wohin könnte man sie auslagern, damit sie
		 * nur noch einmal vorhanden ist?
		 */
		private void removeOldListener() {
			for (MouseListener l : MeineGui.this.leinwand.getMouseListeners()) {
				MeineGui.this.leinwand.removeMouseListener(l);
			}

			for (MouseMotionListener l : MeineGui.this.leinwand
					.getMouseMotionListeners()) {
				MeineGui.this.leinwand.removeMouseMotionListener(l);
			}
		}
	}

	/**
	 * Main-Methode
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		MeineGui gui = new MeineGui();
	}
}
