package exceptions;

import tastatur.Tastatur;

/**
 * Unser Zahlenleser
 * 
 * @author keinmark
 * 
 */
public class ZahlenLeser {

	/**
	 * Liest Zahlen > 10 ein und gibt Sie zurück. Ist die eingelesene Zahl < 10
	 * wird eine EingabeFehlerException geworfen
	 * 
	 * @return
	 * @throws EingabeFehlerException
	 */
	public static int leseZahlGroesser10() throws EingabeFehlerException {
		// Einlesen
		int zahl = Tastatur.readInteger();

		// Zahl prüfen
		if (zahl <= 10) {
			throw new EingabeFehlerException(); // werfen der Exception
		}

		return zahl;
	}

}
