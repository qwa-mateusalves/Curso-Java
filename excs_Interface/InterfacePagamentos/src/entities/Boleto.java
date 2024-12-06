package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Boleto extends Pagamento{
	
	private int codigo;
	private Date dataVencimento;
	
	public Boleto(int codigo, Date dataVencimento) {
		this.codigo = codigo;
		this.dataVencimento = dataVencimento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	public void pagar(double valor, int quantidade, Date dataVencimento) {
		
				
	}

}
