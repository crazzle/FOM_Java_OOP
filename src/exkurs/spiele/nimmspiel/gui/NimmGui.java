package exkurs.spiele.nimmspiel.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

/**
 * Das Nimm-Spiel
 * 
 * @author Mark Keinhoerster
 * 
 */
public class NimmGui extends JFrame {

	// Der Spielfluss
	private String[] zugZahl = { "1 Streichholz", "2 Streichhoelzer",
			"3 Streichhoelzer" };
	/*
	 * Der Konstruktor JCombobox bekommt ein Array von Strings uebergeben. Jeder
	 * String steht fuer eine Auswahloption der Box.
	 */
	private JComboBox auswahl = new JComboBox(zugZahl);
	private JButton ziehen = new JButton("Ziehen!");

	// Anzeige des aktuellen Status‚
	StreichholzAnzeige streichholzpanel = null;
	JLabel aktuellerSpieler = null;
	JLabel nachricht = null;

	// Die eigentliche Spiellogik‚
	SpielInstanz spiel = null;
	Integer anzahl = 10;

	public NimmGui() {
		// Fensteroptionen
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Nimmspiel");
		setSize(400, 200);
		getContentPane().setLayout(new BorderLayout());

		// Spiel initialisieren
		spiel = new SpielInstanz(anzahl);
		spiel.addSpieler(new Spieler("Spieler 2"));
		spiel.addSpieler(new Spieler("Spieler 1"));

		// Die Streichhoelzer
		streichholzpanel = new StreichholzAnzeige(spiel.getAktuelleAnzahl());
		getContentPane().add(streichholzpanel, BorderLayout.CENTER);

		// Anzeige des Spielstatus und der Buttons
		JPanel auswahlpanel = new JPanel();
		auswahlpanel.setLayout(new GridLayout(3, 2));

		// Aktueller Spieler‚
		auswahlpanel.add(new JLabel("Spieler: "));
		aktuellerSpieler = new JLabel(spiel.getAktuellerSpieler().getName());
		auswahlpanel.add(aktuellerSpieler);

		// Aktueller stand des Spiels
		auswahlpanel.add(new JLabel("Nachricht: "));
		nachricht = new JLabel("Spiel läuft.");
		nachricht.setForeground(Color.black);
		auswahlpanel.add(nachricht);

		// Kontrollelemente
		auswahlpanel.add(auswahl);
		auswahlpanel.add(ziehen);
		ziehen.addActionListener(new ZugButtonListener());
		getContentPane().add(auswahlpanel, BorderLayout.SOUTH);
	}

	/**
	 * Button-Listener, der auf einen Zug reagiert
	 * 
	 * @author Mark Keinhoerster
	 * 
	 */
	class ZugButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// Ermittelt die Zahl der zu ziehenden Streichhoelzer aus der
			// Combo-Box. Der Index beginnt bei 0, daher auf den selektierten
			// Index +1;
			int zugZahl = auswahl.getSelectedIndex() + 1;

			if (spiel.zugValide(zugZahl)) {
				// Wenn die zu ziehende Zahl valide ist, darf gezogen werden
				spiel.ziehen(zugZahl);
				if (!spiel.hatGewonnen()) {
					// Wenn der Spieler nicht gewonnen hat, wird das Spielfeld
					// entsprechend aktualisiert
					aktualisiereSpielfeld();
				} else {
					// Ein Sieg muss entsprechend ausgegeben werden
					verarbeiteSieg();
				}
			} else {
				// Benachrichtigt bei einem invaliden Zug
				verarbeiteInvalidenZug();
			}
		}

		/**
		 * Setze die Nachricht
		 */
		private void verarbeiteInvalidenZug() {
			nachricht.setText("Nicht genug Hölzer!");
			nachricht.setForeground(Color.red);
		}

		/**
		 * Setzte Nachricht und deaktiviere Buttons
		 */
		private void verarbeiteSieg() {
			nachricht.setText("Spieler "
					+ spiel.getAktuellerSpieler().getName() + " hat gewonnen.");
			nachricht.setForeground(Color.green);
			ziehen.setEnabled(false);
			auswahl.setEnabled(false);
		}

		/**
		 * Aktualisiere Spielfed mit neuen Informationen aus der Spielinstanz
		 */
		private void aktualisiereSpielfeld() {
			aktuellerSpieler.setText(spiel.getAktuellerSpieler().getName());
			streichholzpanel.setAktuelleAnzahl(spiel.getAktuelleAnzahl());
			streichholzpanel.repaint();
			nachricht.setText("Spiel läuft.");
			nachricht.setForeground(Color.black);
		}
	}

	public static void main(String[] args) {
		NimmGui gui = new NimmGui();
		gui.setVisible(true);
	}
}
