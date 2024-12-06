package application;

import java.util.Scanner;

import entities.Pessoa;

//import entities.Pessoa;

//public class Program {
//
//	public static void main(String[] args) {
//		
//		Scanner sc =  new Scanner(System.in);
//		
//		System.out.print("Digite o número de posições do vetor: ");
//		int n = sc.nextInt();
//		int[] vec = new int [n];
//		
//		for (int i=0; i<vec.length; i++) {
//			System.out.print("Digite um número: ");
//			vec[i] = sc.nextInt();
//		}
//
//		System.out.println("NUMEROS NEGATIVOS");
//		
//		for (int i=0; i<vec.length; i++) {	
//			if(vec[i] < 0) {
//				System.out.printf("%d\n", vec[i]);
//			}
//		}
//		
//		sc.close();
//		
//	}
//
//}

//public class Program {
//
//	public static void main(String[] args) {
//		
//		Scanner sc =  new Scanner(System.in);
//		
//		System.out.print("Quantos números você vai digitar? ");
//		int n = sc.nextInt();
//		int[] vec = new int [n];
//		int sum = 0;
//		
//		for (int i=0; i<vec.length; i++) {
//			System.out.print("Digite um número: ");
//			vec[i] = sc.nextInt();
//		}
//		
//		for (int i=0; i<vec.length; i++) {
//			System.out.printf("%d\n", vec[i]);
//			sum += vec[i];
//			}
//			
//		double media = sum/n;
////		
//		System.out.println("SOMA: " + sum);
//		System.out.println("MEDIA: " + media);
//		sc.close();
//		}		
//		
//	}


//incompleto
//public class Program {
//
//	public static void main(String[] args) {
//		
//		Scanner sc =  new Scanner(System.in);
//		
//		System.out.print("Quantos pessoas você vai digitar? ");
//		int n = sc.nextInt();
//		int[] vec = new int [n];
//		
//		Pessoa[] pessoas = new Pessoa[n];
//		
//		for (int i=1; i<=vec.length; i++) {
//			System.out.printf("Dados da %da pessoa: ",i);
//			String name = sc.nextLine(); 
//			double idade = sc.nextDouble();
//			double altura = sc.nextDouble();
//			pessoas[i] = new Pessoa(name, idade, altura);
//			
//		}
//		
//		System.out.println(pessoas[0].getName());
//		
////		for (int i=0; i<vec.length; i++) {
////			System.out.printf("%d\n", vec[i]);
////			}
//			
//		sc.close();
//		}			
//	}




//public class Program {
//
//	public static void main(String[] args) {
//		
//		Scanner sc =  new Scanner(System.in);
//		
//		System.out.print("Quantos pessoas você vai digitar? ");
//		int n = sc.nextInt();
//		int[] vec = new int [n];
//		int[] pares = new int[1];
//		
//		for (int i=0; i<vec.length; i++) {
//			System.out.print("Digite um número: ");
//			vec[i] = sc.nextInt();
//		}
//
//		System.out.println("NUMEROS PARES");
//		
//		for (int i=0; i<vec.length; i++) {	
//			if(vec[i]%2 == 0) {
//				pares[0] += 1; 
//				System.out.printf("%d\n", vec[i]);
//			}
//		}
//		System.out.print("QUANTIDADE DE PARES: ");
//		System.out.print(pares[0]);
//		sc.close();
//		
//	}
//}

//tem mais de vetores

public class Program {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Quantos quartos vão ser alugados? ");
		int n = sc.nextInt();
		Pessoa[] quartos = new Pessoa[10];
		
		for (int i=0; i<n; i++) {
			System.out.println();
			System.out.println("Insira os dados da pessoa");
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Quarto: ");
			int nQuarto = sc.nextInt();
			
			quartos[nQuarto] = new Pessoa(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos alugados");
		for (int i=0; i<10; i++) {
			if(quartos[i] != null) {
				System.out.println(i + ": " + quartos[i]);
			}
		}
		
		
		sc.close();		
	}
}


