package anonym;

/**
 * Minuten-Konverter, implementiert unser Interface
 * 
 * @author keinmark
 * 
 */
public class MinutenConverter implements TestConverter {

	@Override
	public int convert(int sekunden) {
		return sekunden / 60;
	}

}
