package exkurs.bitshift.effizienzvergleich.stoppuhr.converter;

public class SekundenConverterImpl implements IFavorisierteEinheitConverter {

	@Override
	public float convert(long t) {
		return t / 1000;
	}

}
