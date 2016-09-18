package oop.aufgaben.auto;

/**
 * Unser Kombi
 * 
 * @author keinmark
 * 
 */
public class Kombi extends Auto {

	private int kofferRaumVolumen;

	/**
	 * Konstruktor
	 * 
	 * @param baujahrParameter
	 * @param identifizierungParameter
	 * @param volumen
	 */
	public Kombi(int baujahrParameter, int identifizierungParameter, int volumen) {

		// Aufruf des Konstruktors aus der Vaterklasse
		super(baujahrParameter, identifizierungParameter);

		this.kofferRaumVolumen = volumen;
	}

	/**
	 * Konstruktor
	 * 
	 * @param baujahrParameter
	 * @param hersteller
	 * @param identifizierungParameter
	 * @param volumen
	 */
	public Kombi(int baujahrParameter, String hersteller,
			int identifizierungParameter, int volumen) {

		// Aufruf des Konstruktors aus der Vaterklasse
		super(baujahrParameter, hersteller, identifizierungParameter);

		this.kofferRaumVolumen = volumen;
	}

	/**
	 * Methode zum setzen des Kofferraumvolumens
	 * 
	 * @param volumen
	 */
	public void setKofferRaumVolumen(int volumen) {
		this.kofferRaumVolumen = volumen;
	}

	/**
	 * Gibt das Kofferraumvolumen zurück
	 * 
	 * @return
	 */
	public int getKofferRaumVolumen() {
		return this.kofferRaumVolumen;
	}

	/**
	 * Wir überschreiben die Methode zeigeDaten
	 */
	@Override
	public void zeigeDaten() {
		System.out.println("Baujahr: " + this.getBaujahr() + ", Hersteller: "
				+ this.getHersteller() + ", Identifikationsnummer: "
				+ this.getIdentifikationnummer() + ", Kofferraumvolumen: "
				+ this.getKofferRaumVolumen());
	}
}
