package exceptions;

/**
 * 
 * @author keinmark
 * 
 */
public class ExceptionsTesten {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean fehlerfall = true;
		int zahl = 0;

		while (fehlerfall) { // wird ausgeführt solange keine Zahl > 10
								// eingelesen wurde
			System.out.println("Geben Sie eine Zahl > 10 ein: ");
			try {
				// Versuche eine Zahl > 10 einzulesen
				zahl = ZahlenLeser.leseZahlGroesser10();

				// Hinter dem Einlesen der Zahl: alles gut gegangen
				fehlerfall = false;
			} catch (EingabeFehlerException exc) { // Exception fangen
				// Falls beim Einlesen ein Fehler auftritt
				System.out.println(exc.getMessage());
			}
		}
		// Alles gut gelaufen
		System.out.println("fertig. " + zahl);
	}
}
