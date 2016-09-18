package dip.dienst;

import dip.Schaltbar;

public class Lampe implements Schaltbar {
	private boolean leuchten = false;

	public void leuchte() {
		leuchten = true;
	}

	public void dunkel() {
		leuchten = false;
	}

	@Override
	public void anschalten() {
		leuchte();
	}

	@Override
	public void ausschalten() {
		dunkel();
	}
}
