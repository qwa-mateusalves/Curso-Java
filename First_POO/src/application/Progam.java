package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Progam {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee person = new Employee();
		System.out.print("Name: ");
		person.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		person.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		person.tax = sc.nextDouble();
	
		System.out.println("Employee: " + person.toString());
		
		System.out.print("Wich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		person.increaseSalary(percentage);
		
		System.out.println("Updated data: " + person.toString());
		
		sc.close();
	}

}
