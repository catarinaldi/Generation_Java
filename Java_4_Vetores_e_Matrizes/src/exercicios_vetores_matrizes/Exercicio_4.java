package exercicios_vetores_matrizes;

import java.util.Scanner;

public class Exercicio_4 {
	/*Programa 4 - Matriz
	 * Autore: catarina
	 * Data: 13/12/2021
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double [][] matriz = new double[3][3];
		int l = 0, c = 0, soma = 0, somaDiag = 0;
					
		for (l = 0; l <= 2; l++){
			for (c = 0; c <= 2; c++){
				System.out.println("Escreva o valor: ");
				(matriz[l][c]) = scanner.nextDouble();
			}
		}
					
		for (l = 0; l <= 2; l++){
			for (c = 0; c <= 2; c++){
				System.out.print("| " + matriz[l][c] + " | ");
				soma += matriz[l][c];		
				if (l == c){
					somaDiag += matriz[l][c];
				}
			}
			System.out.println();
		}
					
		System.out.println("A soma dos valores da matriz é igual a: " + soma);
		System.out.println("A soma da diagonal da matriz é igual a: " + somaDiag);

		scanner.close();
	}
}
