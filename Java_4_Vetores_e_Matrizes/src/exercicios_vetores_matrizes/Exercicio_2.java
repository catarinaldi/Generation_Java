package exercicios_vetores_matrizes;

import java.util.Scanner;

public class Exercicio_2 {
	/*Programa 2 - Vetor
	 * Autore: catarina
	 * Data: 13/12/2021
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double[] dado = new double[10];
		double maior = 0, quantasVezes = 0, media = 0;
		
		for (int i = 0; i < dado.length; i++) {
			System.out.println("Digite o " + (i+1) + "º valor do dado: ");
			dado[i] = scanner.nextDouble();
			media += dado[i] / dado.length;
			if (dado[i] > maior) {
				maior = dado[i];
				quantasVezes = 0;
			}
			if (maior == dado[i]) {
				quantasVezes++;
			}
		}
		
		System.out.println("Valores do dado:");
		for (int i = 0; i < dado.length; i++) {
			System.out.print(" | " + dado[i] + " | ");
		}
		
		System.out.println("\nA média dos lançamentos foi de: " + media);
		System.out.println("O número maior apareceu " + quantasVezes + " vezes");

		scanner.close();
	}
}
