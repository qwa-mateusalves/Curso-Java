import java.util.Scanner;

//exercicio 1 
//public class estrtutura_for {
//
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//
//		int x = sc.nextInt();
//		
//		for (int i=1; i<=x; i++) {
//			if (i % 2 != 0) {
//				System.out.println(i);
//			}
//		}
//		
//		sc.close();
//	}
//
//}

//exercicio 2 
//public class estrtutura_for {
//
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//
//		int N = sc.nextInt();
//		int in = 0;
//		int out = 0;
//		
//		for (int i=1; i<=N; i++) {
//			int X = sc.nextInt();
//			if (X >= 10 && X <= 20) {
//				in += 1;
//			}
//			else {
//				out += 1;
//			}
//		}
//		
//		System.out.println(in + " in");
//		System.out.println(out + " out");
//		
//		sc.close();
//	}
//
//}

//exercicio 3
//public class estrtutura_for {
//
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//
//		int qntd = sc.nextInt();
//		
//		for (int i=1; i<=qntd; i++) {
//			
//			double a = sc.nextDouble();
//			double b = sc.nextDouble();
//			double c = sc.nextDouble();
//
//			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
//
//			System.out.printf("%.1f%n", media);
//		}
//		
//		sc.close();
//	}
//
//}

////exercicio 4
//public class estrtutura_for {
//
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//
//		int qntd = sc.nextInt();
//		
//		for (int i=1; i<=qntd; i++) {
//			
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//
//			if (b != 0) {
//			double resultado = a/b;
//
//			System.out.println(resultado);
//			}
//			else {
//				System.out.println("divisão impossivel");
//			}
//		}
//		
//		sc.close();
//	}
//
//}

//exercicio 5
//public class estrtutura_for {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		int n = sc.nextInt();
//		
//		int fat = 1;
//		for (int i=1; i<=n; i++) {
//			fat = fat * i;
//		}
//		
//		System.out.println(fat);
//		
//		sc.close();
//	}
//}
// exercicio 6
//public class estrtutura_for {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		int entrada = sc.nextInt();
//		//só para fazer a saida da forma que mostrava no exc
//		for (int i=entrada ; i<=entrada && i > 0; i--) {
//			int resultado = entrada/i;
//			if (entrada % i == 0) {
//				System.out.println(resultado);}
//		}
//			
//		sc.close();
//	}
//}
// exercicio 7
//public class estrtutura_for {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		int n = sc.nextInt();
//		
//		for (int i=1; i<=n; i++) {
//			
//			int first = i * i;
//			int second = i* i * i;
//			
//			System.out.printf("%d %d %d%n", i,first,second);
//		}
//			
//		sc.close();
//	}
//}