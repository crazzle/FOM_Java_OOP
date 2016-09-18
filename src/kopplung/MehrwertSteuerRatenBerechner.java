package kopplung;

/**
 * 
 * @author keinmark
 * 
 */
public class MehrwertSteuerRatenBerechner {

	public float getRateFuerDeutschland() {
		float toReturn = 0F;

		MehrwertSteuerProgramm mwstProgramm = new MehrwertSteuerProgramm();

		float deutscherSatz = mwstProgramm.getDeutschenMehrwertSteuersatz();

		toReturn = deutscherSatz + 1;

		return toReturn;
	}

}
