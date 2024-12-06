package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Progam {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student person = new Student();
		
		System.out.print("Name: ");
		person.name = sc.nextLine();
		System.out.print("Nota primeiro trimestre: ");
		person.firs_period = sc.nextDouble();
		System.out.print("Nota segundo trimestre: ");
		person.second_period = sc.nextDouble();
		System.out.print("Nota terceiro trimestre: ");
		person.third_period = sc.nextDouble();
		
		System.out.println("GRADE FINAL = " + person.finalGrade());
		
		System.out.println(person.aprroved());
		System.out.println(person.missingPoints());

	}
}
