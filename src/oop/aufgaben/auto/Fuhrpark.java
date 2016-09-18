package oop.aufgaben.auto;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Unser Fuhrpark aus Aufgabe 3
 * 
 * @author keinmark
 * 
 */
public class Fuhrpark {
	/**
	 * Unser FuhrparkArray, das die Autos hält
	 */
	private Auto[] fuhrparkArray;

	/**
	 * Ein Zähler, der schaut wie viele Autos zurzeit im Fuhrpark sind
	 */
	private int anzahlAutosImFuhrpark = 0;

	/**
	 * Konstruktor mit der Größe des Fuhrparks als Parameter
	 * 
	 * @param groesse
	 */
	public Fuhrpark(int groesse) {
		fuhrparkArray = new Auto[groesse];
	}

	/**
	 * Methode zum aufnehmen neuer Autos, wenn im Fuhrpark noch Platz ist
	 * 
	 * @param neuesAuto
	 */
	public void aufnehmen(Auto neuesAuto) {
		if (anzahlAutosImFuhrpark < fuhrparkArray.length) { // Ist im Fuhrpark
															// noch Platz?
			fuhrparkArray[anzahlAutosImFuhrpark] = neuesAuto;
			anzahlAutosImFuhrpark++; // Anzahl der Autos erhöhen
		}
	}

	/**
	 * Methode, die das älteste Auto im Fuhrpark sucht
	 * 
	 * @return
	 */
	public Auto sucheAltesAuto() {
		Auto altesAuto = fuhrparkArray[0]; // Altes Auto ist zunächst das erste
											// Auto im Fuhrpark
		for (int i = 0; i < anzahlAutosImFuhrpark; i++) {
			// Auto an der aktuellen Stelle
			Auto autoImFuhrpark = fuhrparkArray[i];

			// Vergleiche das alteAuto mit dem auto an der aktuellen Stelle
			if (altesAuto.getBaujahr() > autoImFuhrpark.getBaujahr()) {

				// Ist das Auto an der aktuellen Stelle älter, wird
				// altes Auto auf das aktuelle Auto im Fuhrpark gesetzt
				altesAuto = autoImFuhrpark;
			}
		}

		// zurückgegeben wird das alteAuto
		return altesAuto;
	}

	/**
	 * Methode die das durchschnittliche Alter aus den Autos im Fuhrpark
	 * berechnet
	 * 
	 * @return
	 */
	public double berechneFlottenAlter() {
		// Das summierte Alter ist zunächst 0
		int summiertesAlter = 0;

		// Das FlottenAlter ist zunächst 0
		double flottenAlter = 0.0;

		// Wenn wir Autos im Fuhrpark haben
		if (anzahlAutosImFuhrpark > 0) {

			// Aufsummieren des Alters aller Autos im Fuhrpark
			for (int i = 0; i < anzahlAutosImFuhrpark; i++) {
				// Auto im Fuhrpark an der Stelle i
				Auto autoImFuhrpark = fuhrparkArray[i];

				// Das alter des aktuellen Autos ermitteln
				// GregorianCalendar.getInstance().getCalendar.YEAR)
				// liefert das aktuelle Jahr zurück
				int alterInJahre = GregorianCalendar.getInstance().get(
						Calendar.YEAR)
						- autoImFuhrpark.getBaujahr();

				// addieren des Alters des aktuellen Autos auf die Gesamtsumme
				summiertesAlter = summiertesAlter + alterInJahre;
			}

			// Berechnen des Durchscnitts
			flottenAlter = summiertesAlter / anzahlAutosImFuhrpark;
		}

		// Das Flottenalter zurückliefern
		return flottenAlter;
	}

	/**
	 * Methode zum anzeigen der Daten der einzelnen Autos im Fuhrpark
	 */
	public void zeigeInventurListe() {
		for (int i = 0; i < anzahlAutosImFuhrpark; i++) {
			Auto autoImFuhrpark = fuhrparkArray[i];
			autoImFuhrpark.zeigeDaten();
		}
	}
}
