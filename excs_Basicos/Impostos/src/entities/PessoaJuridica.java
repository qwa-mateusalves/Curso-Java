package entities;

public class PessoaJuridica extends Pessoa{
	
	private int nFuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, double renda, int nFuncionarios) {
		super(nome, renda);
		this.nFuncionarios = nFuncionarios;
	}

	public int getnFuncionarios() {
		return nFuncionarios;
	}

	public void setnFuncionarios(int nFuncionarios) {
		this.nFuncionarios = nFuncionarios;
	}

	@Override
	public double imposto() {
		if (nFuncionarios > 10) {
			return super.getRenda() * 14/100;
		}
		else {
			return super.getRenda() * 16/100;
		}
		
	}

}
