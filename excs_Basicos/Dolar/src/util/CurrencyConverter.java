package util;

public class CurrencyConverter {

	public static final double IOF = 6;

	public static double priceReais(double dollarPrice, double manyDollars) {

		double preIof = dollarPrice * manyDollars;

		preIof += preIof * IOF / 100;

		return preIof;
	}
}