package entities;

import service.VerificacaoSeguranca;

public class CartaoCredito extends Pagamento implements VerificacaoSeguranca{

	private int nCartao; 
	private double limite; 
	private String proprietario;
	
	public CartaoCredito(int nCartao, double limite, String proprietario) {
		this.nCartao = nCartao;
		this.limite = limite;
		this.proprietario = proprietario;
	}

	public int getnCartao() {
		return nCartao;
	}

	public void setnCartao(int nCartao) {
		this.nCartao = nCartao;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	@Override
	public boolean autenticar(int nCartao, String user) {
		if (nCartao == this.nCartao && user == this.proprietario) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void pagar(double valor, int quantidade ,CartaoCredito cartao) {
		
		if (cartao.autenticar(nCartao, proprietario)== true) {
			double subTotal =  valor * quantidade;
			if (subTotal < limite) {
				System.out.println("compra aprovada");
			}else {
				System.out.println("limite insuficiente");
			}
		}
		else {
			System.out.println("Cartao nao aprovado");
		}
	}
	
}
