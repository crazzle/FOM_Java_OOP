package oop.aufgaben.auto;

/**
 * Unser Sportwagen
 * 
 * @author keinmark
 * 
 */
public class Sportwagen extends Auto {

	private int hoechstGeschwindigkeit;

	/**
	 * Konstruktor
	 * 
	 * @param baujahrParameter
	 * @param identifizierungParameter
	 * @param hoechstGeschwindigkeitParameter
	 */
	public Sportwagen(int baujahrParameter, int identifizierungParameter,
			int hoechstGeschwindigkeitParameter) {

		// Aufruf des Konstruktors aus der Vaterklasse
		super(baujahrParameter, identifizierungParameter);

		this.hoechstGeschwindigkeit = hoechstGeschwindigkeitParameter;
	}

	/**
	 * Konstruktor
	 * 
	 * @param baujahrParameter
	 * @param hersteller
	 * @param identifizierungParameter
	 * @param hoechstGeschwindigkeitParameter
	 */
	public Sportwagen(int baujahrParameter, String hersteller,
			int identifizierungParameter, int hoechstGeschwindigkeitParameter) {

		// Aufruf des Konstruktors aus der Vaterklasse
		super(baujahrParameter, hersteller, identifizierungParameter);

		this.hoechstGeschwindigkeit = hoechstGeschwindigkeitParameter;
	}

	/**
	 * Methode zum Tunen der Hoechstgeschwindigkeit
	 * 
	 * @param geschwindigkeit
	 */
	public void tuneHoechstgeschwindigkeit(int geschwindigkeit) {
		this.hoechstGeschwindigkeit = geschwindigkeit;
	}

	/**
	 * Gibt die Hoechstgeschwindigkeit wieder
	 * 
	 * @return
	 */
	public int getHoechstgeschwindigkeit() {
		return this.hoechstGeschwindigkeit;
	}

	/**
	 * Wir überschreiben die Methode zeigeDaten
	 */
	@Override
	public void zeigeDaten() {
		System.out.println("Hersteller: " + this.getHersteller()
				+ ", Hoechstgeschwindigkeit: "
				+ this.getHoechstgeschwindigkeit());
	}
}
