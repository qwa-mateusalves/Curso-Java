import java.util.Locale;
import java.util.Scanner;

//exercicio 1
//public class estrutura_condicional {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		
//		int number = sc.nextInt();
//		
//		if (number >= 0) {
//			System.out.println("NAO NEGATIVO");
//		}
//		else {
//			System.out.println("NEGATIVO");
//		}
//		
//		sc.close();
//
//	}
//
//}

//exercicio 2
//public class estrutura_condicional {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		
//		int number = sc.nextInt();
//		
//		if (number % 2 == 0) {
//			System.out.println("PAR");
//		}
//		else {
//			System.out.println("IMPAR");
//		}
//		
//		sc.close();
//
//	}
//
//}


//exercicio 3
//public class estrutura_condicional {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		
//		if (A % B == 0 || B % A == 0) {
//			System.out.println("Sao Multiplos");
//			}
//		else {
//			System.out.println("Nao sao Multiplos");
//		}
//		sc.close();
//
//	}
//
//}

//exercicio 4
//public class estrutura_condicional {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		int horaInicial = sc.nextInt();
//		int horaFinal = sc.nextInt();
//		
//		int duracao;
//		if (horaInicial < horaFinal) {
//			duracao = horaFinal - horaInicial;
//		}
//		else {
//			duracao = 24 - horaInicial + horaFinal;
//		}
//		
//		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
//		
//		sc.close();
//
//	}
//
//}

//exercicio 5
//public class estrutura_condicional {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		int codigo= sc.nextInt();
//		int qntd = sc.nextInt();
//		
//		if (codigo == 1) {
//			double resultado = qntd * 4.00;
//			System.out.printf("Total: %.2f", resultado);
//		}
//		else if (codigo == 2){
//			double resultado = qntd * 4.50;
//			System.out.printf("Total: %.2f", resultado);
//		}
//		else if (codigo == 3) {
//			double resultado = qntd * 5.00;
//			System.out.printf("Total: %.2f", resultado);
//		}
//		else if (codigo == 4) {
//			double resultado = qntd * 2.00;
//			System.out.printf("Total: %.2f", resultado);
//		}
//		else {
//			double resultado = qntd * 1.50;
//			System.out.printf("Total: %.2f", resultado);
//		}
//		
//		sc.close();
//
//	}
//
//}

//exercicio 6
//public class estrutura_condicional {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		double verifyNumber = sc.nextDouble();
//		
//		if (verifyNumber >= 0 && verifyNumber <=25) {
//			System.out.println("Intervalo [0,25]");
//		}
//		else if (verifyNumber > 25 && verifyNumber <=50) {
//			System.out.println("Intervalo [25,50]");
//		}
//		else if (verifyNumber > 50 && verifyNumber <=75) {
//			System.out.println("Intervalo [50,75]");
//		}
//		else if (verifyNumber > 75 && verifyNumber <=100) {
//			System.out.println("Intervalo [25,50]");
//		}
//		else {
//			System.out.println("Fora de intervalo");
//		}
//		
//		sc.close();
//
//	}
//
//}

//exercicio 7
//public class estrutura_condicional {
//
//	public static void main(String[] args) {
//
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//
//		double x = sc.nextDouble();
//		double y = sc.nextDouble();
//		
//		if (x == 0.0 && y == 0.0) {
//			System.out.println("Origem");
//		}
//		else if (x > 0.0 && y > 0.0){
//			System.out.println("Q1");
//		}
//		else if (x > 0.0 && y < 0.0) {
//			System.out.println("Q4");
//		}
//		else if (x < 0.0 && y < 0.0) {
//			System.out.println("Q3");
//		}
//		else {
//			System.out.println("Q2");
//		}
//		
//		sc.close();
//
//	}
//}
