package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();
		
		System.out.print("Insira o número de funcionários: ");
		int n = sc.nextInt();
		
		
		for (int i=1; i<=n; i++) {
			
			System.out.println("Funcionário #" + i + ":");
			System.out.print("Terceirizado (s/n): ");
			
			char response = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Horas: ");
			int hours = sc.nextInt();
			
			System.out.print("Valor por horas: ");
			double valuePerHour= sc.nextDouble();
			
			if (response == 's') {
				
				System.out.print("Custo adicional: ");
				double additionalValue = sc.nextDouble(); 
				
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalValue));
			}
			else {
				
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println("Pagamentos:");
		for (Employee emp : list){
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
			
		}
		
		sc.close();
	}

}
