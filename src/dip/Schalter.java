package dip;

import dip.dienst.Lampe;

public class Schalter {
	private Schaltbar schaltbar = new Lampe();

	public void anschalten() {
		schaltbar.anschalten();
	}

	public void ausschalten() {
		schaltbar.ausschalten();
	}
}
