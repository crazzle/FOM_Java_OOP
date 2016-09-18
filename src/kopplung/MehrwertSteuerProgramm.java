package kopplung;

public class MehrwertSteuerProgramm {

	public float getDeutschenMehrwertSteuersatz() {
		return 0.19f;
	}

	public float berechneMehrwertSteuer(float wert) {
		float toReturn = 0f;

		MehrwertSteuerRatenBerechner mwstRatenRechner = new MehrwertSteuerRatenBerechner();

		float rate = mwstRatenRechner.getRateFuerDeutschland();

		toReturn = wert * rate;

		return toReturn;
	}
}
