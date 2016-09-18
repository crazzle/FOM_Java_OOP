package exkurs.spiele.nimmspiel.gui;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Spielinstanz, die die Spiellogik beeinhaltet
 * 
 * @author Mark Keinhoerster
 * 
 */
public class SpielInstanz {
	/**
	 * Nutzt eine Queue, eine Datenstruktur die
	 */
	Spieler[] spieler = new Spieler[2];
	Integer anzahl = 0;
	Boolean sieg = false;

	// zaehlt, der wie vielte Spieler hinzugefuegt wurde
	Integer tempSpielerAnzahl = 0;

	// Der aktuelle Spieler, der gerade am Zug ist
	Spieler aktuellerSpieler = null;

	/**
	 * Konstruktor
	 * 
	 * @param anzahl
	 */
	public SpielInstanz(int anzahl) {
		this.anzahl = anzahl;
	}

	/**
	 * Fuegt einen Spieler hinzu
	 * 
	 * @param s
	 */
	public void addSpieler(Spieler s) {
		if (tempSpielerAnzahl < spieler.length) {
			spieler[tempSpielerAnzahl] = s;
			++tempSpielerAnzahl;
			aktuellerSpieler = s;
		}
	}

	/**
	 * Logik die einen Zug repräsentiert
	 * 
	 * @param zugZahl
	 */
	public void ziehen(int zugZahl) {
		anzahl -= zugZahl;
		if (anzahl == 0) {
			sieg = true;
		} else {
			wechselSpieler();
		}
	}

	/**
	 * Wechselt den Spieler
	 */
	private void wechselSpieler() {
		if (aktuellerSpieler.equals(spieler[0])) {
			aktuellerSpieler = spieler[1];
		} else {
			aktuellerSpieler = spieler[0];
		}
	}

	/**
	 * Git die aktuelle Anzahl der noch vorhanden Hoelzer zurueck
	 * 
	 * @return
	 */
	public Integer getAktuelleAnzahl() {
		return anzahl;
	}

	/**
	 * Gibt den aktuellen Spieler zurueck
	 * 
	 * @return
	 */
	public Spieler getAktuellerSpieler() {
		return aktuellerSpieler;
	}

	/**
	 * Gibt zurueck ob gesiegt wurde
	 * 
	 * @return
	 */
	public Boolean hatGewonnen() {
		return sieg;
	}

	/**
	 * Prueft ob ein Zug valide ist
	 * 
	 * @param anzahl
	 * @return
	 */
	public Boolean zugValide(int anzahl) {
		if (this.anzahl - anzahl < 0) {
			return false;
		}
		return true;
	}
}
