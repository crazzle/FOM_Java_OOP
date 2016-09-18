package oop.aufgaben.auto;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * Unser JUnit-Test für die Klasse Auto
 * 
 * @author keinmark
 * 
 */
// Aufgrund von Aufgabe 4 wurde die Konstruktoren von Auto um die
// Identifikationsnummer erweitert
public class AutoJUnitTest {

	private Auto meinTestAuto = new Auto(1988, "Ford", 0);

	/**
	 * @Before ist eine Annotation (Metadaten für eine Methode). Dadurch wird
	 *         die Methode vor jeden Test aufgerufen
	 */
	@Before
	public void init() {
		// Vor jedem Test setzen wir die Anzahl der Vorbesitzer von unserem Auto
		// wieder auf 3, damit sich die Tests nicht gegenseitig beeinflussen
		meinTestAuto.setAnzahlVorbesitzer(3);
	}

	/**
	 * Mit @Test wird eine Testmethode markiert.
	 */
	@Test
	public void testeMeinAutoValiderFall() {
		meinTestAuto.setAnzahlVorbesitzer(10);

		// Assert.equals testet 2 Werte auf gleichheit
		// der erste Parameter ist der erwartete Wert
		// der zweite Paramater der eigentliche Wert
		Assert.assertEquals(10, meinTestAuto.getAnzahlVorbesitzer());
	}

	/**
	 * Mit @Test wird eine Testmethode markiert.
	 */
	@Test
	public void testeMeinAutoNochEinValiderFall() {
		meinTestAuto.setAnzahlVorbesitzer(2);

		// Da die neue Anzahl kleiner ist als die alte Anzahl
		// muss der neue Wert weiterhin 3 sein
		Assert.assertEquals(3, meinTestAuto.getAnzahlVorbesitzer());
	}

}
