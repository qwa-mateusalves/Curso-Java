package entities;

public class PessoaFisica extends Pessoa{

	private double gastoSaude;
	
	 
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, double renda, double gastoSaude) {
		super(nome, renda);
		this.gastoSaude = gastoSaude;
	}
	
	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double imposto() {
		
		if (super.getRenda() > 20000) {
			return (super.getRenda() * 25/100) - (gastoSaude * 50/100);
		}
		else {
			return (super.getRenda() * 15/100) - (gastoSaude * 50/100);
		}
		
	}
}
