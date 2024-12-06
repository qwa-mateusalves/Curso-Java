package entities;

public class Pix extends Pagamento{
	
	private double valor;
	private int quntidade;
	
	public double pagar(double valor, int quantidade) {
		return valor * quantidade;
	}

}
