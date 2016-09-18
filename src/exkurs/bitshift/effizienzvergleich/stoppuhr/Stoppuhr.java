package exkurs.bitshift.effizienzvergleich.stoppuhr;

import exkurs.bitshift.effizienzvergleich.stoppuhr.converter.IFavorisierteEinheitConverter;
import exkurs.bitshift.effizienzvergleich.stoppuhr.converter.MinutenConverterImpl;
import exkurs.bitshift.effizienzvergleich.stoppuhr.converter.SekundenConverterImpl;

/**
 * Beispiellösung der Stoppuhr-Aufgabe
 * 
 * @author keinmark
 * 
 */
public class Stoppuhr {
	private long start;
	private long stopp;

	/**
	 * Eine anonyme Klasse, die das IFavorisierteEinheitConverter-Interface
	 * implementiert
	 */
	/**
	 * Standard-Konverter, er verändert die Zeiteinheit nicht
	 */
	IFavorisierteEinheitConverter defaultConverter = new IFavorisierteEinheitConverter() {
		@Override
		public float convert(long t) {
			return t;
		}
	};

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
	 * Berechnet die Differenz mit dem Standard-Converter
	 * 
	 * @return
	 */
	public float berechneDifferenz() {
		return berechneDifferenz(defaultConverter);
	}

	/**
	 * Berechnet die Differenz mit einem bestimmten Konverter
	 * 
	 * @param einheit
	 * @return
	 */
	public float berechneDifferenz(IFavorisierteEinheitConverter einheit) {
		return einheit.convert(stopp - start);
	}

	/**
	 * Just for testing
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		Stoppuhr s = new Stoppuhr();
		s.start();
		Thread.sleep(5000);
		s.stopp();

		System.out.println("Differenz in Millis: " + s.berechneDifferenz());

		IFavorisierteEinheitConverter convSek = new SekundenConverterImpl();
		System.out.println("Differenz in Sekunden: "
				+ s.berechneDifferenz(convSek));

		IFavorisierteEinheitConverter convMin = new MinutenConverterImpl();
		System.out.println("Differenz in Minuten: "
				+ s.berechneDifferenz(convMin));
	}
}
