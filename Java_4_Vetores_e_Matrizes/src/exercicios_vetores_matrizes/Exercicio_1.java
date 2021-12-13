package exercicios_vetores_matrizes;

import java.util.Scanner;

public class Exercicio_1 {
	/*Programa 1 - Vetor
	 * Autore: catarina
	 * Data: 13/12/2021
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] vetor = new int[5];
		int maior = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite a " + (i+1) + "ª nota: ");
			vetor[i] = scanner.nextInt();
			if (vetor[i] >= maior) {
				maior = vetor[i];
			}
		}
		
		System.out.println("As notas digitadas foram: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " | ");
		}
		System.out.print("\nA maior nota foi: " + maior + "!");
		
		scanner.close();
	}

}
