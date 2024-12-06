package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Insira seu nome: ");
		String name = sc.nextLine();
		System.out.print("Insira o numero da conta: ");
		int numberAccount = sc.nextInt();
		System.out.print("Deseja incluir um deposito inicial (s/n)? ");
		char response = sc.next().charAt(0);
		
		if (response == 's') {
			System.out.print("Insira um valor de depósito inicial:");
			double startMoney = sc.nextDouble();
			account = new Account(name,numberAccount,startMoney);
		}
		else {
			account = new Account(name, numberAccount);
		}
		
		System.out.println();
		System.out.println("Informações da conta:");
		System.out.println(account.getInfos());
		
		System.out.println();
		System.out.print("Insira um valor de depósito:");
		double valorDeposito = sc.nextDouble();
		account.deposito(valorDeposito);
		System.out.println("Informações da conta:");
		System.out.println(account.getInfos());
		
		System.out.println();
		System.out.print("Insira um valor para o saque:");
		double valorSaque = sc.nextDouble();
		account.saque(valorSaque);
		System.out.println("Informações da conta:");
		System.out.println(account.getInfos());
		
		
		sc.close();
		
		
	}

}
