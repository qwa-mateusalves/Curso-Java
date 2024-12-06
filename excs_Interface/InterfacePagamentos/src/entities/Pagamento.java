package entities;

import service.FormaPagamento;

public abstract class Pagamento implements FormaPagamento{
	
	private String tipoPagamento;
	private double valor;

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public double pagar(double valor, int quantidade) {
		return valor * quantidade;
	}
	
}
