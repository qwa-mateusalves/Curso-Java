package application;

import java.util.Locale;
import java.util.Scanner;

import service.BrazilInterestService;
import service.InterestService;
import service.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Quantia: ");
			double amount = sc.nextDouble();
			System.out.print("Meses: ");
			int months = sc.nextInt();
			
			InterestService brazilService = new BrazilInterestService(2);
			InterestService usa = new UsaInterestService(1);
			
			System.out.println("Pagamento após 3 meses:");
			System.out.println(String.format("%.2f", brazilService.payment(amount, months)));
			
			System.out.println("Pagamento após 3 meses:");
			System.out.println(String.format("%.2f", usa.payment(amount, months)));
		}
		catch (Exception e) {
			System.out.println("Invalid months number: " + e.getMessage());
		}
		finally{
			sc.close();
		}
	}

}
