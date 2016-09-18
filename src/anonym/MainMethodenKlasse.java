package anonym;

/**
 * 
 * @author keinmark
 * 
 */
public class MainMethodenKlasse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Minuten-Konverter
		TestConverter tc = new MinutenConverter();

		// Konvertieren
		int convert = tc.convert(60);

		System.out.println(convert);

		// Anonymer Test-Konverter, der Stunden konvertiert
		TestConverter tcAnonym = new TestConverter() {

			@Override
			public int convert(int sekunden) {
				return sekunden / 60 / 60;
			}

		};

		System.out.println(tcAnonym.convert(3600));

	}
}
