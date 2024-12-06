package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	try {
		System.out.println("Insira as informações da conta");
		System.out.print("Número: ");
		int number = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Proprietário: ");
		String holder = sc.nextLine();
		
		System.out.print("Depósito inicial: ");
		double initialBalance = sc.nextDouble();
		
		System.out.print("Limite de saque: ");
		double withdrawLimit= sc.nextDouble();
		
		Account account = new Account(number, holder, initialBalance, withdrawLimit);
		
		System.out.print("Digite a quantidade do saque: ");
		double amount = sc.nextDouble();
		
		account.withdraw(amount);
		
		System.out.println(account.getInitialBalance());
	}
	catch (DomainException e) {
		System.out.println("WithDraw Error: " + e.getMessage());
	}
	catch (RuntimeException e) {
		System.out.println("Unexpected error");
	}
	
	sc.close();
	
	}
}
