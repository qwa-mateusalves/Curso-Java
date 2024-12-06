//package application;
//
//import java.util.Scanner;
//
//public class Program {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		int[][] mat = new int[n][n];
//		int count = 0;
//		
//		
//		
//		for (int i=0; i<mat.length; i++) {
//			for (int j=0; j<mat[i].length; j++) {
//				mat[i][j] = sc.nextInt();
//				if (mat[i][j] < 0) {
//					count ++;
//				}
//			}
//		}
//		
//		System.out.println("Main diagonal:");
//		for (int i=0; i<mat.length; i++) {
//			System.out.print(mat[i][i] + " ");
//		}
//		System.out.println();
//		
////		for (int i=0; i<mat.length; i++) {
////			for (int j=0; j<mat[i].length; j++) {
////				if (mat[i][j] < 0) {
////					count++;
////				}
////			}
////		}
//		System.out.println("Negative numbers = " + count);
//		
//		
//		sc.close();
//	}
//}

package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mat = new int[n][m];
		int count = 0;
		
		
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
				if (mat[i][j] < 0) {
					count ++;
				}
			}
		}
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
				if (i>1) {
				System.out.println("teste teste");
				System.out.println(mat[i-1][j]);
				
				}
			}
		}
		System.out.println();
		
		System.out.println("Negative numbers = " + count);
		
		
		
		
		sc.close();
	}
}