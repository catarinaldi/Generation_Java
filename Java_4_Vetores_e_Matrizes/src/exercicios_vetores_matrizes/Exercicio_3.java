package exercicios_vetores_matrizes;

import java.util.Scanner;

public class Exercicio_3 {
	/*Programa 3 - Matriz
	 * Autore: catarina
	 * Data: 13/12/2021
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double [][] N1 = new double [4][6];
		double [][] N2 = new double [4][6]; 
		double [][] M1 = new double [4][6];
		double [][] M2 = new double [4][6];
		int l = 0, c = 0, h = 0, j = 3, k = 5;
				
		for (l = h; l <= j; l++){
			for  (c = h; c <= k; c++){
				System.out.println("Escreva o valor da N1: ");
				(N1[l][c]) = scanner.nextDouble();
			}
		}

		for  (l = h; l <= j; l++){
			for  (c = h; c <= k; c++){
				System.out.println("Escreva o valor da N2: ");
				(N2[l][c]) = scanner.nextDouble();
			}
		}
					
		System.out.println("SOMA: ");
			
		for  (l = h; l <= j; l++){
			for  (c = h; c <= k; c++){
				M1[l][c] = N1[l][c] + N2[l][c];
				System.out.print("| " + M1[l][c] + " | ");
			}
			System.out.println();
		}				
			
		System.out.println("SUBTRAÇÃO: ");
				
		for  (l = h; l <= j; l++){
			for  (c = h; c <= k; c++){
				M2[l][c] = N1[l][c] - N2[l][c];
				System.out.print("| " + M2[l][c] + " | ");
			}
			System.out.println();
		}		

		scanner.close();
	}

}
