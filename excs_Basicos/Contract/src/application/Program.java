package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Informe o departamento: ");
		String departament = sc.next();
		
		System.out.println("Informe os dados abaixo:");
		System.out.print("Nome: ");
		String name = sc.next();
		System.out.print("Level: ");
		String workLevel = sc.next();
		System.out.print("Base Salarial: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(workLevel), baseSalary, new Department(departament));
		System.out.println(worker.toString());
		
		System.out.print("Digite o número de contratos: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n;i++) {
			System.out.println("Contrato #" + i);
			System.out.print("Data (DD/MM/YYYY) ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();	
			System.out.print("Horas: ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
			
		}
		
		System.out.println();
		System.out.print("Insira o valor que gostaria de ver o salário (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Nome: " + worker.getName());
		System.out.println("Departmento: " + worker.getDepartment().getName());
		System.out.println("Na data de " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
		

	}

}
