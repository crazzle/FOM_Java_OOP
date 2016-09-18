package exceptions;

/**
 * Unsere Exception
 * 
 * @author keinmark
 * 
 */
public class EingabeFehlerException extends Exception {

	@Override
	public String getMessage() {
		return "Falsche Eingabe";
	}

}
