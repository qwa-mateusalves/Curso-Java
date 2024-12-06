import java.util.Scanner;


//exercicio 1
//public class estrutura_while {
//
//	public static void main(String[] args) {
//		
//		int safe_code = 2002;
//		
//		Scanner sc = new Scanner (System.in);
//		
//		int senha =  sc.nextInt();
//		
//		while(senha != safe_code) {
//			System.out.println("Senha Invalida");
//			senha = sc.nextInt();			
//		}
//		
//		System.out.println("Acesso Permitido");
//		
//		sc.close();
//	}
//
//}

//exercicio 2
//public class estrutura_while {
//
//	public static void main(String[] args) {
//				
//		Scanner sc = new Scanner (System.in);
//		
//		int x =  sc.nextInt();
//		int y =  sc.nextInt();
//		
//		while(x != 0 && y != 0) {
//			if (x > 0 && y > 0){
//				System.out.println("Primeiro");
//			}
//			else if (x > 0 && y < 0) {
//				System.out.println("Quarto");
//			}
//			else if (x < 0 && y < 0) {
//				System.out.println("Terceiro");
//			}
//			else {
//				System.out.println("Segundo");
//			}
//			x = sc.nextInt();
//			y = sc.nextInt();
//		}
//		
//		sc.close();
//	}
//}

//exercicio 3
//public class estrutura_while {
//
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner (System.in);
//		
//		int valor =  sc.nextInt();
//		int alcool = 0;
//		int gasolina = 0;
//		int diesel = 0;
//				
//		
//		while(valor != 4) {
//			if (valor == 1) {
//				alcool = alcool + 1;
//			}
//			else if (valor == 2) {
//				gasolina = gasolina + 1;
//			}
//			else if (valor == 3) {
//				diesel = diesel + 1;
//			}
//			else {
//				System.out.println("Digite um valor válido");
//			}
//			valor = sc.nextInt();			
//		}
//		
//		System.out.println("MUITO OBRIGADO");
//		System.out.printf("Alcool %d%n", alcool);
//		System.out.printf("Gasolina %d%n", gasolina);
//		System.out.printf("Diesel %d%n", diesel);
//		
//		sc.close();
//	}
//
//}