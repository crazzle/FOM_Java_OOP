package exkurs.bitshift.effizienzvergleich.stoppuhr;

/**
 * Beispiellösung der Stoppuhr-Aufgabe
 * 
 * @author keinmark
 * 
 */
public class StoppuhrOhneConverter {
	private long start;
	private long stopp;

	/**
	 * Start-Methode
	 * 
	 * @return
	 */
	public long start() {
		start = System.currentTimeMillis();
		return start;
	}

	/**
	 * Stopp-Methode
	 * 
	 * @return
	 */
	public long stopp() {
		stopp = System.currentTimeMillis();
		return stopp;
	}

	/**
	 * Diese Methode entspricht einem Reset
	 */
	public void init() {
		start = 0;
		stopp = 0;
	}

	/**
	 * Berechnet die Differenz
	 * 
	 * @param einheit
	 * @return
	 */
	public long berechneDifferenz() {
		return stopp - start;
	}
}
