package exkurs.bitshift.effizienzvergleich.beispiel;

import exkurs.bitshift.effizienzvergleich.stoppuhr.Stoppuhr;

public class DivisionMitBitshift {
    static final Stoppuhr s = new Stoppuhr();
    static final Integer imax = 100000;

    public static void main(String[] args) {
	Integer i1 = 0;
	Integer i2 = 0;

	i1 = imax;
	s.start();
	while (i1 != 1) {
	    i1--;
	    i2 = Integer.MAX_VALUE;
	    while (i2 != 1) {
		i2 /= 2;
	    }
	}
	s.stopp();
	System.out.println("Dauer in Milliskeunden mit Divisionsoperator: "
		+ s.berechneDifferenz());

	s.init();

	i1 = imax;
	s.start();
	while (i1 != 1) {
	    i1--;
	    i2 = Integer.MAX_VALUE;
	    while (i2 != 1) {
		i2 = i2 >> 1;
	    }
	}
	s.stopp();
	System.out.println("Dauer in Millisekunden mit Bitshifts: "
		+ s.berechneDifferenz());

    }
}
