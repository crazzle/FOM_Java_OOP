package exkurs.bitshift.effizienzvergleich.beispiel;

import exkurs.bitshift.effizienzvergleich.stoppuhr.Stoppuhr;

public class VergleichBitShift {

    public static void main(String[] args) {

	Stoppuhr s = new Stoppuhr();

	s.start();
	for (int i = 0; i < Integer.MAX_VALUE; i++) {
	    int x = i / 2;
	}
	s.stopp();
	System.out.println(s.berechneDifferenz());

	s.start();
	for (int i = 0; i < Integer.MAX_VALUE; i++) {
	    int x = i >> 2;
	}
	s.stopp();
	System.out.println(s.berechneDifferenz());

    }
}
