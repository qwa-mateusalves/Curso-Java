package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> CourseA = new HashSet<>();
		Set<Integer> CourseB = new HashSet<>();
		Set<Integer> CourseC = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			int idStudent = sc.nextInt();
			CourseA.add(idStudent);
		}
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			int idStudent = sc.nextInt();
			CourseB.add(idStudent);
		}
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for (int i=1; i<=n; i++){
			int idStudent = sc.nextInt();
			CourseC.add(idStudent);
		}
		
		Set<Integer> allCourses = new HashSet<>(CourseA);
		allCourses.addAll(CourseB);
		allCourses.addAll(CourseC);
		
		System.out.print("Total students: " + allCourses.size());
		
		sc.close();
	}

}
