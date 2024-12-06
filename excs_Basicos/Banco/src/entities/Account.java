package entities;

public class Account {
	
	private String name;
	private int numberAccount;
	private double saldo;
	
	public Account(String name, int numberAcount, double startMoney) {
		this.name = name;
		this.numberAccount = numberAcount;
		deposito(startMoney);
	}
	
	public Account(String name, int numberAcount) {
		this.name = name;
		this.numberAccount = numberAcount;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void saque(double valor) {
		saldo = saldo - valor - 5;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public String getInfos() {
		return "Account: " + numberAccount +
				", Holder: "+ name +
				", Balance: $" + String.format("%.2f", saldo);
	}
}
